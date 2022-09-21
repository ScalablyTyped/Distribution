package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth", "ActionCodeURL")
@js.native
open class ActionCodeURL () extends StObject {
  
  /**
    * The API key of the email action link.
    */
  val apiKey: String = js.native
  
  /**
    * The action code of the email action link.
    */
  val code: String = js.native
  
  /**
    * The continue URL of the email action link. Null if not provided.
    */
  val continueUrl: String | Null = js.native
  
  /**
    * The language code of the email action link. Null if not provided.
    */
  val languageCode: String | Null = js.native
  
  /**
    * The action performed by the email action link. It returns from one of the types from
    * {@link ActionCodeInfo}
    */
  val operation: String = js.native
  
  /**
    * The tenant ID of the email action link. Null if the email action is from the parent project.
    */
  val tenantId: String | Null = js.native
}
/* static members */
object ActionCodeURL {
  
  @JSImport("@firebase/auth", "ActionCodeURL")
  @js.native
  val ^ : js.Any = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Parses the email action link string and returns an {@link ActionCodeURL} if the link is valid,
    * otherwise returns null.
    *
    * @param link  - The email action link string.
    * @returns The {@link ActionCodeURL} object, or null if the link is invalid.
    *
    * @public
    */
  inline def parseLink(link: String): ActionCodeURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLink")(link.asInstanceOf[js.Any]).asInstanceOf[ActionCodeURL | Null]
}
