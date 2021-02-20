package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "FileIndex")
@js.native
class FileIndex protected () extends StObject {
  def this(repoPath: js.Any, callback: js.Function) = this()
  
  var all_files: js.Any = js.native
  
  var commit_index: js.Any = js.native
  
  var commit_order: js.Any = js.native
  
  def commits_for(file: js.Any, callback: js.Function): Unit = js.native
  
  def commits_from(commitSha: js.Any, callback: js.Function): Unit = js.native
  
  def count(commitSha: js.Any, callback: js.Function): Unit = js.native
  
  def count_all(callback: js.Function): Unit = js.native
  
  def files(commitSha: js.Any, callback: js.Function): Unit = js.native
  
  var index_file: js.Any = js.native
  
  def last_commits(commitSha: js.Any, filesMatcher: js.Any, callback: js.Function): Unit = js.native
  
  var repo_path: js.Any = js.native
  
  var sha_count: js.Any = js.native
  
  def sort_commits(shaArray: js.Array[_]): js.Array[_] = js.native
}
