package typings.flexmonster.anon

import typings.flexmonster.mod.MeasureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measure extends StObject {
  
  var measure: js.UndefOr[MeasureObject] = js.undefined
  
  var tuple: js.Array[String]
}
object Measure {
  
  @scala.inline
  def apply(tuple: js.Array[String]): Measure = {
    val __obj = js.Dynamic.literal(tuple = tuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measure]
  }
  
  @scala.inline
  implicit class MeasureMutableBuilder[Self <: Measure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeasure(value: MeasureObject): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureUndefined: Self = StObject.set(x, "measure", js.undefined)
    
    @scala.inline
    def setTuple(value: js.Array[String]): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTupleVarargs(value: String*): Self = StObject.set(x, "tuple", js.Array(value :_*))
  }
}
