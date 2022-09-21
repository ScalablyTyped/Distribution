package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Tree")
@js.native
open class Tree protected () extends StObject {
  def this(repo: Any, id: Any, mode: Any, name: Any, contents: Any) = this()
  
  var basename: Any = js.native
  
  var contents: Any = js.native
  
  def find(file: String): Any = js.native
  
  var id: Any = js.native
  
  var mode: Any = js.native
  
  var name: Any = js.native
  
  var repo: Any = js.native
}
/* static members */
object Tree {
  
  @JSImport("git", "Tree")
  @js.native
  val ^ : js.Any = js.native
  
  inline def content_from_string(repo: Any, text: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("content_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(repo: Any, attributes: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def create(repo: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
