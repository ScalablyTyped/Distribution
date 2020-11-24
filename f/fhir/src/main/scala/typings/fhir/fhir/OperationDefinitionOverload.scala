package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define overloaded variants for when  generating code
  */
@js.native
trait OperationDefinitionOverload extends BackboneElement {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'parameterName'.
    */
  var _parameterName: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Comments to go on overload
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Name of parameter to include in overload
    */
  var parameterName: js.UndefOr[js.Array[String]] = js.native
}
object OperationDefinitionOverload {
  
  @scala.inline
  def apply(): OperationDefinitionOverload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationDefinitionOverload]
  }
  
  @scala.inline
  implicit class OperationDefinitionOverloadOps[Self <: OperationDefinitionOverload] (val x: Self) extends AnyVal {
    
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
    def set_comment(value: Element): Self = this.set("_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_comment: Self = this.set("_comment", js.undefined)
    
    @scala.inline
    def set_parameterNameVarargs(value: Element*): Self = this.set("_parameterName", js.Array(value :_*))
    
    @scala.inline
    def set_parameterName(value: js.Array[Element]): Self = this.set("_parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_parameterName: Self = this.set("_parameterName", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setParameterNameVarargs(value: String*): Self = this.set("parameterName", js.Array(value :_*))
    
    @scala.inline
    def setParameterName(value: js.Array[String]): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterName: Self = this.set("parameterName", js.undefined)
  }
}
