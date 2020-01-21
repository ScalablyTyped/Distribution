package typings.envEditor.mod

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
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Editor]
  }
}

