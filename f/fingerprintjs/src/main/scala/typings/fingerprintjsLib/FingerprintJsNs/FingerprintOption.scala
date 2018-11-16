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

