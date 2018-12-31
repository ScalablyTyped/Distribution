package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertTextRequest extends js.Object {
  /**
    * The optional table cell location if the text is to be inserted into a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * The index where the text will be inserted, in Unicode code units, based
    * on TextElement indexes.
    *
    * The index is zero-based and is computed from the start of the string.
    * The index may be adjusted to prevent insertions inside Unicode grapheme
    * clusters. In these cases, the text will be inserted immediately after the
    * grapheme cluster.
    */
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  /** The object ID of the shape or table where the text will be inserted. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to be inserted.
    *
    * Inserting a newline character will implicitly create a new
    * ParagraphMarker at that index.
    * The paragraph style of the new paragraph will be copied from the paragraph
    * at the current insertion index, including lists and bullets.
    *
    * Text styles for inserted text will be determined automatically, generally
    * preserving the styling of neighboring text. In most cases, the text will be
    * added to the TextRun that exists at the
    * insertion index.
    *
    * Some control characters (U+0000-U+0008, U+000C-U+001F) and characters
    * from the Unicode Basic Multilingual Plane Private Use Area (U+E000-U+F8FF)
    * will be stripped out of the inserted text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

