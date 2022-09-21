package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Diff")
@js.native
open class Diff protected () extends StObject {
  def this(
    repo: Any,
    aPath: Any,
    bPath: Any,
    aBlob: Any,
    bBlob: Any,
    aMode: Any,
    bMode: Any,
    newFile: Any,
    deletedFile: Any,
    diff: Any
  ) = this()
  
  var a_blob: Any = js.native
  
  var a_mode: Any = js.native
  
  var a_path: Any = js.native
  
  var b_blob: Any = js.native
  
  var b_mode: Any = js.native
  
  var b_path: Any = js.native
  
  var deleted_file: Any = js.native
  
  var diff: Any = js.native
  
  var new_file: Any = js.native
  
  var repo: Any = js.native
}
/* static members */
object Diff {
  
  @JSImport("git", "Diff")
  @js.native
  val ^ : js.Any = js.native
  
  inline def list_from_string(repo: Any, text: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
