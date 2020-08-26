package typings.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductDetail extends js.Object {
  /** The name of the attribute. */
  var attributeName: js.UndefOr[String] = js.native
  /** The value of the attribute. */
  var attributeValue: js.UndefOr[String] = js.native
  /** A short section name that can be reused between multiple product details. */
  var sectionName: js.UndefOr[String] = js.native
}

object ProductDetail {
  @scala.inline
  def apply(): ProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductDetail]
  }
  @scala.inline
  implicit class ProductDetailOps[Self <: ProductDetail] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setAttributeValue(value: String): Self = this.set("attributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeValue: Self = this.set("attributeValue", js.undefined)
    @scala.inline
    def setSectionName(value: String): Self = this.set("sectionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionName: Self = this.set("sectionName", js.undefined)
  }
  
}

