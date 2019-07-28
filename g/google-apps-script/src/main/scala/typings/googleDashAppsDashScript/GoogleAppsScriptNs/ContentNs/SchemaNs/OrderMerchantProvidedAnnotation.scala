package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderMerchantProvidedAnnotation extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OrderMerchantProvidedAnnotation {
  @scala.inline
  def apply(key: String = null, value: String = null): OrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OrderMerchantProvidedAnnotation]
  }
}

