package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of date values.
  */
trait SchemaDateValues extends StObject {
  
  var values: js.UndefOr[js.Array[SchemaDate]] = js.undefined
}
object SchemaDateValues {
  
  @scala.inline
  def apply(): SchemaDateValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateValues]
  }
  
  @scala.inline
  implicit class SchemaDateValuesMutableBuilder[Self <: SchemaDateValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaDate]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaDate*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
