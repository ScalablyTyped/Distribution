package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tuple extends StObject {
  
  var measure: MeasureObject
  
  var tuple: js.Array[String]
  
  var `type`: String
}
object Tuple {
  
  inline def apply(measure: MeasureObject, tuple: js.Array[String], `type`: String): Tuple = {
    val __obj = js.Dynamic.literal(measure = measure.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tuple]
  }
  
  extension [Self <: Tuple](x: Self) {
    
    inline def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    inline def setTuple(value: js.Array[String]): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    inline def setTupleVarargs(value: String*): Self = StObject.set(x, "tuple", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
