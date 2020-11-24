package typings.devexpressUtils.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISequenceComparatorItertor[T] extends js.Object {
  
  def getByIndex(index: Double): T = js.native
  
  def getComparer(): js.Function2[/* a */ T, /* b */ T, Boolean] = js.native
  
  var length: Double = js.native
}
object ISequenceComparatorItertor {
  
  @scala.inline
  def apply[T](
    getByIndex: Double => T,
    getComparer: () => js.Function2[/* a */ T, /* b */ T, Boolean],
    length: Double
  ): ISequenceComparatorItertor[T] = {
    val __obj = js.Dynamic.literal(getByIndex = js.Any.fromFunction1(getByIndex), getComparer = js.Any.fromFunction0(getComparer), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequenceComparatorItertor[T]]
  }
  
  @scala.inline
  implicit class ISequenceComparatorItertorOps[Self <: ISequenceComparatorItertor[_], T] (val x: Self with ISequenceComparatorItertor[T]) extends AnyVal {
    
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
    def setGetByIndex(value: Double => T): Self = this.set("getByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComparer(value: () => js.Function2[/* a */ T, /* b */ T, Boolean]): Self = this.set("getComparer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
