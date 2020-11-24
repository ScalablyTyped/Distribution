package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaQueryParameterValue extends js.Object {
  
  /**
    * [Optional] The array values, if this is an array type.
    */
  var arrayValues: js.UndefOr[js.Array[SchemaQueryParameterValue]] = js.native
  
  /**
    * [Optional] The struct field values, in order of the struct type&#39;s
    * declaration.
    */
  var structValues: js.UndefOr[StringDictionary[SchemaQueryParameterValue]] = js.native
  
  /**
    * [Optional] The value of this value, if a simple scalar type.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaQueryParameterValue {
  
  @scala.inline
  def apply(): SchemaQueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameterValue]
  }
  
  @scala.inline
  implicit class SchemaQueryParameterValueOps[Self <: SchemaQueryParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayValuesVarargs(value: SchemaQueryParameterValue*): Self = this.set("arrayValues", js.Array(value :_*))
    
    @scala.inline
    def setArrayValues(value: js.Array[SchemaQueryParameterValue]): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    
    @scala.inline
    def setStructValues(value: StringDictionary[SchemaQueryParameterValue]): Self = this.set("structValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructValues: Self = this.set("structValues", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
