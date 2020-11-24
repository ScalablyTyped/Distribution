package typings.durandal.compositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositionTransation extends js.Object {
  
  /**
    * Registers a callback which will be invoked when the current composition transaction has completed. The transaction includes all parent and children compositions.
    * @param {function} callback The callback to be invoked when composition is complete.
    */
  def complete(callback: js.Function): Unit = js.native
}
object CompositionTransation {
  
  @scala.inline
  def apply(complete: js.Function => Unit): CompositionTransation = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[CompositionTransation]
  }
  
  @scala.inline
  implicit class CompositionTransationOps[Self <: CompositionTransation] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: js.Function => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
  }
}
