package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderMerchantProvidedAnnotation extends js.Object {
  /**
    * Key for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for additional merchant provided (as key-value pairs) annotation
    * about the line item.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$OrderMerchantProvidedAnnotation {
  @scala.inline
  def apply(key: String = null, value: String = null): Schema$OrderMerchantProvidedAnnotation = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderMerchantProvidedAnnotation]
  }
}

