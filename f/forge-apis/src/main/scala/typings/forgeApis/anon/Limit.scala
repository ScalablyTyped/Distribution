package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
}

object Limit {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined, region: String = null, startAt: String = null): Limit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

