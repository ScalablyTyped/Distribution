package typings.dexieBatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: Double
  var limit: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(batchSize: Double, limit: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

