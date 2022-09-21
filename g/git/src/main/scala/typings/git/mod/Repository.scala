package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Repository")
@js.native
open class Repository protected () extends StObject {
  def this(gitDirectory: Any) = this()
  def this(gitDirectory: Any, options: Any) = this()
  
  var already_searched: Any = js.native
  
  def cat_file(sha: Any): Any = js.native
  
  def cat_file_size(sha: Any): Double = js.native
  
  def cat_file_type(sha: Any): Any = js.native
  
  def files_changed(treeSha1: Any, treeSha2: Any, pathLimiter: Any): Boolean = js.native
  
  def get_object_by_sha1(sha1: String): Any = js.native
  
  def get_raw_tree(sha: Any, recursive: Any): Any = js.native
  
  def get_raw_trees(sha: Any, path: Any): String = js.native
  
  def get_subtree(commitSha: Any, path: Any, callback: js.Function): Unit = js.native
  
  var git_directory: Any = js.native
  
  def in_loose(shaHex: Any, callback: js.Function): Unit = js.native
  
  def in_packs(shaHex: Any, callback: js.Function): Unit = js.native
  
  def list_tree(sha: Any): Any = js.native
  
  var loose: Any = js.native
  
  def ls_tree(sha: Any, paths: Any, recursive: Any): Any = js.native
  
  def ls_tree_path(sha: Any, path: Any, append: Any): Any = js.native
  
  def object_exists(sha1: Any, callback: js.Function): Unit = js.native
  
  var options: Any = js.native
  
  var packs: Any = js.native
  
  def put_raw_object(content: Any, `type`: Any, callback: js.Function): Any = js.native
  
  def quick_diff(tree1: Any, tree2: Any, path: Any, recurse: Any): js.Array[Any] = js.native
  
  def rev_list(sha: Any, options: Any, callback: js.Function): Unit = js.native
}
/* static members */
object Repository {
  
  @JSImport("git", "Repository")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(dir: Any, bare: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dir.asInstanceOf[js.Any], bare.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
