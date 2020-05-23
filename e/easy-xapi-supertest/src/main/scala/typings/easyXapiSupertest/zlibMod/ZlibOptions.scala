package typings.easyXapiSupertest.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var memLevel: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: js.UndefOr[Double] = js.undefined,
    dictionary: js.Any = null,
    level: js.UndefOr[Double] = js.undefined,
    memLevel: js.UndefOr[Double] = js.undefined,
    strategy: js.UndefOr[Double] = js.undefined,
    windowBits: js.UndefOr[Double] = js.undefined
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memLevel)) __obj.updateDynamic("memLevel")(memLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strategy)) __obj.updateDynamic("strategy")(strategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBits)) __obj.updateDynamic("windowBits")(windowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

