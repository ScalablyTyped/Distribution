package typings.gapiDotClientDotBooks

import typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs.BooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfiRangeContentVersion extends js.Object {
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.undefined
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
}

object Anon_CfiRangeContentVersion {
  @scala.inline
  def apply(
    cfiRange: BooksAnnotationsRange = null,
    contentVersion: String = null,
    gbImageRange: BooksAnnotationsRange = null,
    gbTextRange: BooksAnnotationsRange = null
  ): Anon_CfiRangeContentVersion = {
    val __obj = js.Dynamic.literal()
    if (cfiRange != null) __obj.updateDynamic("cfiRange")(cfiRange)
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion)
    if (gbImageRange != null) __obj.updateDynamic("gbImageRange")(gbImageRange)
    if (gbTextRange != null) __obj.updateDynamic("gbTextRange")(gbTextRange)
    __obj.asInstanceOf[Anon_CfiRangeContentVersion]
  }
}

