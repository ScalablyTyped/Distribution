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
  
  inline def apply(): SchemaDateValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateValues]
  }
  
  extension [Self <: SchemaDateValues](x: Self) {
    
    inline def setValues(value: js.Array[SchemaDate]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaDate*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
