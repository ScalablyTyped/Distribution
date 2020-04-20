package typings.gapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  var exclusions: ExclusionsResource
  var logs: LogsResource
  var sinks: SinksResource
}

object FoldersResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, sinks: SinksResource): FoldersResource = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], sinks = sinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldersResource]
  }
}

