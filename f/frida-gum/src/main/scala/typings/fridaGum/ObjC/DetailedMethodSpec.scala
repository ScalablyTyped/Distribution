package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailedMethodSpec[I] extends MethodSpec[I] {
  
  /**
    * Implementation.
    */
  var implementation: I = js.native
  
  /**
    * Signature.
    */
  var types: String = js.native
}
object DetailedMethodSpec {
  
  @scala.inline
  def apply[I](implementation: I, types: String): DetailedMethodSpec[I] = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedMethodSpec[I]]
  }
  
  @scala.inline
  implicit class DetailedMethodSpecOps[Self <: DetailedMethodSpec[_], I] (val x: Self with DetailedMethodSpec[I]) extends AnyVal {
    
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
    def setImplementation(value: I): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
