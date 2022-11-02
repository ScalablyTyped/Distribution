package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiCustomDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/custom-data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CustomData {
    def this(
      value: Double,
      currency: String,
      contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default],
      order_id: String,
      status: String,
      shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default,
      billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default,
      external_order_id: String,
      original_order_id: String,
      message: String
    ) = this()
  }
  
  @js.native
  trait CustomData extends StObject {
    
    var _billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    
    var _contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default] = js.native
    
    var _currency: String = js.native
    
    var _external_order_id: String = js.native
    
    var _message: String = js.native
    
    var _order_id: String = js.native
    
    var _original_order_id: String = js.native
    
    var _shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    
    var _status: String = js.native
    
    var _value: Double = js.native
    
    def billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    def billing_contact_=(billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default): Unit = js.native
    
    def contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default] = js.native
    def contents_=(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default]): Unit = js.native
    
    def currency: String = js.native
    def currency_=(currency: String): Unit = js.native
    
    def external_order_id: String = js.native
    def external_order_id_=(external_order_id: String): Unit = js.native
    
    def message: String = js.native
    def message_=(message: String): Unit = js.native
    
    def order_id: String = js.native
    def order_id_=(order_id: String): Unit = js.native
    
    def original_order_id: String = js.native
    def original_order_id_=(original_order_id: String): Unit = js.native
    
    def setBillingContact(billing_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default): CustomData = js.native
    
    def setContents(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default]): CustomData = js.native
    
    def setCurrency(currency: String): CustomData = js.native
    
    def setExternalOrderId(external_order_id: String): CustomData = js.native
    
    def setMessage(message: String): CustomData = js.native
    
    def setOrderId(order_id: String): CustomData = js.native
    
    def setOriginalOrderId(original_order_id: String): CustomData = js.native
    
    def setShippingContact(shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default): CustomData = js.native
    
    def setStatus(status: String): CustomData = js.native
    
    def setValue(value: Double): CustomData = js.native
    
    def shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default = js.native
    def shipping_contact_=(shipping_contact: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiUserDataMod.default): Unit = js.native
    
    def status: String = js.native
    def status_=(status: String): Unit = js.native
    
    def toJson(): Record[String, Any] = js.native
    
    def value: Double = js.native
    def value_=(value: Double): Unit = js.native
  }
}
