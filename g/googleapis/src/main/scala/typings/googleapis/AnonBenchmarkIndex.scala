package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBenchmarkIndex extends js.Object {
  var benchmarkIndex: js.UndefOr[Double] = js.native
  var hostUserAgent: js.UndefOr[String] = js.native
  var networkUserAgent: js.UndefOr[String] = js.native
}

object AnonBenchmarkIndex {
  @scala.inline
  def apply(benchmarkIndex: Int | Double = null, hostUserAgent: String = null, networkUserAgent: String = null): AnonBenchmarkIndex = {
    val __obj = js.Dynamic.literal()
    if (benchmarkIndex != null) __obj.updateDynamic("benchmarkIndex")(benchmarkIndex.asInstanceOf[js.Any])
    if (hostUserAgent != null) __obj.updateDynamic("hostUserAgent")(hostUserAgent.asInstanceOf[js.Any])
    if (networkUserAgent != null) __obj.updateDynamic("networkUserAgent")(networkUserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBenchmarkIndex]
  }
}

