package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDlp.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoTypesResource extends js.Object {
  /** Returns sensitive information types for given category. */
  def list(request: Anon_AccesstokenAltBearertokenCallback): Request[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
}

object InfoTypesResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAltBearertokenCallback => Request[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
  ): InfoTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InfoTypesResource]
  }
}

