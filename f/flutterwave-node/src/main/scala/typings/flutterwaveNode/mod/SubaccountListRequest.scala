package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubaccountListRequest extends StObject {
  
  var account_bank: js.UndefOr[String] = js.undefined
  
  var account_number: js.UndefOr[String] = js.undefined
  
  var bank_name: js.UndefOr[String] = js.undefined
}
object SubaccountListRequest {
  
  inline def apply(): SubaccountListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubaccountListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubaccountListRequest] (val x: Self) extends AnyVal {
    
    inline def setAccount_bank(value: String): Self = StObject.set(x, "account_bank", value.asInstanceOf[js.Any])
    
    inline def setAccount_bankUndefined: Self = StObject.set(x, "account_bank", js.undefined)
    
    inline def setAccount_number(value: String): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAccount_numberUndefined: Self = StObject.set(x, "account_number", js.undefined)
    
    inline def setBank_name(value: String): Self = StObject.set(x, "bank_name", value.asInstanceOf[js.Any])
    
    inline def setBank_nameUndefined: Self = StObject.set(x, "bank_name", js.undefined)
  }
}
