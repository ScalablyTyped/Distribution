package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountname extends StObject {
  
  var accountname: String
  
  var accountnumber: String
  
  var internalreference: Any
  
  var phonenumber: Any
  
  var responsecode: String
  
  var responsemessage: String
  
  var uniquereference: String
}
object Accountname {
  
  inline def apply(
    accountname: String,
    accountnumber: String,
    internalreference: Any,
    phonenumber: Any,
    responsecode: String,
    responsemessage: String,
    uniquereference: String
  ): Accountname = {
    val __obj = js.Dynamic.literal(accountname = accountname.asInstanceOf[js.Any], accountnumber = accountnumber.asInstanceOf[js.Any], internalreference = internalreference.asInstanceOf[js.Any], phonenumber = phonenumber.asInstanceOf[js.Any], responsecode = responsecode.asInstanceOf[js.Any], responsemessage = responsemessage.asInstanceOf[js.Any], uniquereference = uniquereference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountname]
  }
  
  extension [Self <: Accountname](x: Self) {
    
    inline def setAccountname(value: String): Self = StObject.set(x, "accountname", value.asInstanceOf[js.Any])
    
    inline def setAccountnumber(value: String): Self = StObject.set(x, "accountnumber", value.asInstanceOf[js.Any])
    
    inline def setInternalreference(value: Any): Self = StObject.set(x, "internalreference", value.asInstanceOf[js.Any])
    
    inline def setPhonenumber(value: Any): Self = StObject.set(x, "phonenumber", value.asInstanceOf[js.Any])
    
    inline def setResponsecode(value: String): Self = StObject.set(x, "responsecode", value.asInstanceOf[js.Any])
    
    inline def setResponsemessage(value: String): Self = StObject.set(x, "responsemessage", value.asInstanceOf[js.Any])
    
    inline def setUniquereference(value: String): Self = StObject.set(x, "uniquereference", value.asInstanceOf[js.Any])
  }
}
