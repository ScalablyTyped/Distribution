package typings.googleCloudSpanner.protosMod.google.rpc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ErrorInfo. */
trait IErrorInfo extends StObject {
  
  /** ErrorInfo domain */
  var domain: js.UndefOr[String | Null] = js.undefined
  
  /** ErrorInfo metadata */
  var metadata: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** ErrorInfo reason */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object IErrorInfo {
  
  inline def apply(): IErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IErrorInfo]
  }
  
  extension [Self <: IErrorInfo](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainNull: Self = StObject.set(x, "domain", null)
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
