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

object CreateParagraphBulletsRequest {
  @scala.inline
  def apply(
    bulletPreset: java.lang.String = null,
    cellLocation: TableCellLocation = null,
    objectId: java.lang.String = null,
    textRange: Range = null
  ): CreateParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (bulletPreset != null) __obj.updateDynamic("bulletPreset")(bulletPreset)
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[CreateParagraphBulletsRequest]
  }
}

