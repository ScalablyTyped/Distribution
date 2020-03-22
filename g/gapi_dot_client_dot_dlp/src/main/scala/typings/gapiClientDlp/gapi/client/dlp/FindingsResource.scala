package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDlp.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingsResource extends js.Object {
  /** Returns list of results for given inspect operation result set id. */
  def list(request: AnonBearertoken): Request_[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
}

object FindingsResource {
  @scala.inline
  def apply(list: AnonBearertoken => Request_[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]): FindingsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FindingsResource]
  }
}

