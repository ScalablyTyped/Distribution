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
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Columns]
    ]
  ): ColumnsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ColumnsResource]
  }
}

