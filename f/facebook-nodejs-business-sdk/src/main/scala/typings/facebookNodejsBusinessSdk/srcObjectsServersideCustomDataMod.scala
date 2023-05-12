package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideCustomDataMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/custom-data", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CustomData {
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
  
  @js.native
  trait CustomData extends StObject {
    
    var _content_category: String = js.native
    
    var _content_ids: js.Array[String] = js.native
    
    var _content_name: String = js.native
    
    var _content_type: String = js.native
    
    var _contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default] = js.native
    
    var _currency: String = js.native
    
    var _custom_properties: Record[String, Any] = js.native
    
    var _delivery_category: String = js.native
    
    var _item_number: String = js.native
    
    var _num_items: Double = js.native
    
    var _order_id: String = js.native
    
    var _predicted_ltv: Double = js.native
    
    var _search_string: String = js.native
    
    var _status: String = js.native
    
    var _value: Double = js.native
    
    def add_custom_property(key: String, value: String): Unit = js.native
    
    def content_category: String = js.native
    def content_category_=(content_category: String): Unit = js.native
    
    def content_ids: js.Array[String] = js.native
    def content_ids_=(content_ids: js.Array[String]): Unit = js.native
    
    def content_name: String = js.native
    def content_name_=(content_name: String): Unit = js.native
    
    def content_type: String = js.native
    def content_type_=(content_type: String): Unit = js.native
    
    def contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default] = js.native
    def contents_=(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default]): Unit = js.native
    
    def currency: String = js.native
    def currency_=(currency: String): Unit = js.native
    
    def custom_properties: Record[String, Any] = js.native
    def custom_properties_=(custom_properties: Record[String, Any]): Unit = js.native
    
    def delivery_category: String = js.native
    def delivery_category_=(delivery_category: String): Unit = js.native
    
    def item_number: String = js.native
    def item_number_=(item_number: String): Unit = js.native
    
    def normalize(): Record[String, Any] = js.native
    
    def num_items: Double = js.native
    def num_items_=(num_items: Double): Unit = js.native
    
    def order_id: String = js.native
    def order_id_=(order_id: String): Unit = js.native
    
    def predicted_ltv: Double = js.native
    def predicted_ltv_=(predicted_ltv: Double): Unit = js.native
    
    def search_string: String = js.native
    def search_string_=(search_string: String): Unit = js.native
    
    def setContentCategory(content_category: String): CustomData = js.native
    
    def setContentIds(content_ids: js.Array[String]): CustomData = js.native
    
    def setContentName(content_name: String): CustomData = js.native
    
    def setContentType(content_type: String): CustomData = js.native
    
    def setContents(contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default]): CustomData = js.native
    
    def setCurrency(currency: String): CustomData = js.native
    
    def setCustomProperties(custom_properties: Record[String, Any]): CustomData = js.native
    
    def setDeliveryCategory(delivery_category: String): CustomData = js.native
    
    def setItemNumber(item_number: String): CustomData = js.native
    
    def setNumItems(num_items: Double): CustomData = js.native
    
    def setOrderId(order_id: String): CustomData = js.native
    
    def setPredictedLtv(predicted_ltv: Double): CustomData = js.native
    
    def setSearchString(search_string: String): CustomData = js.native
    
    def setStatus(status: String): CustomData = js.native
    
    def setValue(value: Double): CustomData = js.native
    
    def status: String = js.native
    def status_=(status: String): Unit = js.native
    
    def value: Double = js.native
    def value_=(value: Double): Unit = js.native
  }
}
