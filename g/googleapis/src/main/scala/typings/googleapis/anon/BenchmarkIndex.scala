package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BenchmarkIndex extends js.Object {
  var benchmarkIndex: js.UndefOr[Double] = js.native
  var hostUserAgent: js.UndefOr[String] = js.native
  var networkUserAgent: js.UndefOr[String] = js.native
}

object BenchmarkIndex {
  @scala.inline
  def apply(
    benchmarkIndex: js.UndefOr[Double] = js.undefined,
    hostUserAgent: String = null,
    networkUserAgent: String = null
  ): BenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmarkIndex)) __obj.updateDynamic("benchmarkIndex")(benchmarkIndex.get.asInstanceOf[js.Any])
    if (hostUserAgent != null) __obj.updateDynamic("hostUserAgent")(hostUserAgent.asInstanceOf[js.Any])
    if (networkUserAgent != null) __obj.updateDynamic("networkUserAgent")(networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BenchmarkIndex]
  }
}

