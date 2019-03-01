package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListReportTypesResponse]
}

object ReportTypesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotYoutubereportingLib.Anon_AccesstokenAltBearertokenCallbackFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListReportTypesResponse]
    ]
  ): ReportTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ReportTypesResource]
  }
}

