package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of integer values.
  */
trait SchemaIntegerValues extends StObject {
  
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaIntegerValues {
  
  @scala.inline
  def apply(): SchemaIntegerValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIntegerValues]
  }
  
  @scala.inline
  implicit class SchemaIntegerValuesMutableBuilder[Self <: SchemaIntegerValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
