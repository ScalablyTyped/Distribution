package typings.flot.jquery.flot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait axis extends axisOptions {
  
  def c2p(canvasPoint: canvasPoint): point = js.native
  
  var options: axisOptions = js.native
  
  def p2c(point: point): canvasPoint = js.native
}
object axis {
  
  @scala.inline
  def apply(c2p: canvasPoint => point, options: axisOptions, p2c: point => canvasPoint): axis = {
    val __obj = js.Dynamic.literal(c2p = js.Any.fromFunction1(c2p), options = options.asInstanceOf[js.Any], p2c = js.Any.fromFunction1(p2c))
    __obj.asInstanceOf[axis]
  }
  
  @scala.inline
  implicit class axisOps[Self <: axis] (val x: Self) extends AnyVal {
    
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
    def setC2p(value: canvasPoint => point): Self = this.set("c2p", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: axisOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2c(value: point => canvasPoint): Self = this.set("p2c", js.Any.fromFunction1(value))
  }
}
