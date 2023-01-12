package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPayloadItem extends StObject {
  
  var advanced: js.UndefOr[JobObjOutputPayloadAdvanced] = js.undefined
  
  var `type`: String
  
  var views: js.UndefOr[js.Array[String]] = js.undefined
}
object JobPayloadItem {
  
  inline def apply(`type`: String): JobPayloadItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobPayloadItem] (val x: Self) extends AnyVal {
    
    inline def setAdvanced(value: JobObjOutputPayloadAdvanced): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: String*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
