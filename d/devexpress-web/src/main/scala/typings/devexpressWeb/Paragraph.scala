package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a paragraph in the document.
  */
trait Paragraph extends js.Object {
  /**
    * Gets the paragraph's index.
    */
  val index: Double
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    */
  val interval: Interval
  /**
    * Gets the paragraph's character length.
    */
  val length: Double
  /**
    * Gets the index of a list applied to the paragraph.
    */
  val listIndex: Double
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    */
  val listLevelIndex: Double
  /**
    * Gets the paragraph's start position in the document.
    */
  val start: Double
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see StyleBase.name).
    */
  val styleName: String
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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], listLevelIndex = listLevelIndex.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], styleName = styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paragraph]
  }
}

