package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElement extends js.Object {
  /**
    * A TextElement representing a spot in the text that is dynamically
    * replaced with content that can change over time.
    */
  var autoText: js.UndefOr[AutoText] = js.undefined
  /**
    * The zero-based end index of this text element, exclusive, in Unicode code
    * units.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  /**
    * A marker representing the beginning of a new paragraph.
    *
    * The `start_index` and `end_index` of this TextElement represent the
    * range of the paragraph. Other TextElements with an index range contained
    * inside this paragraph's range are considered to be part of this
    * paragraph. The range of indices of two separate paragraphs will never
    * overlap.
    */
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.undefined
  /** The zero-based start index of this text element, in Unicode code units. */
  var startIndex: js.UndefOr[Double] = js.undefined
  /**
    * A TextElement representing a run of text where all of the characters
    * in the run have the same TextStyle.
    *
    * The `start_index` and `end_index` of TextRuns will always be fully
    * contained in the index range of a single `paragraph_marker` TextElement.
    * In other words, a TextRun will never span multiple paragraphs.
    */
  var textRun: js.UndefOr[TextRun] = js.undefined
}

object TextElement {
  @scala.inline
  def apply(
    autoText: AutoText = null,
    endIndex: Int | Double = null,
    paragraphMarker: ParagraphMarker = null,
    startIndex: Int | Double = null,
    textRun: TextRun = null
  ): TextElement = {
    val __obj = js.Dynamic.literal()
    if (autoText != null) __obj.updateDynamic("autoText")(autoText)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (paragraphMarker != null) __obj.updateDynamic("paragraphMarker")(paragraphMarker)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (textRun != null) __obj.updateDynamic("textRun")(textRun)
    __obj.asInstanceOf[TextElement]
  }
}

