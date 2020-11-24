package typings.devexpressUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISupportConverting[T] extends js.Object {
  
  def applyConverter(converter: SimpleConverter[T]): this.type = js.native
}
object ISupportConverting {
  
  @scala.inline
  def apply[T](applyConverter: SimpleConverter[T] => ISupportConverting[T]): ISupportConverting[T] = {
    val __obj = js.Dynamic.literal(applyConverter = js.Any.fromFunction1(applyConverter))
    __obj.asInstanceOf[ISupportConverting[T]]
  }
  
  @scala.inline
  implicit class ISupportConvertingOps[Self <: ISupportConverting[_], T] (val x: Self with ISupportConverting[T]) extends AnyVal {
    
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
    def setApplyConverter(value: SimpleConverter[T] => ISupportConverting[T]): Self = this.set("applyConverter", js.Any.fromFunction1(value))
  }
}
