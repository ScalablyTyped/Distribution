package typings.gapiDotClientDotDlp.gapi.client.dlp

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDlp.Anon_AccesstokenAltBearertokenCallbackFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource
  /** Returns the list of root categories of sensitive information. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
}

object RootCategoriesResource {
  @scala.inline
  def apply(
    infoTypes: InfoTypesResource,
    list: Anon_AccesstokenAltBearertokenCallbackFields => Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
  ): RootCategoriesResource = {
    val __obj = js.Dynamic.literal(infoTypes = infoTypes, list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RootCategoriesResource]
  }
}

