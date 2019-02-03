package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "GitFileOperations")
@js.native
class GitFileOperations () extends js.Object

/* static members */
@JSImport("git", "GitFileOperations")
@js.native
object GitFileOperations extends js.Object {
  def fs_exist(dir: js.Any, path: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_mkdir(dir: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_read(path: js.Any, file: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_rmdir_r(dir: js.Any, callback: js.Function): scala.Unit = js.native
  def fs_write(dir: js.Any, file: js.Any, content: js.Any, callback: js.Function): scala.Unit = js.native
  def glob(path: js.Any, callback: js.Function): scala.Unit = js.native
  def glob(path: js.Any, files: js.Any, callback: js.Function): scala.Unit = js.native
  def glob_streaming(path: js.Any): js.Any = js.native
}

