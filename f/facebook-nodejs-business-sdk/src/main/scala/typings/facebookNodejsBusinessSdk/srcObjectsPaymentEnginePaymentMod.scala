package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsPaymentEnginePaymentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/payment-engine-payment", JSImport.Default)
  @js.native
  open class default () extends PaymentEnginePayment
  
  @js.native
  trait PaymentEnginePayment extends AbstractCrudObject {
    
    def createDispute(fields: js.Array[String]): js.Promise[PaymentEnginePayment] = js.native
    def createDispute(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[PaymentEnginePayment] = js.native
    def createDispute(fields: js.Array[String], params: Record[String, Any]): js.Promise[PaymentEnginePayment] = js.native
    def createDispute(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[PaymentEnginePayment] = js.native
    
    def createRefund(fields: js.Array[String]): js.Promise[PaymentEnginePayment] = js.native
    def createRefund(fields: js.Array[String], params: Unit, pathOverride: String): js.Promise[PaymentEnginePayment] = js.native
    def createRefund(fields: js.Array[String], params: Record[String, Any]): js.Promise[PaymentEnginePayment] = js.native
    def createRefund(fields: js.Array[String], params: Record[String, Any], pathOverride: String): js.Promise[PaymentEnginePayment] = js.native
    
    def get(fields: js.Array[String]): js.Promise[PaymentEnginePayment] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[PaymentEnginePayment] = js.native
  }
}
