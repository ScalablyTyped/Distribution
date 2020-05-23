package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntennaCharacteristics extends js.Object {
  /**
    * The antenna height in meters. Whether the antenna height is required depends on the device type and the regulatory domain. Note that the height may be
    * negative.
    */
  var height: js.UndefOr[Double] = js.undefined
  /** If the height is required, then the height type (AGL for above ground level or AMSL for above mean sea level) is also required. The default is AGL. */
  var heightType: js.UndefOr[String] = js.undefined
  /** The height uncertainty in meters. Whether this is required depends on the regulatory domain. */
  var heightUncertainty: js.UndefOr[Double] = js.undefined
}

object AntennaCharacteristics {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    heightType: String = null,
    heightUncertainty: js.UndefOr[Double] = js.undefined
  ): AntennaCharacteristics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (heightType != null) __obj.updateDynamic("heightType")(heightType.asInstanceOf[js.Any])
    if (!js.isUndefined(heightUncertainty)) __obj.updateDynamic("heightUncertainty")(heightUncertainty.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntennaCharacteristics]
  }
}

