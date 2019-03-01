package typings
package easyDashXDashHeadersLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var strategy: js.UndefOr[scala.Double] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: js.Any = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

