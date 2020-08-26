package typings.devtoolsProtocol.mod.Protocol.DOMSnapshot

import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineTextBox extends js.Object {
  /**
    * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
    */
  var boundingBox: Rect = js.native
  /**
    * The number of characters in this post layout textbox substring. Characters that would be
    * represented as a surrogate pair in UTF-16 have length 2.
    */
  var numCharacters: integer = js.native
  /**
    * The starting index in characters, for this post layout textbox substring. Characters that
    * would be represented as a surrogate pair in UTF-16 have length 2.
    */
  var startCharacterIndex: integer = js.native
}

object InlineTextBox {
  @scala.inline
  def apply(boundingBox: Rect, numCharacters: integer, startCharacterIndex: integer): InlineTextBox = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], numCharacters = numCharacters.asInstanceOf[js.Any], startCharacterIndex = startCharacterIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineTextBox]
  }
  @scala.inline
  implicit class InlineTextBoxOps[Self <: InlineTextBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundingBox(value: Rect): Self = this.set("boundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumCharacters(value: integer): Self = this.set("numCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartCharacterIndex(value: integer): Self = this.set("startCharacterIndex", value.asInstanceOf[js.Any])
  }
  
}

