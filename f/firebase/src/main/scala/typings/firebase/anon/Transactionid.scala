package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transactionid
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var currency: js.UndefOr[String] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Transactionid {
  
  inline def apply(): Transactionid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transactionid]
  }
  
  extension [Self <: Transactionid](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
