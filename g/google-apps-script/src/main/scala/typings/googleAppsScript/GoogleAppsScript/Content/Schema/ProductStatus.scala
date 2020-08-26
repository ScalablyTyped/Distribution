package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductStatus extends js.Object {
  var creationDate: js.UndefOr[String] = js.native
  var dataQualityIssues: js.UndefOr[js.Array[ProductStatusDataQualityIssue]] = js.native
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.native
  var googleExpirationDate: js.UndefOr[String] = js.native
  var itemLevelIssues: js.UndefOr[js.Array[ProductStatusItemLevelIssue]] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastUpdateDate: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var product: js.UndefOr[Product] = js.native
  var productId: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object ProductStatus {
  @scala.inline
  def apply(): ProductStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatus]
  }
  @scala.inline
  implicit class ProductStatusOps[Self <: ProductStatus] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDataQualityIssuesVarargs(value: ProductStatusDataQualityIssue*): Self = this.set("dataQualityIssues", js.Array(value :_*))
    @scala.inline
    def setDataQualityIssues(value: js.Array[ProductStatusDataQualityIssue]): Self = this.set("dataQualityIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataQualityIssues: Self = this.set("dataQualityIssues", js.undefined)
    @scala.inline
    def setDestinationStatusesVarargs(value: ProductStatusDestinationStatus*): Self = this.set("destinationStatuses", js.Array(value :_*))
    @scala.inline
    def setDestinationStatuses(value: js.Array[ProductStatusDestinationStatus]): Self = this.set("destinationStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationStatuses: Self = this.set("destinationStatuses", js.undefined)
    @scala.inline
    def setGoogleExpirationDate(value: String): Self = this.set("googleExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleExpirationDate: Self = this.set("googleExpirationDate", js.undefined)
    @scala.inline
    def setItemLevelIssuesVarargs(value: ProductStatusItemLevelIssue*): Self = this.set("itemLevelIssues", js.Array(value :_*))
    @scala.inline
    def setItemLevelIssues(value: js.Array[ProductStatusItemLevelIssue]): Self = this.set("itemLevelIssues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemLevelIssues: Self = this.set("itemLevelIssues", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastUpdateDate(value: String): Self = this.set("lastUpdateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateDate: Self = this.set("lastUpdateDate", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setProduct(value: Product): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

