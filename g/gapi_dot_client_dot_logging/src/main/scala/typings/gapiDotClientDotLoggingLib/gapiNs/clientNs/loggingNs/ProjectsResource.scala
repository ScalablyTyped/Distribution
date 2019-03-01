package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var exclusions: ExclusionsResource
  var logs: LogsResource
  var metrics: MetricsResource
  var sinks: SinksResource
}

object ProjectsResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, metrics: MetricsResource, sinks: SinksResource): ProjectsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exclusions")(exclusions)
    __obj.updateDynamic("logs")(logs)
    __obj.updateDynamic("metrics")(metrics)
    __obj.updateDynamic("sinks")(sinks)
    __obj.asInstanceOf[ProjectsResource]
  }
}

