package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the paragraph style settings.
  */
@JSGlobal("ParagraphStyle")
@js.native
class ParagraphStyle () extends StyleBase {
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: CharacterStyle = js.native
  /**
    * Gets the index of the list item associated with the paragraph formatted with the current style.
    */
  val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the paragraph formatted with the current style.
    */
  val listLevelIndex: Double = js.native
  /**
    * Gets or sets the default style for a paragraph that immediately follows the current paragraph.
    */
  val nextStyle: ParagraphStyle = js.native
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: ParagraphStyle = js.native
}

