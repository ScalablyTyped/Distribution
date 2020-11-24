package typings.gestalt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indexable extends js.Object {
  
  def index(): Double = js.native
}
object Indexable {
  
  @scala.inline
  def apply(index: () => Double): Indexable = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction0(index))
    __obj.asInstanceOf[Indexable]
  }
  
  @scala.inline
  implicit class IndexableOps[Self <: Indexable] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: () => Double): Self = this.set("index", js.Any.fromFunction0(value))
  }
}
