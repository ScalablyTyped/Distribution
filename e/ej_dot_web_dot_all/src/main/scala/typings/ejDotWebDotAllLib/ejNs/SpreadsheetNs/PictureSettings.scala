package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable picture feature in Spreadsheet. By enabling this, you can add pictures in Spreadsheet.
    * @Default {true}
    */
  var allowPictures: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define height to picture in the Spreadsheet.
    * @Default {220}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to define width to picture in the Spreadsheet.
    * @Default {440}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PictureSettings {
  @scala.inline
  def apply(
    allowPictures: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PictureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPictures)) __obj.updateDynamic("allowPictures")(allowPictures)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureSettings]
  }
}

