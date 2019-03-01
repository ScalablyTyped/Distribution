package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooksAnnotationsRange extends js.Object {
  /** The offset from the ending position. */
  var endOffset: js.UndefOr[java.lang.String] = js.undefined
  /** The ending position for the range. */
  var endPosition: js.UndefOr[java.lang.String] = js.undefined
  /** The offset from the starting position. */
  var startOffset: js.UndefOr[java.lang.String] = js.undefined
  /** The starting position for the range. */
  var startPosition: js.UndefOr[java.lang.String] = js.undefined
}

object BooksAnnotationsRange {
  @scala.inline
  def apply(
    endOffset: java.lang.String = null,
    endPosition: java.lang.String = null,
    startOffset: java.lang.String = null,
    startPosition: java.lang.String = null
  ): BooksAnnotationsRange = {
    val __obj = js.Dynamic.literal()
    if (endOffset != null) __obj.updateDynamic("endOffset")(endOffset)
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition)
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset)
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition)
    __obj.asInstanceOf[BooksAnnotationsRange]
  }
}

