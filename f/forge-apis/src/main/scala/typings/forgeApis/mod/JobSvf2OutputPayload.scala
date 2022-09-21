package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSvf2OutputPayload extends StObject {
  
  var advanced: js.UndefOr[JobSvf2OutputPayloadAdvanced] = js.undefined
  
  var `type`: String
  
  var views: js.UndefOr[js.Array[String]] = js.undefined
}
object JobSvf2OutputPayload {
  
  inline def apply(`type`: String): JobSvf2OutputPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSvf2OutputPayload]
  }
  
  extension [Self <: JobSvf2OutputPayload](x: Self) {
    
    inline def setAdvanced(value: JobSvf2OutputPayloadAdvanced): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
