package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsResource extends js.Object {
  /** Lists all columns for a report type */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Columns]
}

object ColumnsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAnalyticsLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[Columns]
  ): ColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ColumnsResource]
  }
}

