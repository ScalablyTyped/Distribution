package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDlp.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoTypesResource extends js.Object {
  /** Returns sensitive information types for given category. */
  def list(request: AnonCallback): Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]
}

object InfoTypesResource {
  @scala.inline
  def apply(list: AnonCallback => Request_[GooglePrivacyDlpV2beta1ListInfoTypesResponse]): InfoTypesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InfoTypesResource]
  }
}

