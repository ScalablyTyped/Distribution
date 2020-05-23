package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource
  /** Returns the list of root categories of sensitive information. */
  def list(request: Fields): Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
}

object RootCategoriesResource {
  @scala.inline
  def apply(
    infoTypes: InfoTypesResource,
    list: Fields => Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
  ): RootCategoriesResource = {
    val __obj = js.Dynamic.literal(infoTypes = infoTypes.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RootCategoriesResource]
  }
}

