package typings.fastDashChunkDashString.fastDashChunkDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var size: Double
  var unicodeAware: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(size: Double, unicodeAware: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(size = size)
    if (!js.isUndefined(unicodeAware)) __obj.updateDynamic("unicodeAware")(unicodeAware)
    __obj.asInstanceOf[Options]
  }
}

