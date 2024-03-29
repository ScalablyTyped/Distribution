package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNodetemplatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the node template to return.
    */
  var nodeTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the region for this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceNodetemplatesGet {
  
  inline def apply(): ParamsResourceNodetemplatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNodetemplatesGet]
  }
  
  extension [Self <: ParamsResourceNodetemplatesGet](x: Self) {
    
    inline def setNodeTemplate(value: String): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
    
    inline def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
