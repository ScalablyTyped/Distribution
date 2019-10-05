package typings.gapiDotClientDotManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductDetail extends js.Object {
  /** The name of the attribute. */
  var attributeName: js.UndefOr[String] = js.undefined
  /** The value of the attribute. */
  var attributeValue: js.UndefOr[String] = js.undefined
  /** A short section name that can be reused between multiple product details. */
  var sectionName: js.UndefOr[String] = js.undefined
}

object ProductDetail {
  @scala.inline
  def apply(attributeName: String = null, attributeValue: String = null, sectionName: String = null): ProductDetail = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (attributeValue != null) __obj.updateDynamic("attributeValue")(attributeValue)
    if (sectionName != null) __obj.updateDynamic("sectionName")(sectionName)
    __obj.asInstanceOf[ProductDetail]
  }
}

