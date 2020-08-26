package typings.fingerprintjs.FingerprintJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FingerprintOption extends js.Object {
  /**
    * If you want to use canvas fingerprinting, set true.
    */
  var canvas: js.UndefOr[Boolean] = js.native
  /**
    * If you want to use custom hashing function, set function.
    */
  var hasher: js.UndefOr[js.Function2[/* key */ String, /* seed */ Double, Double]] = js.native
  /**
    * If you want to query the IE plugins info to further diversify the fingerprinting process, set true.
    */
  var ie_activex: js.UndefOr[Boolean] = js.native
  /**
    * If you want to use the screen resolution in calculating the fingerprint, set true.
    */
  var screen_resolution: js.UndefOr[Boolean] = js.native
}

object FingerprintOption {
  @scala.inline
  def apply(): FingerprintOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FingerprintOption]
  }
  @scala.inline
  implicit class FingerprintOptionOps[Self <: FingerprintOption] (val x: Self) extends AnyVal {
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
    def setCanvas(value: Boolean): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setHasher(value: (/* key */ String, /* seed */ Double) => Double): Self = this.set("hasher", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHasher: Self = this.set("hasher", js.undefined)
    @scala.inline
    def setIe_activex(value: Boolean): Self = this.set("ie_activex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIe_activex: Self = this.set("ie_activex", js.undefined)
    @scala.inline
    def setScreen_resolution(value: Boolean): Self = this.set("screen_resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen_resolution: Self = this.set("screen_resolution", js.undefined)
  }
  
}

