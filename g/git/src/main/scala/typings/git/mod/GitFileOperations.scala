package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "GitFileOperations")
@js.native
class GitFileOperations () extends StObject
/* static members */
object GitFileOperations {
  
  @JSImport("git", "GitFileOperations.fs_exist")
  @js.native
  def fs_exist(dir: js.Any, path: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.fs_mkdir")
  @js.native
  def fs_mkdir(dir: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.fs_read")
  @js.native
  def fs_read(path: js.Any, file: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.fs_rmdir_r")
  @js.native
  def fs_rmdir_r(dir: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.fs_write")
  @js.native
  def fs_write(dir: js.Any, file: js.Any, content: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.glob")
  @js.native
  def glob(path: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "GitFileOperations.glob")
  @js.native
  def glob(path: js.Any, files: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "GitFileOperations.glob_streaming")
  @js.native
  def glob_streaming(path: js.Any): js.Any = js.native
}
