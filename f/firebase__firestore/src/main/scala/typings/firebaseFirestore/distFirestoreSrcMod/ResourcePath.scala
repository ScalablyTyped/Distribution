package typings.firebaseFirestore.distFirestoreSrcMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src", "_ResourcePath")
@js.native
open class ResourcePath ()
  extends typings.firebaseFirestore.distFirestoreSrcApiMod.ResourcePath
/* static members */
object ResourcePath {
  
  @JSImport("@firebase/firestore/dist/firestore/src", "_ResourcePath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def emptyPath(): typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyPath")().asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath]
  
  /**
    * Creates a resource path from the given slash-delimited string. If multiple
    * arguments are provided, all components are combined. Leading and trailing
    * slashes from all components are ignored.
    */
  inline def fromString(pathComponents: String*): typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(pathComponents.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath]
}
