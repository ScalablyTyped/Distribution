package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindingsResource extends js.Object {
  /** Returns list of results for given inspect operation result set id. */
  def list(request: Bearertoken): Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
}

object FindingsResource {
  @scala.inline
  def apply(list: Bearertoken => Request[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]): FindingsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FindingsResource]
  }
}

