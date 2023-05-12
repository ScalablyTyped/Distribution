package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "CustomData")
@js.native
open class CustomData protected () extends default {
  def this(
    value: js.UndefOr[Double],
    currency: js.UndefOr[String],
    content_name: js.UndefOr[String],
    content_category: js.UndefOr[String],
    content_ids: js.UndefOr[js.Array[String]],
    contents: js.UndefOr[
        js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default]
      ],
    content_type: js.UndefOr[String],
    order_id: js.UndefOr[String],
    predicted_ltv: js.UndefOr[Double],
    num_items: js.UndefOr[Double],
    search_string: js.UndefOr[String],
    status: js.UndefOr[String],
    item_number: js.UndefOr[String],
    delivery_category: js.UndefOr[String],
    custom_properties: js.UndefOr[Record[String, Any]]
  ) = this()
}
