package typings.docxTemplates.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferStatus extends js.Object {
  var cmds: String
  var fInsertedText: Boolean
  var text: String
}

object BufferStatus {
  @scala.inline
  def apply(cmds: String, fInsertedText: Boolean, text: String): BufferStatus = {
    val __obj = js.Dynamic.literal(cmds = cmds.asInstanceOf[js.Any], fInsertedText = fInsertedText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferStatus]
  }
}

