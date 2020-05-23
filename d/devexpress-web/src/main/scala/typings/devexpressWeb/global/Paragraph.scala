package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a paragraph in the document.
  */
@JSGlobal("Paragraph")
@js.native
class Paragraph ()
  extends typings.devexpressWeb.Paragraph {
  /**
    * Gets the paragraph's index.
    */
  /* CompleteClass */
  override val index: Double = js.native
  /**
    * Gets the text buffer interval occupied by the current paragraph element.
    */
  /* CompleteClass */
  override val interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the paragraph's character length.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Gets the index of a list applied to the paragraph.
    */
  /* CompleteClass */
  override val listIndex: Double = js.native
  /**
    * Gets the index of the list level applied to the current paragraph in the numbering list.
    */
  /* CompleteClass */
  override val listLevelIndex: Double = js.native
  /**
    * Gets the paragraph's start position in the document.
    */
  /* CompleteClass */
  override val start: Double = js.native
  /**
    * Gets the name of the paragraph style applied to the current paragraph (see StyleBase.name).
    */
  /* CompleteClass */
  override val styleName: String = js.native
}

