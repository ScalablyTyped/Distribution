package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Repository")
@js.native
class Repository protected () extends StObject {
  def this(gitDirectory: js.Any) = this()
  def this(gitDirectory: js.Any, options: js.Any) = this()
  
  var already_searched: js.Any = js.native
  
  def cat_file(sha: js.Any): js.Any = js.native
  
  def cat_file_size(sha: js.Any): Double = js.native
  
  def cat_file_type(sha: js.Any): js.Any = js.native
  
  def files_changed(treeSha1: js.Any, treeSha2: js.Any, pathLimiter: js.Any): Boolean = js.native
  
  def get_object_by_sha1(sha1: String): js.Any = js.native
  
  def get_raw_tree(sha: js.Any, recursive: js.Any): js.Any = js.native
  
  def get_raw_trees(sha: js.Any, path: js.Any): String = js.native
  
  def get_subtree(commitSha: js.Any, path: js.Any, callback: js.Function): Unit = js.native
  
  var git_directory: js.Any = js.native
  
  def in_loose(shaHex: js.Any, callback: js.Function): Unit = js.native
  
  def in_packs(shaHex: js.Any, callback: js.Function): Unit = js.native
  
  def list_tree(sha: js.Any): js.Any = js.native
  
  var loose: js.Any = js.native
  
  def ls_tree(sha: js.Any, paths: js.Any, recursive: js.Any): js.Any = js.native
  
  def ls_tree_path(sha: js.Any, path: js.Any, append: js.Any): js.Any = js.native
  
  def object_exists(sha1: js.Any, callback: js.Function): Unit = js.native
  
  var options: js.Any = js.native
  
  var packs: js.Any = js.native
  
  def put_raw_object(content: js.Any, `type`: js.Any, callback: js.Function): js.Any = js.native
  
  def quick_diff(tree1: js.Any, tree2: js.Any, path: js.Any, recurse: js.Any): js.Array[js.Any] = js.native
  
  def rev_list(sha: js.Any, options: js.Any, callback: js.Function): Unit = js.native
}
/* static members */
object Repository {
  
  @JSImport("git", "Repository")
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(dir: js.Any, bare: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(dir.asInstanceOf[js.Any], bare.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
