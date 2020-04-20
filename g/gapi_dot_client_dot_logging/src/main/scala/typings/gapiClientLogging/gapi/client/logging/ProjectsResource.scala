package typings.gapiClientLogging.gapi.client.logging

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
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
}

