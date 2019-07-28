package typings.envDashEditor.envDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("env-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allEditors(): js.Array[Editor] = js.native
  def defaultEditor(): Editor = js.native
  def getEditor(editor: String): Editor = js.native
}

