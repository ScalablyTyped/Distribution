package typings.facebookNodejsBusinessSdk.mod

import typings.facebookNodejsBusinessSdk.srcObjectsSignalCustomDataMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("facebook-nodejs-business-sdk", "SignalCustomData")
@js.native
open class SignalCustomData protected () extends default {
  def this(
    value: Double,
    currency: String,
    content_name: String,
    content_category: String,
    content_ids: js.Array[String],
    contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default],
    content_type: String,
    order_id: String,
    predicted_ltv: Double,
    num_items: Double,
    search_string: String,
    status: String,
    item_number: String,
    delivery_category: String,
    custom_properties: Record[String, Any],
    shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default,
    billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default,
    external_order_id: String,
    original_order_id: String,
    message: String
  ) = this()
}
