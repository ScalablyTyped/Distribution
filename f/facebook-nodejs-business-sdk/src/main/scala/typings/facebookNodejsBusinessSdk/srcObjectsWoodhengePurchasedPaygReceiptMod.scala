package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsWoodhengePurchasedPaygReceiptMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/woodhenge-purchased-payg-receipt", JSImport.Default)
  @js.native
  open class default () extends WoodhengePurchasedPAYGReceipt
  
  @js.native
  trait WoodhengePurchasedPAYGReceipt extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[WoodhengePurchasedPAYGReceipt] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[WoodhengePurchasedPAYGReceipt] = js.native
  }
}
