package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogConfig extends StObject {
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var cloudAudit: js.UndefOr[SchemaLogConfigCloudAuditOptions] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var counter: js.UndefOr[SchemaLogConfigCounterOptions] = js.undefined
  
  /**
    * This is deprecated and has no effect. Do not use.
    */
  var dataAccess: js.UndefOr[SchemaLogConfigDataAccessOptions] = js.undefined
}
object SchemaLogConfig {
  
  inline def apply(): SchemaLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfig]
  }
  
  extension [Self <: SchemaLogConfig](x: Self) {
    
    inline def setCloudAudit(value: SchemaLogConfigCloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    inline def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    inline def setCounter(value: SchemaLogConfigCounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDataAccess(value: SchemaLogConfigDataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    inline def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
