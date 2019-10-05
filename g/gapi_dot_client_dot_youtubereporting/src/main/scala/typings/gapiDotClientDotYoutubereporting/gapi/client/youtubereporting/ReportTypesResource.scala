package typings.gapiDotClientDotYoutubereporting.gapi.client.youtubereporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutubereporting.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ListReportTypesResponse]
}

object ReportTypesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertokenCallbackFields => Request[ListReportTypesResponse]): ReportTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ReportTypesResource]
  }
}

