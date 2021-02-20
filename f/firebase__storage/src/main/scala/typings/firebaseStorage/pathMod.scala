package typings.firebaseStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/path", "child")
  @js.native
  def child(path: String, childPath: String): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/path", "lastComponent")
  @js.native
  def lastComponent(path: String): String = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/path", "parent")
  @js.native
  def parent(path: String): String | Null = js.native
}
