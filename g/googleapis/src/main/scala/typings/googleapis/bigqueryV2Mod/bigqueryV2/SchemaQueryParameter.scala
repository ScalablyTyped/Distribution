package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaQueryParameter extends StObject {
  
  /**
    * [Optional] If unset, this is a positional parameter. Otherwise, should be
    * unique within a query.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [Required] The type of this parameter.
    */
  var parameterType: js.UndefOr[SchemaQueryParameterType] = js.native
  
  /**
    * [Required] The value of this parameter.
    */
  var parameterValue: js.UndefOr[SchemaQueryParameterValue] = js.native
}
object SchemaQueryParameter {
  
  @scala.inline
  def apply(): SchemaQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameter]
  }
  
  @scala.inline
  implicit class SchemaQueryParameterMutableBuilder[Self <: SchemaQueryParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameterType(value: SchemaQueryParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
    
    @scala.inline
    def setParameterValue(value: SchemaQueryParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
