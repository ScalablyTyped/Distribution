package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor", "ExternalEditor")
@js.native
class ExternalEditor () extends js.Object {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], fileOptions: IFileOptions) = this()
  def this(text: String, fileOptions: IFileOptions) = this()
  var createTemporaryFile: js.Any = js.native
  var determineEditor: js.Any = js.native
  var editor: IEditorParams = js.native
  var fileOptions: js.Any = js.native
  var lastExitStatus: Double = js.native
  val last_exit_status: Double = js.native
  var launchEditor: js.Any = js.native
  var launchEditorAsync: js.Any = js.native
  var readTemporaryFile: js.Any = js.native
  var removeTemporaryFile: js.Any = js.native
  var tempFile: String = js.native
  val temp_file: String = js.native
  var text: String = js.native
  def cleanup(): Unit = js.native
  def run(): String = js.native
  def runAsync(callback: StringCallback): Unit = js.native
}

/* static members */
@JSImport("external-editor", "ExternalEditor")
@js.native
object ExternalEditor extends js.Object {
  var splitStringBySpace: js.Any = js.native
}

