package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductsGenerateApprovalUrlResponse extends js.Object {
  /**
    * A URL that can be rendered in an iframe to display the permissions (if any) of a product. This URL can be used to approve the product only once and
    * only within 24 hours of being generated, using the Products.approve call. If the product is currently unapproved and has no permissions, this URL will
    * point to an empty page. If the product is currently approved, a URL will only be generated if that product has added permissions since it was last
    * approved, and the URL will only display those new permissions that have not yet been accepted.
    */
  var url: js.UndefOr[String] = js.native
}

object ProductsGenerateApprovalUrlResponse {
  @scala.inline
  def apply(): ProductsGenerateApprovalUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsGenerateApprovalUrlResponse]
  }
  @scala.inline
  implicit class ProductsGenerateApprovalUrlResponseOps[Self <: ProductsGenerateApprovalUrlResponse] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

