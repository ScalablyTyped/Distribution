package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCommerceOrderMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/commerce-order", JSImport.Default)
  @js.native
  open class default () extends CommerceOrder
  
  @js.native
  trait CommerceOrder extends AbstractCrudObject {
    
    def createAcknowledgeOrder(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createAcknowledgeOrder(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createAcknowledgeOrder(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createAcknowledgeOrder(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createCancellation(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createCancellation(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createCancellation(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createCancellation(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createFulfillOrder(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createFulfillOrder(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createFulfillOrder(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createFulfillOrder(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createRefund(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createRefund(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createRefund(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createRefund(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createReturn(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createReturn(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createReturn(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createReturn(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createShipment(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createShipment(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createShipment(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createShipment(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def createUpdateShipment(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def createUpdateShipment(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[CommerceOrder] = js.native
    def createUpdateShipment(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    def createUpdateShipment(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[CommerceOrder] = js.native
    
    def get(fields: js.Array[String]): js.Promise[CommerceOrder] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CommerceOrder] = js.native
    
    def getCancellations(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCancellations(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCancellations(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getCancellations(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getItems(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getItems(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getItems(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getItems(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPayments(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPayments(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPayments(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPayments(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPromotionDetails(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotionDetails(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotionDetails(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotionDetails(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getPromotions(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotions(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotions(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getPromotions(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getRefunds(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getRefunds(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getRefunds(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getRefunds(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getReturns(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getReturns(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getReturns(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getReturns(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def getShipments(fields: js.Array[String]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getShipments(fields: js.Array[String], params: Unit, fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getShipments(fields: js.Array[String], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    def getShipments(fields: js.Array[String], params: Record[String, Any], fetchFirstPage: Boolean): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
  }
}
