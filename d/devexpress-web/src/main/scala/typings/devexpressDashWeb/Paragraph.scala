package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a paragraph in the document.
  */
trait Paragraph extends js.Object {
  /**
    * Gets the paragraph's index.
    * Value: An integer value specifying the paragraph's index.
    */
  var index: Double
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the paragraph's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: Double
  /**
    * Gets the index of a list applied to the paragraph.
    * Value: An integer that is the index of a list to which the paragraph belongs.
    */
  var listIndex: Double
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    * Value: An integer that is the index of the list level of the current paragraph.
    */
  var listLevelIndex: Double
  /**
    * Gets the paragraph's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: Double
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see name).
    * Value: A string value specifying the style name.
    */
  var styleName: String
}

object Paragraph {
  @scala.inline
  def apply(
    index: Double,
    interval: Interval,
    length: Double,
    listIndex: Double,
    listLevelIndex: Double,
    start: Double,
    styleName: String
  ): Paragraph = {
    val __obj = js.Dynamic.literal(index = index, interval = interval, length = length, listIndex = listIndex, listLevelIndex = listLevelIndex, start = start, styleName = styleName)
  
    __obj.asInstanceOf[Paragraph]
  }
}

