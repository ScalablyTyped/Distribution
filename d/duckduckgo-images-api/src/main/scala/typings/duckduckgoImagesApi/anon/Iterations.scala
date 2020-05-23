package typings.duckduckgoImagesApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterations extends js.Object {
  var iterations: js.UndefOr[Double] = js.undefined
  var moderate: js.UndefOr[Boolean] = js.undefined
  var query: String
  var retries: js.UndefOr[Double] = js.undefined
}

object Iterations {
  @scala.inline
  def apply(
    query: String,
    iterations: js.UndefOr[Double] = js.undefined,
    moderate: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined
  ): Iterations = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moderate)) __obj.updateDynamic("moderate")(moderate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterations]
  }
}

