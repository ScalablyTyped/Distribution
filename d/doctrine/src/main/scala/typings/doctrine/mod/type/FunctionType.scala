package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionType extends Type_ {
  
  var `new`: Type_ = js.native
  
  var params: js.Array[Type_] = js.native
  
  var result: js.Array[Type_] = js.native
  
  var `this`: Type_ = js.native
  
  var `type`: typings.doctrine.doctrineStrings.FunctionType = js.native
}
object FunctionType {
  
  @scala.inline
  def apply(
    `new`: Type_,
    params: js.Array[Type_],
    result: js.Array[Type_],
    `this`: Type_,
    `type`: typings.doctrine.doctrineStrings.FunctionType
  ): FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionType]
  }
  
  @scala.inline
  implicit class FunctionTypeOps[Self <: FunctionType] (val x: Self) extends AnyVal {
    
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
    def setNew(value: Type_): Self = this.set("new", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Type_ *): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Type_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: Type_ *): Self = this.set("result", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: js.Array[Type_]): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThis(value: Type_): Self = this.set("this", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.FunctionType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
