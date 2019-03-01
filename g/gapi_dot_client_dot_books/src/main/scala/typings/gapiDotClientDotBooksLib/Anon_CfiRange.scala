package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CfiRange extends js.Object {
  /** Range in CFI format for this annotation for version above. */
  var cfiRange: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange] = js.undefined
  /** Content version applicable to ranges below. */
  var contentVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Range in GB image format for this annotation for version above. */
  var gbImageRange: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange] = js.undefined
  /** Range in GB text format for this annotation for version above. */
  var gbTextRange: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange] = js.undefined
  /** Range in image CFI format for this annotation for version above. */
  var imageCfiRange: js.UndefOr[gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange] = js.undefined
}

object Anon_CfiRange {
  @scala.inline
  def apply(
    cfiRange: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange = null,
    contentVersion: java.lang.String = null,
    gbImageRange: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange = null,
    gbTextRange: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange = null,
    imageCfiRange: gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs.BooksAnnotationsRange = null
  ): Anon_CfiRange = {
    val __obj = js.Dynamic.literal()
    if (cfiRange != null) __obj.updateDynamic("cfiRange")(cfiRange)
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion)
    if (gbImageRange != null) __obj.updateDynamic("gbImageRange")(gbImageRange)
    if (gbTextRange != null) __obj.updateDynamic("gbTextRange")(gbTextRange)
    if (imageCfiRange != null) __obj.updateDynamic("imageCfiRange")(imageCfiRange)
    __obj.asInstanceOf[Anon_CfiRange]
  }
}

