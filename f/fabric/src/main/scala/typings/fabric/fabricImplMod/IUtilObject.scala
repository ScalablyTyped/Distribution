package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilObject extends js.Object {
  
  /**
    * Creates an empty object and copies all enumerable properties of another object to it
    * @param object Object to clone
    */
  def clone(`object`: js.Any): js.Any = js.native
  
  /**
    * Copies all enumerable properties of one object to another
    * @param destination Where to copy to
    * @param source Where to copy from
    */
  def extend(destination: js.Any, source: js.Any): js.Any = js.native
}
object IUtilObject {
  
  @scala.inline
  def apply(clone: js.Any => js.Any, extend: (js.Any, js.Any) => js.Any): IUtilObject = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), extend = js.Any.fromFunction2(extend))
    __obj.asInstanceOf[IUtilObject]
  }
  
  @scala.inline
  implicit class IUtilObjectOps[Self <: IUtilObject] (val x: Self) extends AnyVal {
    
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
    def setClone(value: js.Any => js.Any): Self = this.set("clone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: (js.Any, js.Any) => js.Any): Self = this.set("extend", js.Any.fromFunction2(value))
  }
}
