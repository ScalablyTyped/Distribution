package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleBlockSignature extends BlockSignature {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String] = js.native
  
  /**
    * Return type.
    */
  var retType: String = js.native
}
object SimpleBlockSignature {
  
  @scala.inline
  def apply(argTypes: js.Array[String], retType: String): SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlockSignature]
  }
  
  @scala.inline
  implicit class SimpleBlockSignatureOps[Self <: SimpleBlockSignature] (val x: Self) extends AnyVal {
    
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
    def setArgTypesVarargs(value: String*): Self = this.set("argTypes", js.Array(value :_*))
    
    @scala.inline
    def setArgTypes(value: js.Array[String]): Self = this.set("argTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetType(value: String): Self = this.set("retType", value.asInstanceOf[js.Any])
  }
}
