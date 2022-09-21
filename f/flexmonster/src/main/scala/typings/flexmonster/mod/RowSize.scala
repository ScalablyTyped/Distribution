package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSize extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var measure: js.UndefOr[MeasureObject] = js.undefined
  
  var tuple: js.UndefOr[js.Array[String]] = js.undefined
}
object RowSize {
  
  inline def apply(): RowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowSize]
  }
  
  extension [Self <: RowSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    inline def setTuple(value: js.Array[String]): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    inline def setTupleUndefined: Self = StObject.set(x, "tuple", js.undefined)
    
    inline def setTupleVarargs(value: String*): Self = StObject.set(x, "tuple", js.Array(value*))
  }
}
