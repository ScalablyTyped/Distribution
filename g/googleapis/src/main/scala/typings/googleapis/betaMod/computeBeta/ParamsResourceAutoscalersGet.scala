package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAutoscalersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the autoscaler to return.
    */
  var autoscaler: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the zone for this request.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object ParamsResourceAutoscalersGet {
  
  inline def apply(): ParamsResourceAutoscalersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAutoscalersGet]
  }
  
  extension [Self <: ParamsResourceAutoscalersGet](x: Self) {
    
    inline def setAutoscaler(value: String): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    inline def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
