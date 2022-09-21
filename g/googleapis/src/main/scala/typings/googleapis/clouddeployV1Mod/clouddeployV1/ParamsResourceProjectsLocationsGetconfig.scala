package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGetconfig
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of requested configuration.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGetconfig {
  
  inline def apply(): ParamsResourceProjectsLocationsGetconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGetconfig]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGetconfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
