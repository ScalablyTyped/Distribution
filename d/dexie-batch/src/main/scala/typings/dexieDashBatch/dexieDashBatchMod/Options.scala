package typings.dexieDashBatch.dexieDashBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: Double
  var limit: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(batchSize: Double, limit: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

