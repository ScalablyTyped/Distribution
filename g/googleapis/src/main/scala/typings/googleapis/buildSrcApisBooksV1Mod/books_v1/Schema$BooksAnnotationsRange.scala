package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BooksAnnotationsRange extends js.Object {
  /**
    * The offset from the ending position.
    */
  var endOffset: js.UndefOr[String] = js.native
  /**
    * The ending position for the range.
    */
  var endPosition: js.UndefOr[String] = js.native
  /**
    * The offset from the starting position.
    */
  var startOffset: js.UndefOr[String] = js.native
  /**
    * The starting position for the range.
    */
  var startPosition: js.UndefOr[String] = js.native
}

object Schema$BooksAnnotationsRange {
  @scala.inline
  def apply(
    endOffset: String = null,
    endPosition: String = null,
    startOffset: String = null,
    startPosition: String = null
  ): Schema$BooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    if (endOffset != null) __obj.updateDynamic("endOffset")(endOffset.asInstanceOf[js.Any])
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition.asInstanceOf[js.Any])
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BooksAnnotationsRange]
  }
}

