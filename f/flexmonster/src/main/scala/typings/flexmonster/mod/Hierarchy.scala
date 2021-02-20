package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hierarchy extends StObject {
  
  var caption: js.UndefOr[String] = js.native
  
  var dimensionName: js.UndefOr[String] = js.native
  
  var filter: js.UndefOr[Filter] = js.native
  
  var levels: js.UndefOr[js.Array[Level]] = js.native
  
  var sortName: js.UndefOr[String] = js.native
  
  var sortOrder: js.UndefOr[js.Array[String]] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object Hierarchy {
  
  @scala.inline
  def apply(): Hierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hierarchy]
  }
  
  @scala.inline
  implicit class HierarchyMutableBuilder[Self <: Hierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
    
    @scala.inline
    def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setSortName(value: String): Self = StObject.set(x, "sortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortNameUndefined: Self = StObject.set(x, "sortName", js.undefined)
    
    @scala.inline
    def setSortOrder(value: js.Array[String]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSortOrderVarargs(value: String*): Self = StObject.set(x, "sortOrder", js.Array(value :_*))
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
