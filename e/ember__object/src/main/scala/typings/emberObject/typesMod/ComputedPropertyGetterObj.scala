package typings.emberObject.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedPropertyGetterObj[T] extends _ComputedPropertyObj[T] {
  
  def get(key: String): T = js.native
}
object ComputedPropertyGetterObj {
  
  @scala.inline
  def apply[T](get: String => T): ComputedPropertyGetterObj[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ComputedPropertyGetterObj[T]]
  }
  
  @scala.inline
  implicit class ComputedPropertyGetterObjOps[Self <: ComputedPropertyGetterObj[_], T] (val x: Self with ComputedPropertyGetterObj[T]) extends AnyVal {
    
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
    def setGet(value: String => T): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
