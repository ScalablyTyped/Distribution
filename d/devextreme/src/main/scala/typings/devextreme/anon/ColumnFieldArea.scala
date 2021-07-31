package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFieldArea extends StObject {
  
  var columnFieldArea: js.UndefOr[String] = js.undefined
  
  var dataFieldArea: js.UndefOr[String] = js.undefined
  
  var filterFieldArea: js.UndefOr[String] = js.undefined
  
  var rowFieldArea: js.UndefOr[String] = js.undefined
}
object ColumnFieldArea {
  
  @scala.inline
  def apply(): ColumnFieldArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFieldArea]
  }
  
  @scala.inline
  implicit class ColumnFieldAreaMutableBuilder[Self <: ColumnFieldArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnFieldArea(value: String): Self = StObject.set(x, "columnFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldAreaUndefined: Self = StObject.set(x, "columnFieldArea", js.undefined)
    
    @scala.inline
    def setDataFieldArea(value: String): Self = StObject.set(x, "dataFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldAreaUndefined: Self = StObject.set(x, "dataFieldArea", js.undefined)
    
    @scala.inline
    def setFilterFieldArea(value: String): Self = StObject.set(x, "filterFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFieldAreaUndefined: Self = StObject.set(x, "filterFieldArea", js.undefined)
    
    @scala.inline
    def setRowFieldArea(value: String): Self = StObject.set(x, "rowFieldArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldAreaUndefined: Self = StObject.set(x, "rowFieldArea", js.undefined)
  }
}
