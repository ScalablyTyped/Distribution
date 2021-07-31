package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "GitFileOperations")
@js.native
class GitFileOperations () extends StObject
/* static members */
object GitFileOperations {
  
  @JSImport("git", "GitFileOperations")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fs_exist(dir: js.Any, path: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_exist")(dir.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fs_mkdir(dir: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_mkdir")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fs_read(path: js.Any, file: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_read")(path.asInstanceOf[js.Any], file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fs_rmdir_r(dir: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_rmdir_r")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fs_write(dir: js.Any, file: js.Any, content: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_write")(dir.asInstanceOf[js.Any], file.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def glob(path: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def glob(path: js.Any, files: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(path.asInstanceOf[js.Any], files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def glob_streaming(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("glob_streaming")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
