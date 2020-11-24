package typings.devexpressUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISupportCopyFrom[T] extends js.Object {
  
  def copyFrom(obj: T): Unit = js.native
}
object ISupportCopyFrom {
  
  @scala.inline
  def apply[T](copyFrom: T => Unit): ISupportCopyFrom[T] = {
    val __obj = js.Dynamic.literal(copyFrom = js.Any.fromFunction1(copyFrom))
    __obj.asInstanceOf[ISupportCopyFrom[T]]
  }
  
  @scala.inline
  implicit class ISupportCopyFromOps[Self <: ISupportCopyFrom[_], T] (val x: Self with ISupportCopyFrom[T]) extends AnyVal {
    
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
    def setCopyFrom(value: T => Unit): Self = this.set("copyFrom", js.Any.fromFunction1(value))
  }
}
