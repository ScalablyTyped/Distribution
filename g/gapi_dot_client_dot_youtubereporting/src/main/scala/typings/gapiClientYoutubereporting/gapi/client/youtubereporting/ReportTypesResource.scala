package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientYoutubereporting.AnonAccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTypesResource extends js.Object {
  /** Lists report types. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ListReportTypesResponse]
}

object ReportTypesResource {
  @scala.inline
  def apply(list: AnonAccesstokenAltBearertokenCallbackFields => Request_[ListReportTypesResponse]): ReportTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ReportTypesResource]
  }
}

