package typings.envDashEditor.envDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editor extends js.Object {
  var binary: String
  var id: String
  var isTerminalEditor: Boolean
  var keywords: js.Array[String]
  var name: String
  var paths: js.Array[String]
}

object Editor {
  @scala.inline
  def apply(
    binary: String,
    id: String,
    isTerminalEditor: Boolean,
    keywords: js.Array[String],
    name: String,
    paths: js.Array[String]
  ): Editor = {
    val __obj = js.Dynamic.literal(binary = binary, id = id, isTerminalEditor = isTerminalEditor, keywords = keywords, name = name, paths = paths)
  
    __obj.asInstanceOf[Editor]
  }
}

