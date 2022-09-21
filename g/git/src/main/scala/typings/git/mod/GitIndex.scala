package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "GitIndex")
@js.native
open class GitIndex protected () extends StObject {
  def this(repo: Any) = this()
  
  def add(filePath: Any, data: Any): Unit = js.native
  
  def commit(message: Any, callback: js.Function): Unit = js.native
  def commit(message: Any, parents: Any, actor: Any, callback: js.Function): Unit = js.native
  def commit(message: Any, parents: Any, actor: Any, lastTree: Any, callback: js.Function): Unit = js.native
  def commit(message: Any, parents: Any, callback: js.Function): Unit = js.native
  
  var current_tree: Any = js.native
  
  def read_tree(tree: Any, callback: js.Function): Unit = js.native
  
  var repo: Any = js.native
  
  var tree: Any = js.native
  
  def write_blob(data: Any): Any = js.native
  
  def write_tree(tree: Any, callback: js.Function): Any = js.native
  def write_tree(tree: Any, nowTree: Any, callback: js.Function): Any = js.native
}
