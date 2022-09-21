package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTagvaluesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for TagValue to be fetched in the format `tagValues/456`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceTagvaluesGet {
  
  inline def apply(): ParamsResourceTagvaluesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTagvaluesGet]
  }
  
  extension [Self <: ParamsResourceTagvaluesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
