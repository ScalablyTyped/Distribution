package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoggingDestination extends js.Object {
  /**
               * Names of the logs to be sent to this destination. Each name must
               * be defined in the Service.logs section. If the log name is
               * not a domain scoped name, it will be automatically prefixed with
               * the service name followed by "/".
               */
  var logs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * The monitored resource type. The type must be defined in the
               * Service.monitored_resources section.
               */
  var monitoredResource: js.UndefOr[java.lang.String] = js.undefined
}

