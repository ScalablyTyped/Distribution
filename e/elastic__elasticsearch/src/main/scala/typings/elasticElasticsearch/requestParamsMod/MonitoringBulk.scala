package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringBulk[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var interval: js.UndefOr[String] = js.undefined
  
  var system_api_version: js.UndefOr[String] = js.undefined
  
  var system_id: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MonitoringBulk {
  
  inline def apply[T](body: T): MonitoringBulk[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBulk[T]]
  }
  
  extension [Self <: MonitoringBulk[?], T](x: Self & MonitoringBulk[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setSystem_api_version(value: String): Self = StObject.set(x, "system_api_version", value.asInstanceOf[js.Any])
    
    inline def setSystem_api_versionUndefined: Self = StObject.set(x, "system_api_version", js.undefined)
    
    inline def setSystem_id(value: String): Self = StObject.set(x, "system_id", value.asInstanceOf[js.Any])
    
    inline def setSystem_idUndefined: Self = StObject.set(x, "system_id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
