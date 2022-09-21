package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClientgatewaysGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the resource
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsClientgatewaysGet {
  
  inline def apply(): ParamsResourceProjectsLocationsClientgatewaysGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClientgatewaysGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClientgatewaysGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
