package typings
package epiceditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EpicEditor")
@js.native
class EpicEditor () extends js.Object {
  def this(options: EpicEditorOptions) = this()
  def edit(): scala.Unit = js.native
  def emit(event: java.lang.String): scala.Unit = js.native
  def enterFullscreen(): scala.Unit = js.native
  def exitFullscreen(): scala.Unit = js.native
  def exportFile(): js.Any = js.native
  def exportFile(filename: java.lang.String): js.Any = js.native
  def exportFile(filename: java.lang.String, `type`: java.lang.String): js.Any = js.native
  def getElement(element: java.lang.String): js.Any = js.native
  def getFiles(): js.Any = js.native
  def getFiles(filename: java.lang.String): js.Any = js.native
  def importFile(): scala.Unit = js.native
  def importFile(filename: java.lang.String): scala.Unit = js.native
  def importFile(filename: java.lang.String, content: java.lang.String): scala.Unit = js.native
  def is(state: java.lang.String): scala.Boolean = js.native
  def load(): EpicEditor = js.native
  def load(callback: js.Function): EpicEditor = js.native
  def on(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def open(filename: java.lang.String): js.Any = js.native
  def preview(): scala.Unit = js.native
  def reflow(): scala.Unit = js.native
  def reflow(`type`: java.lang.String): scala.Unit = js.native
  def remove(filename: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String): scala.Unit = js.native
  def removeListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def rename(oldName: java.lang.String, newName: java.lang.String): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def unload(): EpicEditor = js.native
  def unload(callback: js.Function): EpicEditor = js.native
}

