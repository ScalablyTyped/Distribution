package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of enum values.
  */
@js.native
trait SchemaEnumValues extends StObject {
  
  /**
    * The maximum allowable length for string values is 32 characters.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SchemaEnumValues {
  
  @scala.inline
  def apply(): SchemaEnumValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumValues]
  }
  
  @scala.inline
  implicit class SchemaEnumValuesMutableBuilder[Self <: SchemaEnumValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
