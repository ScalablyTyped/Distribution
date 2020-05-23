package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a section in the document.
  */
@JSGlobal("Section")
@js.native
class Section ()
  extends typings.devexpressWeb.Section {
  /**
    * Provides access to the section's footers.
    */
  /* CompleteClass */
  override val footers: js.Array[typings.devexpressWeb.HeaderFooter] = js.native
  /**
    * Provides access to the section's headers.
    */
  /* CompleteClass */
  override val headers: js.Array[typings.devexpressWeb.HeaderFooter] = js.native
  /**
    * Gets the text buffer interval occupied by the current section element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the section's character length.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Gets the section's start position in the document.
    */
  /* CompleteClass */
  override val start: Double = js.native
}

