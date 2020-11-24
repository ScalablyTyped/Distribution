package typings.dexie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bound extends js.Object {
  
  var bound: js.Function = js.native
  
  var lowerBound: js.Function = js.native
  
  var upperBound: js.Function = js.native
}
object Bound {
  
  @scala.inline
  def apply(bound: js.Function, lowerBound: js.Function, upperBound: js.Function): Bound = {
    val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any], lowerBound = lowerBound.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bound]
  }
  
  @scala.inline
  implicit class BoundOps[Self <: Bound] (val x: Self) extends AnyVal {
    
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
    def setBound(value: js.Function): Self = this.set("bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerBound(value: js.Function): Self = this.set("lowerBound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperBound(value: js.Function): Self = this.set("upperBound", value.asInstanceOf[js.Any])
  }
}
