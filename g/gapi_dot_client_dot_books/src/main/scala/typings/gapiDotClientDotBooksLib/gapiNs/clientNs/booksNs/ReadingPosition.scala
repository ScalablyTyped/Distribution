package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadingPosition extends js.Object {
  /** Position in an EPUB as a CFI. */
  var epubCfiPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Position in a volume for image-based content. */
  var gbImagePosition: js.UndefOr[java.lang.String] = js.undefined
  /** Position in a volume for text-based content. */
  var gbTextPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for a reading position. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Position in a PDF file. */
  var pdfPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp when this reading position was last updated (formatted UTC timestamp with millisecond resolution). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Volume id associated with this reading position. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

