package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSize extends StObject {
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var measure: js.UndefOr[MeasureObject] = js.undefined
  
  var tuple: js.UndefOr[js.Array[String]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ColumnSize {
  
  @scala.inline
  def apply(): ColumnSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSize]
  }
  
  @scala.inline
  implicit class ColumnSizeMutableBuilder[Self <: ColumnSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setTuple(value: js.Array[String]): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleUndefined: Self = StObject.set(x, "tuple", js.undefined)
    
    @scala.inline
    def setTupleVarargs(value: String*): Self = StObject.set(x, "tuple", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
