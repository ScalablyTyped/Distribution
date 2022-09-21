package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeId extends StObject {
  
  var authorizeId: String
  
  var avsresponsecode: Any
  
  var avsresponsemessage: Any
  
  var otptransactionidentifier: Any
  
  var redirecturl: Any
  
  var responsecode: String
  
  var responsehtml: Any
  
  var responsemessage: String
  
  var responsetoken: Any
  
  var transactionreference: String
}
object AuthorizeId {
  
  inline def apply(
    authorizeId: String,
    avsresponsecode: Any,
    avsresponsemessage: Any,
    otptransactionidentifier: Any,
    redirecturl: Any,
    responsecode: String,
    responsehtml: Any,
    responsemessage: String,
    responsetoken: Any,
    transactionreference: String
  ): AuthorizeId = {
    val __obj = js.Dynamic.literal(authorizeId = authorizeId.asInstanceOf[js.Any], avsresponsecode = avsresponsecode.asInstanceOf[js.Any], avsresponsemessage = avsresponsemessage.asInstanceOf[js.Any], otptransactionidentifier = otptransactionidentifier.asInstanceOf[js.Any], redirecturl = redirecturl.asInstanceOf[js.Any], responsecode = responsecode.asInstanceOf[js.Any], responsehtml = responsehtml.asInstanceOf[js.Any], responsemessage = responsemessage.asInstanceOf[js.Any], responsetoken = responsetoken.asInstanceOf[js.Any], transactionreference = transactionreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeId]
  }
  
  extension [Self <: AuthorizeId](x: Self) {
    
    inline def setAuthorizeId(value: String): Self = StObject.set(x, "authorizeId", value.asInstanceOf[js.Any])
    
    inline def setAvsresponsecode(value: Any): Self = StObject.set(x, "avsresponsecode", value.asInstanceOf[js.Any])
    
    inline def setAvsresponsemessage(value: Any): Self = StObject.set(x, "avsresponsemessage", value.asInstanceOf[js.Any])
    
    inline def setOtptransactionidentifier(value: Any): Self = StObject.set(x, "otptransactionidentifier", value.asInstanceOf[js.Any])
    
    inline def setRedirecturl(value: Any): Self = StObject.set(x, "redirecturl", value.asInstanceOf[js.Any])
    
    inline def setResponsecode(value: String): Self = StObject.set(x, "responsecode", value.asInstanceOf[js.Any])
    
    inline def setResponsehtml(value: Any): Self = StObject.set(x, "responsehtml", value.asInstanceOf[js.Any])
    
    inline def setResponsemessage(value: String): Self = StObject.set(x, "responsemessage", value.asInstanceOf[js.Any])
    
    inline def setResponsetoken(value: Any): Self = StObject.set(x, "responsetoken", value.asInstanceOf[js.Any])
    
    inline def setTransactionreference(value: String): Self = StObject.set(x, "transactionreference", value.asInstanceOf[js.Any])
  }
}
