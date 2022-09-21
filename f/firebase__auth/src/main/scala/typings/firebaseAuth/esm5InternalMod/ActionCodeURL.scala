package typings.firebaseAuth.esm5InternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/dist/esm5/internal", "ActionCodeURL")
@js.native
open class ActionCodeURL protected ()
  extends typings.firebaseAuth.esm5Mod.ActionCodeURL {
  /**
    * @param actionLink - The link from which to extract the URL.
    * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
    *
    * @internal
    */
  def this(actionLink: String) = this()
}
/* static members */
object ActionCodeURL {
  
  @JSImport("@firebase/auth/dist/esm5/internal", "ActionCodeURL")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the email action link string and returns an {@link ActionCodeURL} if the link is valid,
    * otherwise returns null.
    *
    * @param link  - The email action link string.
    * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
    *
    * @public
    */
  inline def parseLink(link: String): typings.firebaseAuth.srcCoreActionCodeUrlMod.ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAuth.srcCoreActionCodeUrlMod.ActionCodeURL | Null]
}
