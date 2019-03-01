package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductDetail extends js.Object {
  /** The name of the attribute. */
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the attribute. */
  var attributeValue: js.UndefOr[java.lang.String] = js.undefined
  /** A short section name that can be reused between multiple product details. */
  var sectionName: js.UndefOr[java.lang.String] = js.undefined
}

object ProductDetail {
  @scala.inline
  def apply(
    attributeName: java.lang.String = null,
    attributeValue: java.lang.String = null,
    sectionName: java.lang.String = null
  ): ProductDetail = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    if (attributeValue != null) __obj.updateDynamic("attributeValue")(attributeValue)
    if (sectionName != null) __obj.updateDynamic("sectionName")(sectionName)
    __obj.asInstanceOf[ProductDetail]
  }
}

