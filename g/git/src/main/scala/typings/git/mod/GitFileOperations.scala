package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "GitFileOperations")
@js.native
open class GitFileOperations () extends StObject
/* static members */
object GitFileOperations {
  
  @JSImport("git", "GitFileOperations")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fs_exist(dir: Any, path: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_exist")(dir.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fs_mkdir(dir: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_mkdir")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fs_read(path: Any, file: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_read")(path.asInstanceOf[js.Any], file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fs_rmdir_r(dir: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_rmdir_r")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fs_write(dir: Any, file: Any, content: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fs_write")(dir.asInstanceOf[js.Any], file.asInstanceOf[js.Any], content.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def glob(path: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def glob(path: Any, files: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(path.asInstanceOf[js.Any], files.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def glob_streaming(path: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("glob_streaming")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
}
