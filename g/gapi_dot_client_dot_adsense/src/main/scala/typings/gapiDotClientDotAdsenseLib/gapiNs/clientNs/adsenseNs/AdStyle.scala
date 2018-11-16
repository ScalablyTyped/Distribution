package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AdStyle extends js.Object {
  /**
               * The colors which are included in the style. These are represented as six hexadecimal characters, similar to HTML color codes, but without the leading
               * hash.
               */
  var colors: js.UndefOr[gapiDotClientDotAdsenseLib.Anon_Border] = js.undefined
  /** The style of the corners in the ad (deprecated: never populated, ignored). */
  var corners: js.UndefOr[java.lang.String] = js.undefined
  /** The font which is included in the style. */
  var font: js.UndefOr[gapiDotClientDotAdsenseLib.Anon_Family] = js.undefined
  /** Kind this is, in this case adsense#adStyle. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

