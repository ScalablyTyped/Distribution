package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains characteristics of a character style in a document.
  */
trait CharacterStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    * Value: A <see cref="ParagraphStyle" /> object representing a paragraph style linked to a current style.
    */
  var linkedStyle: ParagraphStyle
  /**
    * Gets the style form which the current style inherits.
    * Value: A <see cref="CharacterStyle" /> object representing the parent style.
    */
  var parent: CharacterStyle
}

object CharacterStyle {
  @scala.inline
  def apply(isDeleted: Boolean, linkedStyle: ParagraphStyle, name: String, parent: CharacterStyle): CharacterStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted, linkedStyle = linkedStyle, name = name, parent = parent)
  
    __obj.asInstanceOf[CharacterStyle]
  }
}

