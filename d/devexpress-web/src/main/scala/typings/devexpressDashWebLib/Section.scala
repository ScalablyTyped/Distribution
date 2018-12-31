package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section in the document.
  */
trait Section extends js.Object {
  /**
    * Provides access to the section's footers.
    * Value: An array of HeaderFooter objects storing information about the section's footers.
    */
  var footers: js.Array[HeaderFooter]
  /**
    * Provides access to the section's headers.
    * Value: An array of HeaderFooter objects storing information about the section's headers.
    */
  var headers: js.Array[HeaderFooter]
  /**
    * Gets the text buffer interval occupied by the current section element.
    * Value: An <see cref="Interval" /> object specifying the interval settings.
    */
  var interval: Interval
  /**
    * Gets the section's character length.
    * Value: An integer value specifying the element length in characters.
    */
  var length: scala.Double
  /**
    * Gets the section's start position in the document.
    * Value: An integer value specifying the start position.
    */
  var start: scala.Double
}

