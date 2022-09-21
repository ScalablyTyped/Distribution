package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegiontargethttpsproxiesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the TargetHttpsProxy resource to return.
    */
  var targetHttpsProxy: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegiontargethttpsproxiesGet {
  
  inline def apply(): ParamsResourceRegiontargethttpsproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegiontargethttpsproxiesGet]
  }
  
  extension [Self <: ParamsResourceRegiontargethttpsproxiesGet](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTargetHttpsProxy(value: String): Self = StObject.set(x, "targetHttpsProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpsProxyUndefined: Self = StObject.set(x, "targetHttpsProxy", js.undefined)
  }
}
