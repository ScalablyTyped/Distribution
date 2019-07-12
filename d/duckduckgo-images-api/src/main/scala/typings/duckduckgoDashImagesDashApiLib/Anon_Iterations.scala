package typings
package duckduckgoDashImagesDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Iterations extends js.Object {
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var moderate: js.UndefOr[scala.Boolean] = js.undefined
  var query: java.lang.String
  var retries: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Iterations {
  @scala.inline
  def apply(
    query: java.lang.String,
    iterations: scala.Int | scala.Double = null,
    moderate: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null
  ): Anon_Iterations = {
    val __obj = js.Dynamic.literal(query = query)
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (!js.isUndefined(moderate)) __obj.updateDynamic("moderate")(moderate)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Iterations]
  }
}

