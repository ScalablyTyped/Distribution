package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hierarchy extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var dimensionName: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[Filter] = js.undefined
  
  var levels: js.UndefOr[js.Array[Level]] = js.undefined
  
  var sortName: js.UndefOr[String] = js.undefined
  
  var sortOrder: js.UndefOr[js.Array[String]] = js.undefined
  
  var uniqueName: js.UndefOr[String] = js.undefined
}
object Hierarchy {
  
  inline def apply(): Hierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hierarchy]
  }
  
  extension [Self <: Hierarchy](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    inline def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value*))
    
    inline def setSortName(value: String): Self = StObject.set(x, "sortName", value.asInstanceOf[js.Any])
    
    inline def setSortNameUndefined: Self = StObject.set(x, "sortName", js.undefined)
    
    inline def setSortOrder(value: js.Array[String]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortOrderVarargs(value: String*): Self = StObject.set(x, "sortOrder", js.Array(value*))
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
