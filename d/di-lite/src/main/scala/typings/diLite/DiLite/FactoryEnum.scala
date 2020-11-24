package typings.diLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactoryEnum extends js.Object {
  
  def func[T](`type`: T, args: js.Any): T = js.native
}
object FactoryEnum {
  
  @scala.inline
  def apply(func: (js.Any, js.Any) => js.Any): FactoryEnum = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction2(func))
    __obj.asInstanceOf[FactoryEnum]
  }
  
  @scala.inline
  implicit class FactoryEnumOps[Self <: FactoryEnum] (val x: Self) extends AnyVal {
    
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
    def setFunc(value: (js.Any, js.Any) => js.Any): Self = this.set("func", js.Any.fromFunction2(value))
  }
}
