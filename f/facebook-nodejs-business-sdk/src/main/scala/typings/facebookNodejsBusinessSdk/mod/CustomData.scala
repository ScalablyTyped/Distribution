package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable15
import org.scalablytyped.runtime.Instantiable20
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsServersideCustomDataMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "CustomData")
@js.native
open class CustomData protected () extends default {
  def this(
    value: Double,
    currency: String,
    content_name: String,
    content_category: String,
    content_ids: js.Array[String],
    contents: js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default],
    content_type: String,
    order_id: String,
    predicted_ltv: Double,
    num_items: Double,
    search_string: String,
    status: String,
    item_number: String,
    delivery_category: String,
    custom_properties: Record[String, Any]
  ) = this()
}
object CustomData {
  
  inline def apply: (Instantiable15[
    /* value */ Double, 
    /* currency */ String, 
    /* content_name */ String, 
    /* content_category */ String, 
    /* content_ids */ js.Array[String], 
    /* contents */ js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default], 
    /* content_type */ String, 
    /* order_id */ String, 
    /* predicted_ltv */ Double, 
    /* num_items */ Double, 
    /* search_string */ String, 
    /* status */ String, 
    /* item_number */ String, 
    /* delivery_category */ String, 
    /* custom_properties */ Record[String, Any], 
    default
  ]) & (Instantiable20[
    /* value */ Double, 
    /* currency */ String, 
    /* content_name */ String, 
    /* content_category */ String, 
    /* content_ids */ js.Array[String], 
    /* contents */ js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default], 
    /* content_type */ String, 
    /* order_id */ String, 
    /* predicted_ltv */ Double, 
    /* num_items */ Double, 
    /* search_string */ String, 
    /* status */ String, 
    /* item_number */ String, 
    /* delivery_category */ String, 
    /* custom_properties */ Record[String, Any], 
    /* shipping_contact */ typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default, 
    /* billing_contact */ typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default, 
    /* external_order_id */ String, 
    /* original_order_id */ String, 
    /* message */ String, 
    typings.facebookNodejsBusinessSdk.srcObjectsSignalCustomDataMod.default
  ]) = ^.asInstanceOf[js.Dynamic].selectDynamic("CustomData").asInstanceOf[(Instantiable15[
    /* value */ Double, 
    /* currency */ String, 
    /* content_name */ String, 
    /* content_category */ String, 
    /* content_ids */ js.Array[String], 
    /* contents */ js.Array[typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default], 
    /* content_type */ String, 
    /* order_id */ String, 
    /* predicted_ltv */ Double, 
    /* num_items */ Double, 
    /* search_string */ String, 
    /* status */ String, 
    /* item_number */ String, 
    /* delivery_category */ String, 
    /* custom_properties */ Record[String, Any], 
    default
  ]) & (Instantiable20[
    /* value */ Double, 
    /* currency */ String, 
    /* content_name */ String, 
    /* content_category */ String, 
    /* content_ids */ js.Array[String], 
    /* contents */ js.Array[typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default], 
    /* content_type */ String, 
    /* order_id */ String, 
    /* predicted_ltv */ Double, 
    /* num_items */ Double, 
    /* search_string */ String, 
    /* status */ String, 
    /* item_number */ String, 
    /* delivery_category */ String, 
    /* custom_properties */ Record[String, Any], 
    /* shipping_contact */ typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default, 
    /* billing_contact */ typings.facebookNodejsBusinessSdk.srcObjectsSignalUserDataMod.default, 
    /* external_order_id */ String, 
    /* original_order_id */ String, 
    /* message */ String, 
    typings.facebookNodejsBusinessSdk.srcObjectsSignalCustomDataMod.default
  ])]
}
