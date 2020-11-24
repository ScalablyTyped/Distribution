package typings.epilogue.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceSearchOption extends js.Object {
  
  var attributes: js.Array[String] = js.native
  
  var operator: String = js.native
  
  var param: String = js.native
}
object ResourceSearchOption {
  
  @scala.inline
  def apply(attributes: js.Array[String], operator: String, param: String): ResourceSearchOption = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceSearchOption]
  }
  
  @scala.inline
  implicit class ResourceSearchOptionOps[Self <: ResourceSearchOption] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
  }
}
