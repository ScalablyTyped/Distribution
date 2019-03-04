package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  /** Retrieves stored reports. */
  def listreports(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[ListReportsResponse]
}

object ReportsResource {
  @scala.inline
  def apply(
    listreports: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListReportsResponse]
    ]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(listreports = listreports)
  
    __obj.asInstanceOf[ReportsResource]
  }
}

