package typings.elasticElasticsearch.poolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait resurrectOptions extends js.Object {
  var name: String
  var now: js.UndefOr[Double] = js.undefined
  var requestId: String
}

object resurrectOptions {
  @scala.inline
  def apply(name: String, requestId: String, now: js.UndefOr[Double] = js.undefined): resurrectOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    if (!js.isUndefined(now)) __obj.updateDynamic("now")(now.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[resurrectOptions]
  }
}

