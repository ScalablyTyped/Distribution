package typings.firebaseFirestore.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/internal", "_ResourcePath")
@js.native
open class ResourcePath ()
  extends StObject
     with BasePath[ResourcePath] {
  
  def canonicalString(): String = js.native
}
/* static members */
object ResourcePath {
  
  @JSImport("@firebase/firestore/dist/internal", "_ResourcePath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def emptyPath(): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[ResourcePath]
  
  /**
    * Creates a resource path from the given slash-delimited string. If multiple
    * arguments are provided, all components are combined. Leading and trailing
    * slashes from all components are ignored.
    */
  inline def fromString(pathComponents: String*): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ResourcePath]
}
