package typings.fastChunkString.mod

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
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(unicodeAware)) __obj.updateDynamic("unicodeAware")(unicodeAware.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

