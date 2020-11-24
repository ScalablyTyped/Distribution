package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container[T] extends js.Object {
  
  def getStyles(): String = js.native
  
  var id: String = js.native
}
object Container {
  
  @scala.inline
  def apply[T](getStyles: () => String, id: String): Container[T] = {
    val __obj = js.Dynamic.literal(getStyles = js.Any.fromFunction0(getStyles), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container[T]]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container[_], T] (val x: Self with Container[T]) extends AnyVal {
    
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
    def setGetStyles(value: () => String): Self = this.set("getStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
