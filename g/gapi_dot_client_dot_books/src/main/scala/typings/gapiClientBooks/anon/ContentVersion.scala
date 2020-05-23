package typings.gapiClientBooks.anon

import typings.gapiClientBooks.gapi.client.books.BooksAnnotationsRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentVersion extends js.Object {
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[String] = js.undefined
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[BooksAnnotationsRange] = js.undefined
}

object ContentVersion {
  @scala.inline
  def apply(
    cfiRange: BooksAnnotationsRange = null,
    contentVersion: String = null,
    gbImageRange: BooksAnnotationsRange = null,
    gbTextRange: BooksAnnotationsRange = null
  ): ContentVersion = {
    val __obj = js.Dynamic.literal()
    if (cfiRange != null) __obj.updateDynamic("cfiRange")(cfiRange.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (gbImageRange != null) __obj.updateDynamic("gbImageRange")(gbImageRange.asInstanceOf[js.Any])
    if (gbTextRange != null) __obj.updateDynamic("gbTextRange")(gbTextRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentVersion]
  }
}

