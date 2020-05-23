package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var range: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(range: js.UndefOr[Double] = js.undefined): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

