package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var startAt: js.UndefOr[String] = js.undefined
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Int | Double = null, region: String = null, startAt: String = null): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Limit]
  }
}

