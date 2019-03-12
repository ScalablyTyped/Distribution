package typings
package fingerprintjsLib.FingerprintJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FingerprintOption extends js.Object {
  /**
    * If you want to use canvas fingerprinting, set true.
    */
  var canvas: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you want to use custom hashing function, set function.
    */
  var hasher: js.UndefOr[js.Function2[/* key */ java.lang.String, /* seed */ scala.Double, scala.Double]] = js.undefined
  /**
    * If you want to query the IE plugins info to further diversify the fingerprinting process, set true.
    */
  var ie_activex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If you want to use the screen resolution in calculating the fingerprint, set true.
    */
  var screen_resolution: js.UndefOr[scala.Boolean] = js.undefined
}

object FingerprintOption {
  @scala.inline
  def apply(
    canvas: js.UndefOr[scala.Boolean] = js.undefined,
    hasher: (/* key */ java.lang.String, /* seed */ scala.Double) => scala.Double = null,
    ie_activex: js.UndefOr[scala.Boolean] = js.undefined,
    screen_resolution: js.UndefOr[scala.Boolean] = js.undefined
  ): FingerprintOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canvas)) __obj.updateDynamic("canvas")(canvas)
    if (hasher != null) __obj.updateDynamic("hasher")(js.Any.fromFunction2(hasher))
    if (!js.isUndefined(ie_activex)) __obj.updateDynamic("ie_activex")(ie_activex)
    if (!js.isUndefined(screen_resolution)) __obj.updateDynamic("screen_resolution")(screen_resolution)
    __obj.asInstanceOf[FingerprintOption]
  }
}

