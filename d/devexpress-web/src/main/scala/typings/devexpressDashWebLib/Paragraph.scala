package typings
package devexpressDashWebLib

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
  var index: scala.Double
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the paragraph's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: scala.Double
  /**
    * Gets the index of a list applied to the paragraph.
    * Value: An integer that is the index of a list to which the paragraph belongs.
    */
  var listIndex: scala.Double
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    * Value: An integer that is the index of the list level of the current paragraph.
    */
  var listLevelIndex: scala.Double
  /**
    * Gets the paragraph's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see name).
    * Value: A string value specifying the style name.
    */
  var styleName: java.lang.String
}

