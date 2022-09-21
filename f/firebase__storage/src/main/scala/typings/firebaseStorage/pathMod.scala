package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def child(path: String, childPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(path.asInstanceOf[js.Any], childPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def lastComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lastComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parent(path: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(path.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
