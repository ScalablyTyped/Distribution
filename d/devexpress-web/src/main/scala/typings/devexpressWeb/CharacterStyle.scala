package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains characteristics of a character style in a document.
  */
trait CharacterStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: ParagraphStyle
  /**
    * Gets the style form which the current style inherits.
    */
  val parent: CharacterStyle
}

object CharacterStyle {
  @scala.inline
  def apply(isDeleted: Boolean, linkedStyle: ParagraphStyle, name: String, parent: CharacterStyle): CharacterStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterStyle]
  }
}

