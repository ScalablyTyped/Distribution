package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transactionid
  extends /* key */ StringDictionary[js.Any] {
  
  var currency: js.UndefOr[String] = js.native
  
  var transaction_id: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Transactionid {
  
  @scala.inline
  def apply(): Transactionid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transactionid]
  }
  
  @scala.inline
  implicit class TransactionidMutableBuilder[Self <: Transactionid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
