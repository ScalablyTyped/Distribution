package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PictureSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable picture feature in Spreadsheet. By enabling this, you can add pictures in Spreadsheet.
    * @Default {true}
    */
  var allowPictures: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates to define height to picture in the Spreadsheet.
    * @Default {220}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that indicates to define width to picture in the Spreadsheet.
    * @Default {440}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PictureSettings {
  @scala.inline
  def apply(
    allowPictures: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): PictureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPictures)) __obj.updateDynamic("allowPictures")(allowPictures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureSettings]
  }
}

