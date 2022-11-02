package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSignalCustomDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/signal/custom-data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CustomData {
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
  
  @js.native
  trait CustomData extends StObject {
    
    var _business_data_custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default = js.native
    
    var _server_custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default = js.native
    
    def add_custom_property(key: String, value: String): Unit = js.native
    
    def billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default = js.native
    def billing_contact_=(billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default): Unit = js.native
    
    def business_data_custom_data: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiCustomDataMod.default = js.native
    
    def content_category: String = js.native
    def content_category_=(content_category: String): Unit = js.native
    
    def content_ids: js.Array[String] = js.native
    def content_ids_=(content_ids: js.Array[String]): Unit = js.native
    
    def content_name: String = js.native
    def content_name_=(content_name: String): Unit = js.native
    
    def content_type: String = js.native
    def content_type_=(content_type: String): Unit = js.native
    
    def contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default] = js.native
    def contents_=(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default]): Unit = js.native
    
    def currency: String = js.native
    def currency_=(currency: String): Unit = js.native
    
    def custom_properties: Record[String, Any] = js.native
    def custom_properties_=(custom_properties: Record[String, Any]): Unit = js.native
    
    def delivery_category: String = js.native
    def delivery_category_=(delivery_category: String): Unit = js.native
    
    def external_order_id: String = js.native
    def external_order_id_=(external_order_id: String): Unit = js.native
    
    def item_number: String = js.native
    def item_number_=(item_number: String): Unit = js.native
    
    def message: String = js.native
    def message_=(message: String): Unit = js.native
    
    def num_items: Double = js.native
    def num_items_=(num_items: Double): Unit = js.native
    
    def order_id: String = js.native
    def order_id_=(order_id: String): Unit = js.native
    
    def original_order_id: String = js.native
    def original_order_id_=(original_order_id: String): Unit = js.native
    
    def predicted_ltv: Double = js.native
    def predicted_ltv_=(predicted_ltv: Double): Unit = js.native
    
    def search_string: String = js.native
    def search_string_=(search_string: String): Unit = js.native
    
    def server_custom_data: typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default = js.native
    
    def setBillingContact(billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default): CustomData = js.native
    
    def setContentCategory(content_category: String): CustomData = js.native
    
    def setContentIds(content_ids: js.Array[String]): CustomData = js.native
    
    def setContentName(content_name: String): CustomData = js.native
    
    def setContentType(content_type: String): CustomData = js.native
    
    def setContents(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default]): CustomData = js.native
    
    def setCurrency(currency: String): CustomData = js.native
    
    def setCustomProperties(custom_properties: Record[String, Any]): CustomData = js.native
    
    def setDeliveryCategory(delivery_category: String): CustomData = js.native
    
    def setExternalOrderId(external_order_id: String): CustomData = js.native
    
    def setItemNumber(item_number: String): CustomData = js.native
    
    def setMessage(message: String): CustomData = js.native
    
    def setNumItems(num_items: Double): CustomData = js.native
    
    def setOrderId(order_id: String): CustomData = js.native
    
    def setOriginalOrderId(original_order_id: String): CustomData = js.native
    
    def setPredictedLtv(predicted_ltv: Double): CustomData = js.native
    
    def setSearchString(search_string: String): CustomData = js.native
    
    def setShippingContact(shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default): CustomData = js.native
    
    def setStatus(status: String): CustomData = js.native
    
    def setValue(value: Double): CustomData = js.native
    
    def shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default = js.native
    def shipping_contact_=(shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default): Unit = js.native
    
    def status: String = js.native
    def status_=(status: String): Unit = js.native
    
    def value: Double = js.native
    def value_=(value: Double): Unit = js.native
  }
}
