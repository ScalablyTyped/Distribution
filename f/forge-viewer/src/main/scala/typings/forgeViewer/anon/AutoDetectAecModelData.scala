package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoDetectAecModelData extends StObject {
  
  var autoDetectAecModelData: js.UndefOr[Boolean] = js.undefined
  
  var ifcLevelsEnabled: js.UndefOr[Boolean] = js.undefined
}
object AutoDetectAecModelData {
  
  inline def apply(): AutoDetectAecModelData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoDetectAecModelData]
  }
  
  extension [Self <: AutoDetectAecModelData](x: Self) {
    
    inline def setAutoDetectAecModelData(value: Boolean): Self = StObject.set(x, "autoDetectAecModelData", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectAecModelDataUndefined: Self = StObject.set(x, "autoDetectAecModelData", js.undefined)
    
    inline def setIfcLevelsEnabled(value: Boolean): Self = StObject.set(x, "ifcLevelsEnabled", value.asInstanceOf[js.Any])
    
    inline def setIfcLevelsEnabledUndefined: Self = StObject.set(x, "ifcLevelsEnabled", js.undefined)
  }
}
