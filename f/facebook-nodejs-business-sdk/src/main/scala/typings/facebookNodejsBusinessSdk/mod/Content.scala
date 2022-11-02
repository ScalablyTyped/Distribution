package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable11
import org.scalablytyped.runtime.Instantiable8
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsSignalContentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "Content")
@js.native
open class Content protected () extends default {
  def this(
    id: String,
    quantity: Double,
    price: Double,
    item_price: Double,
    title: String,
    description: String,
    brand: String,
    category: String,
    delivery_category: String,
    tax: Double,
    external_content_id: String
  ) = this()
}
object Content {
  
  inline def apply: (Instantiable11[
    /* id */ String, 
    /* quantity */ Double, 
    /* price */ Double, 
    /* item_price */ Double, 
    /* title */ String, 
    /* description */ String, 
    /* brand */ String, 
    /* category */ String, 
    /* delivery_category */ String, 
    /* tax */ Double, 
    /* external_content_id */ String, 
    default
  ]) & (Instantiable8[
    /* id */ String, 
    /* quantity */ Double, 
    /* item_price */ Double, 
    /* title */ String, 
    /* description */ String, 
    /* brand */ String, 
    /* category */ String, 
    /* delivery_category */ String, 
    typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default
  ]) = ^.asInstanceOf[js.Dynamic].selectDynamic("Content").asInstanceOf[(Instantiable11[
    /* id */ String, 
    /* quantity */ Double, 
    /* price */ Double, 
    /* item_price */ Double, 
    /* title */ String, 
    /* description */ String, 
    /* brand */ String, 
    /* category */ String, 
    /* delivery_category */ String, 
    /* tax */ Double, 
    /* external_content_id */ String, 
    default
  ]) & (Instantiable8[
    /* id */ String, 
    /* quantity */ Double, 
    /* item_price */ Double, 
    /* title */ String, 
    /* description */ String, 
    /* brand */ String, 
    /* category */ String, 
    /* delivery_category */ String, 
    typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default
  ])]
}
