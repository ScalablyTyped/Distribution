package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParagraphBulletsRequest extends js.Object {
  /**
    * The kinds of bullet glyphs to be used. Defaults to the
    * `BULLET_DISC_CIRCLE_SQUARE` preset.
    */
  var bulletPreset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The optional table cell location if the text to be modified is in a table
    * cell. If present, the object_id must refer to a table.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /** The object ID of the shape or table containing the text to add bullets to. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** The range of text to apply the bullet presets to, based on TextElement indexes. */
  var textRange: js.UndefOr[Range] = js.undefined
}

