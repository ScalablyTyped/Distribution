package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains characteristics of a character style in a document.
  */
@js.native
trait CharacterStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: ParagraphStyle = js.native
  /**
    * Gets the style form which the current style inherits.
    */
  val parent: CharacterStyle = js.native
}

object CharacterStyle {
  @scala.inline
  def apply(isDeleted: Boolean, linkedStyle: ParagraphStyle, name: String, parent: CharacterStyle): CharacterStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterStyle]
  }
  @scala.inline
  implicit class CharacterStyleOps[Self <: CharacterStyle] (val x: Self) extends AnyVal {
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
    def setLinkedStyle(value: ParagraphStyle): Self = this.set("linkedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: CharacterStyle): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

