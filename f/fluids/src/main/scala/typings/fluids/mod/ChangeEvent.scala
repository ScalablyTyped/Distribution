package typings.fluids.mod

import typings.fluids.fluidsStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeEvent[T] extends js.Object {
  
  var parent: FluidValue[T, _] = js.native
  
  var `type`: change = js.native
  
  var value: T = js.native
}
object ChangeEvent {
  
  @scala.inline
  def apply[T](parent: FluidValue[T, _], `type`: change, value: T): ChangeEvent[T] = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent[T]]
  }
  
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent[_], T] (val x: Self with ChangeEvent[T]) extends AnyVal {
    
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
    def setParent(value: FluidValue[T, _]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: change): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
