package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryParameterType extends js.Object {
  
  var arrayType: js.UndefOr[QueryParameterType] = js.native
  
  var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object QueryParameterType {
  
  @scala.inline
  def apply(): QueryParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterType]
  }
  
  @scala.inline
  implicit class QueryParameterTypeOps[Self <: QueryParameterType] (val x: Self) extends AnyVal {
    
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
    def setArrayType(value: QueryParameterType): Self = this.set("arrayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayType: Self = this.set("arrayType", js.undefined)
    
    @scala.inline
    def setStructTypesVarargs(value: QueryParameterTypeStructTypes*): Self = this.set("structTypes", js.Array(value :_*))
    
    @scala.inline
    def setStructTypes(value: js.Array[QueryParameterTypeStructTypes]): Self = this.set("structTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructTypes: Self = this.set("structTypes", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
