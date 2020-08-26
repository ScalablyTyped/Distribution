package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RootCategoriesResource extends js.Object {
  var infoTypes: InfoTypesResource = js.native
  /** Returns the list of root categories of sensitive information. */
  def list(request: Fields): Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse] = js.native
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
  @scala.inline
  implicit class RootCategoriesResourceOps[Self <: RootCategoriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfoTypes(value: InfoTypesResource): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Fields => Request[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

