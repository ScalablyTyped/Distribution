package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataObjectCell extends StObject {
  
  var f: js.UndefOr[String] = js.undefined
  
  var p: js.UndefOr[js.Any] = js.undefined
  
  var v: js.UndefOr[js.Any] = js.undefined
}
object DataObjectCell {
  
  @scala.inline
  def apply(): DataObjectCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObjectCell]
  }
  
  @scala.inline
  implicit class DataObjectCellMutableBuilder[Self <: DataObjectCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFUndefined: Self = StObject.set(x, "f", js.undefined)
    
    @scala.inline
    def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setV(value: js.Any): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
