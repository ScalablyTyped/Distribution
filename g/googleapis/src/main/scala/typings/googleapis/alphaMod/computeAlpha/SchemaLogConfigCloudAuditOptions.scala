package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfigCloudAuditOptions extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var logName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogConfigCloudAuditOptions {
  
  inline def apply(): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
  
  extension [Self <: SchemaLogConfigCloudAuditOptions](x: Self) {
    
    inline def setAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameNull: Self = StObject.set(x, "logName", null)
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
