package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the paragraph style settings.
  */
trait ParagraphStyle extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    * Value: A <see cref="CharacterStyle" /> object representing a character style linked to a current style.
    */
  var linkedStyle: CharacterStyle
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    * Value: An integer value specifying the list item index.
    */
  var listIndex: Double
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    * Value: An integer that is the list level index.
    */
  var listLevelIndex: Double
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    * Value: A <see cref="ParagraphStyle" /> object specifying the style for the next paragraph.
    */
  var nextStyle: ParagraphStyle
  /**
    * Gets or sets the style from which the current style inherits.
    * Value: A <see cref="ParagraphStyle" /> object representing the parent style.
    */
  var parent: ParagraphStyle
}

object ParagraphStyle {
  @scala.inline
  def apply(
    isDeleted: Boolean,
    linkedStyle: CharacterStyle,
    listIndex: Double,
    listLevelIndex: Double,
    name: String,
    nextStyle: ParagraphStyle,
    parent: ParagraphStyle
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted, linkedStyle = linkedStyle, listIndex = listIndex, listLevelIndex = listLevelIndex, name = name, nextStyle = nextStyle, parent = parent)
  
    __obj.asInstanceOf[ParagraphStyle]
  }
}

