package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "FileIndex")
@js.native
open class FileIndex protected () extends StObject {
  def this(repoPath: Any, callback: js.Function) = this()
  
  var all_files: Any = js.native
  
  var commit_index: Any = js.native
  
  var commit_order: Any = js.native
  
  def commits_for(file: Any, callback: js.Function): Unit = js.native
  
  def commits_from(commitSha: Any, callback: js.Function): Unit = js.native
  
  def count(commitSha: Any, callback: js.Function): Unit = js.native
  
  def count_all(callback: js.Function): Unit = js.native
  
  def files(commitSha: Any, callback: js.Function): Unit = js.native
  
  var index_file: Any = js.native
  
  def last_commits(commitSha: Any, filesMatcher: Any, callback: js.Function): Unit = js.native
  
  var repo_path: Any = js.native
  
  var sha_count: Any = js.native
  
  def sort_commits(shaArray: js.Array[Any]): js.Array[Any] = js.native
}
