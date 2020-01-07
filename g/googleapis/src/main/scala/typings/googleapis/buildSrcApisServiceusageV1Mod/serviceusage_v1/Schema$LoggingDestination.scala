package typings.googleapis.buildSrcApisServiceusageV1Mod.serviceusage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a specific logging destination (the producer project or
  * the consumer project).
  */
@js.native
trait Schema$LoggingDestination extends js.Object {
  /**
    * Names of the logs to be sent to this destination. Each name must be
    * defined in the Service.logs section. If the log name is not a domain
    * scoped name, it will be automatically prefixed with the service name
    * followed by &quot;/&quot;.
    */
  var logs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in the
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object Schema$LoggingDestination {
  @scala.inline
  def apply(logs: js.Array[String] = null, monitoredResource: String = null): Schema$LoggingDestination = {
    val __obj = js.Dynamic.literal()
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (monitoredResource != null) __obj.updateDynamic("monitoredResource")(monitoredResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LoggingDestination]
  }
}

