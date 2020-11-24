package typings.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
  
  def set(key: String, value: T): T = js.native
}
object ComputedPropertySetterObj {
  
  @scala.inline
  def apply[T](set: (String, T) => T): ComputedPropertySetterObj[T] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[ComputedPropertySetterObj[T]]
  }
  
  @scala.inline
  implicit class ComputedPropertySetterObjOps[Self <: ComputedPropertySetterObj[_], T] (val x: Self with ComputedPropertySetterObj[T]) extends AnyVal {
    
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
    def setSet(value: (String, T) => T): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
