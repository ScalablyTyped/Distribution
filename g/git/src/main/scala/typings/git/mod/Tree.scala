package typings.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Tree")
@js.native
class Tree protected () extends js.Object {
  def this(repo: js.Any, id: js.Any, mode: js.Any, name: js.Any, contents: js.Any) = this()
  
  var basename: js.Any = js.native
  
  var contents: js.Any = js.native
  
  def find(file: String): js.Any = js.native
  
  var id: js.Any = js.native
  
  var mode: js.Any = js.native
  
  var name: js.Any = js.native
  
  var repo: js.Any = js.native
}
/* static members */
@JSImport("git", "Tree")
@js.native
object Tree extends js.Object {
  
  def content_from_string(repo: js.Any, text: js.Any, callback: js.Function): Unit = js.native
  
  def create(repo: js.Any, attributes: js.Any, callback: js.Function): Unit = js.native
  def create(repo: js.Any, callback: js.Function): Unit = js.native
}
