package typings.fastify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Del extends js.Object {
  
  def del(version: String): Unit = js.native
  
  def empty(): Unit = js.native
  
  def get(version: String): String | Null = js.native
  
  def set(version: String, store: js.Function): Unit = js.native
}
object Del {
  
  @scala.inline
  def apply(
    del: String => Unit,
    empty: () => Unit,
    get: String => String | Null,
    set: (String, js.Function) => Unit
  ): Del = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction1(del), empty = js.Any.fromFunction0(empty), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Del]
  }
  
  @scala.inline
  implicit class DelOps[Self <: Del] (val x: Self) extends AnyVal {
    
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
    def setDel(value: String => Unit): Self = this.set("del", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Function) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
