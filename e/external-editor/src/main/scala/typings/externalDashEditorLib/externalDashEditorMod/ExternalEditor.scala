package typings
package externalDashEditorLib.externalDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor", "ExternalEditor")
@js.native
class ExternalEditor () extends js.Object {
  def this(text: java.lang.String) = this()
  var createTemporaryFile: js.Any = js.native
  var determineEditor: js.Any = js.native
  var editor: IEditorParams = js.native
  var lastExitStatus: scala.Double = js.native
  val last_exit_status: scala.Double = js.native
  var launchEditor: js.Any = js.native
  var launchEditorAsync: js.Any = js.native
  var readTemporaryFile: js.Any = js.native
  var removeTemporaryFile: js.Any = js.native
  var tempFile: java.lang.String = js.native
  val temp_file: java.lang.String = js.native
  var text: java.lang.String = js.native
  def cleanup(): scala.Unit = js.native
  def run(): java.lang.String = js.native
  def runAsync(callback: StringCallback): scala.Unit = js.native
}

/* static members */
@JSImport("external-editor", "ExternalEditor")
@js.native
object ExternalEditor extends js.Object {
  var splitStringBySpace: js.Any = js.native
}

