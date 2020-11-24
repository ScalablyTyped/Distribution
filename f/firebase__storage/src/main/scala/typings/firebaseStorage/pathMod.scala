package typings.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  def child(path: String, childPath: String): String = js.native
  
  def lastComponent(path: String): String = js.native
  
  def parent(path: String): String | Null = js.native
}
