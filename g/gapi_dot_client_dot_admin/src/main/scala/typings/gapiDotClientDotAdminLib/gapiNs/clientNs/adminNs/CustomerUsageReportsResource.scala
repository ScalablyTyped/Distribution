package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerUsageReportsResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a specific customer. */
  def get(request: gapiDotClientDotAdminLib.Anon_AltCustomerId): gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
}

object CustomerUsageReportsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAdminLib.Anon_AltCustomerId, 
      gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
    ]
  ): CustomerUsageReportsResource = {
    val __obj = js.Dynamic.literal(get = get)
  
    __obj.asInstanceOf[CustomerUsageReportsResource]
  }
}

