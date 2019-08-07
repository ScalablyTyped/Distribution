package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section in the document.
  */
@JSGlobal("Section")
@js.native
class Section () extends js.Object {
  /**
    * Provides access to the section's footers.
    */
  val footers: js.Array[HeaderFooter] = js.native
  /**
    * Provides access to the section's headers.
    */
  val headers: js.Array[HeaderFooter] = js.native
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  val interval: Interval = js.native
  /**
    * Gets the section's character length.
    */
  val length: Double = js.native
  /**
    * Gets the section's start position in the document.
    */
  val start: Double = js.native
}

