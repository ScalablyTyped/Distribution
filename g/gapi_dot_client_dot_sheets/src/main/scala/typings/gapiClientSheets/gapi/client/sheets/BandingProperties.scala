package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandingProperties extends js.Object {
  /** The first color that is alternating. (Required) */
  var firstBandColor: js.UndefOr[Color] = js.undefined
  /**
    * The first color that is alternating. (Required)
    * If first_band_color is also set, this field takes precedence.
    */
  var firstBandColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column is filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or
    * column.
    */
  var footerColor: js.UndefOr[Color] = js.undefined
  /**
    * The color of the last row or column. If this field is not set, the last
    * row or column is filled with either first_band_color or
    * second_band_color, depending on the color of the previous row or
    * column.
    * If footer_color is also set, this field takes precedence.
    */
  var footerColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column is filled with this color and the colors alternate between
    * first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column is filled with
    * first_band_color and the colors proceed to alternate as they normally
    * would.
    */
  var headerColor: js.UndefOr[Color] = js.undefined
  /**
    * The color of the first row or column. If this field is set, the first row
    * or column is filled with this color and the colors alternate between
    * first_band_color and second_band_color starting from the second
    * row or column. Otherwise, the first row or column is filled with
    * first_band_color and the colors proceed to alternate as they normally
    * would. If header_color is also set, this field takes precedence.
    */
  var headerColorStyle: js.UndefOr[ColorStyle] = js.undefined
  /** The second color that is alternating. (Required) */
  var secondBandColor: js.UndefOr[Color] = js.undefined
  /**
    * The second color that is alternating. (Required)
    * If second_band_color is also set, this field takes precedence.
    */
  var secondBandColorStyle: js.UndefOr[ColorStyle] = js.undefined
}

object BandingProperties {
  @scala.inline
  def apply(
    firstBandColor: Color = null,
    firstBandColorStyle: ColorStyle = null,
    footerColor: Color = null,
    footerColorStyle: ColorStyle = null,
    headerColor: Color = null,
    headerColorStyle: ColorStyle = null,
    secondBandColor: Color = null,
    secondBandColorStyle: ColorStyle = null
  ): BandingProperties = {
    val __obj = js.Dynamic.literal()
    if (firstBandColor != null) __obj.updateDynamic("firstBandColor")(firstBandColor.asInstanceOf[js.Any])
    if (firstBandColorStyle != null) __obj.updateDynamic("firstBandColorStyle")(firstBandColorStyle.asInstanceOf[js.Any])
    if (footerColor != null) __obj.updateDynamic("footerColor")(footerColor.asInstanceOf[js.Any])
    if (footerColorStyle != null) __obj.updateDynamic("footerColorStyle")(footerColorStyle.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (headerColorStyle != null) __obj.updateDynamic("headerColorStyle")(headerColorStyle.asInstanceOf[js.Any])
    if (secondBandColor != null) __obj.updateDynamic("secondBandColor")(secondBandColor.asInstanceOf[js.Any])
    if (secondBandColorStyle != null) __obj.updateDynamic("secondBandColorStyle")(secondBandColorStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandingProperties]
  }
}

