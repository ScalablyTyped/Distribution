package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BandingProperties extends js.Object {
  /** The first color that is alternating. (Required) */
  var firstBandColor: js.UndefOr[Color] = js.undefined
  /**
               * The color of the last row or column. If this field is not set, the last
               * row or column will be filled with either first_band_color or
               * second_band_color, depending on the color of the previous row or
               * column.
               */
  var footerColor: js.UndefOr[Color] = js.undefined
  /**
               * The color of the first row or column. If this field is set, the first
               * row or column will be filled with this color and the colors will
               * alternate between first_band_color and second_band_color starting
               * from the second row or column. Otherwise, the first row or column will be
               * filled with first_band_color and the colors will proceed to alternate
               * as they normally would.
               */
  var headerColor: js.UndefOr[Color] = js.undefined
  /** The second color that is alternating. (Required) */
  var secondBandColor: js.UndefOr[Color] = js.undefined
}

