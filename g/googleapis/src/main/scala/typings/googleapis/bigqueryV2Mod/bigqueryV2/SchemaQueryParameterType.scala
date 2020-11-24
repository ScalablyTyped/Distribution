package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaQueryParameterType extends js.Object {
  
  /**
    * [Optional] The type of the array&#39;s elements, if this is an array.
    */
  var arrayType: js.UndefOr[SchemaQueryParameterType] = js.native
  
  /**
    * [Optional] The types of the fields of this struct, in order, if this is a
    * struct.
    */
  var structTypes: js.UndefOr[js.Array[Description]] = js.native
  
  /**
    * [Required] The top level type of this field.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaQueryParameterType {
  
  @scala.inline
  def apply(): SchemaQueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryParameterType]
  }
  
  @scala.inline
  implicit class SchemaQueryParameterTypeOps[Self <: SchemaQueryParameterType] (val x: Self) extends AnyVal {
    
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
    def setArrayType(value: SchemaQueryParameterType): Self = this.set("arrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayType: Self = this.set("arrayType", js.undefined)
    
    @scala.inline
    def setStructTypesVarargs(value: Description*): Self = this.set("structTypes", js.Array(value :_*))
    
    @scala.inline
    def setStructTypes(value: js.Array[Description]): Self = this.set("structTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructTypes: Self = this.set("structTypes", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
