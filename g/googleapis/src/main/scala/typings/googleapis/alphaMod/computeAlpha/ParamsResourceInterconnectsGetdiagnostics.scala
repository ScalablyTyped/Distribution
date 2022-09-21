package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInterconnectsGetdiagnostics
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the interconnect resource to query.
    */
  var interconnect: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceInterconnectsGetdiagnostics {
  
  inline def apply(): ParamsResourceInterconnectsGetdiagnostics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInterconnectsGetdiagnostics]
  }
  
  extension [Self <: ParamsResourceInterconnectsGetdiagnostics](x: Self) {
    
    inline def setInterconnect(value: String): Self = StObject.set(x, "interconnect", value.asInstanceOf[js.Any])
    
    inline def setInterconnectUndefined: Self = StObject.set(x, "interconnect", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
