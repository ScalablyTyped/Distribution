package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsResource extends js.Object {
  var exclusions: ExclusionsResource
  var logs: LogsResource
  var sinks: SinksResource
}

object OrganizationsResource {
  @scala.inline
  def apply(exclusions: ExclusionsResource, logs: LogsResource, sinks: SinksResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exclusions")(exclusions)
    __obj.updateDynamic("logs")(logs)
    __obj.updateDynamic("sinks")(sinks)
    __obj.asInstanceOf[OrganizationsResource]
  }
}

