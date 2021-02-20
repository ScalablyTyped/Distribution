package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Col extends StObject {
  
  var col: js.UndefOr[Double] = js.native
  
  var colspan: js.UndefOr[Double] = js.native
  
  var row: js.UndefOr[Double] = js.native
  
  var rowspan: js.UndefOr[Double] = js.native
  
  var screen: js.UndefOr[String] = js.native
}
object Col {
  
  @scala.inline
  def apply(): Col = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Col]
  }
  
  @scala.inline
  implicit class ColMutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColUndefined: Self = StObject.set(x, "col", js.undefined)
    
    @scala.inline
    def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    
    @scala.inline
    def setRowspan(value: Double): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
    
    @scala.inline
    def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
  }
}
