package typings.googleapis.buildSrcApisManufacturersV1Mod.manufacturers_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product detail of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#productdetail.
  */
@js.native
trait Schema$ProductDetail extends js.Object {
  /**
    * The name of the attribute.
    */
  var attributeName: js.UndefOr[String] = js.native
  /**
    * The value of the attribute.
    */
  var attributeValue: js.UndefOr[String] = js.native
  /**
    * A short section name that can be reused between multiple product details.
    */
  var sectionName: js.UndefOr[String] = js.native
}

object Schema$ProductDetail {
  @scala.inline
  def apply(attributeName: String = null, attributeValue: String = null, sectionName: String = null): Schema$ProductDetail = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName.asInstanceOf[js.Any])
    if (attributeValue != null) __obj.updateDynamic("attributeValue")(attributeValue.asInstanceOf[js.Any])
    if (sectionName != null) __obj.updateDynamic("sectionName")(sectionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductDetail]
  }
}

