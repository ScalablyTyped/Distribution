package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of double values.
  */
trait SchemaDoubleValues extends StObject {
  
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object SchemaDoubleValues {
  
  @scala.inline
  def apply(): SchemaDoubleValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDoubleValues]
  }
  
  @scala.inline
  implicit class SchemaDoubleValuesMutableBuilder[Self <: SchemaDoubleValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
