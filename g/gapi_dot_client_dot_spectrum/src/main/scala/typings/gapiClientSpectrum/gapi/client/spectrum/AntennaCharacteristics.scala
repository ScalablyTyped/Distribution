package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntennaCharacteristics extends js.Object {
  /**
    * The antenna height in meters. Whether the antenna height is required depends on the device type and the regulatory domain. Note that the height may be
    * negative.
    */
  var height: js.UndefOr[Double] = js.native
  /** If the height is required, then the height type (AGL for above ground level or AMSL for above mean sea level) is also required. The default is AGL. */
  var heightType: js.UndefOr[String] = js.native
  /** The height uncertainty in meters. Whether this is required depends on the regulatory domain. */
  var heightUncertainty: js.UndefOr[Double] = js.native
}

object AntennaCharacteristics {
  @scala.inline
  def apply(): AntennaCharacteristics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntennaCharacteristics]
  }
  @scala.inline
  implicit class AntennaCharacteristicsOps[Self <: AntennaCharacteristics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHeightType(value: String): Self = this.set("heightType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightType: Self = this.set("heightType", js.undefined)
    @scala.inline
    def setHeightUncertainty(value: Double): Self = this.set("heightUncertainty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightUncertainty: Self = this.set("heightUncertainty", js.undefined)
  }
  
}

