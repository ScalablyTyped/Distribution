package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section in the document.
  */
trait Section extends js.Object {
  /**
    * Provides access to the section's footers.
    */
  val footers: js.Array[HeaderFooter]
  /**
    * Provides access to the section's headers.
    */
  val headers: js.Array[HeaderFooter]
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  val interval: Interval
  /**
    * Gets the section's character length.
    */
  val length: Double
  /**
    * Gets the section's start position in the document.
    */
  val start: Double
}

object Section {
  @scala.inline
  def apply(
    footers: js.Array[HeaderFooter],
    headers: js.Array[HeaderFooter],
    interval: Interval,
    length: Double,
    start: Double
  ): Section = {
    val __obj = js.Dynamic.literal(footers = footers.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section]
  }
}

