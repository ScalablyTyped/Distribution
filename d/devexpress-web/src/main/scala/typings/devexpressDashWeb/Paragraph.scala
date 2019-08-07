package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a paragraph in the document.
  */
@JSGlobal("Paragraph")
@js.native
class Paragraph () extends js.Object {
  /**
    * Gets the paragraph's index.
    */
  val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    */
  val interval: Interval = js.native
  /**
    * Gets the paragraph's character length.
    */
  val length: Double = js.native
  /**
    * Gets the index of a list applied to the paragraph.
    */
  val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    */
  val listLevelIndex: Double = js.native
  /**
    * Gets the paragraph's start position in the document.
    */
  val start: Double = js.native
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see StyleBase.name).
    */
  val styleName: String = js.native
}

