package typings.gapiDotClientDotDlp.gapi.client.dlp

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDlp.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingsResource extends js.Object {
  /** Returns list of results for given inspect operation result set id. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
}

object FindingsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAltBearertoken => Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
  ): FindingsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FindingsResource]
  }
}

