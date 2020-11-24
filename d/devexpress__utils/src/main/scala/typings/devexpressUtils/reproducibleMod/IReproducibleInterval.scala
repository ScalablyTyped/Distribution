package typings.devexpressUtils.reproducibleMod

import typings.devexpressUtils.constMod.ConstInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReproducibleInterval[T /* <: ConstInterval */] extends js.Object {
  
  def makeByLengthEnd(length: Double, end: Double): T = js.native
  
  def makeByStartEnd(start: Double, end: Double): T = js.native
  
  def makeByStartLength(start: Double, length: Double): T = js.native
}
object IReproducibleInterval {
  
  @scala.inline
  def apply[T /* <: ConstInterval */](
    makeByLengthEnd: (Double, Double) => T,
    makeByStartEnd: (Double, Double) => T,
    makeByStartLength: (Double, Double) => T
  ): IReproducibleInterval[T] = {
    val __obj = js.Dynamic.literal(makeByLengthEnd = js.Any.fromFunction2(makeByLengthEnd), makeByStartEnd = js.Any.fromFunction2(makeByStartEnd), makeByStartLength = js.Any.fromFunction2(makeByStartLength))
    __obj.asInstanceOf[IReproducibleInterval[T]]
  }
  
  @scala.inline
  implicit class IReproducibleIntervalOps[Self <: IReproducibleInterval[_], T /* <: ConstInterval */] (val x: Self with IReproducibleInterval[T]) extends AnyVal {
    
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
    def setMakeByLengthEnd(value: (Double, Double) => T): Self = this.set("makeByLengthEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeByStartEnd(value: (Double, Double) => T): Self = this.set("makeByStartEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMakeByStartLength(value: (Double, Double) => T): Self = this.set("makeByStartLength", js.Any.fromFunction2(value))
  }
}
