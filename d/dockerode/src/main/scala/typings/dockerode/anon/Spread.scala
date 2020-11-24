package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spread extends js.Object {
  
  var Spread: SpreadDescriptor = js.native
}
object Spread {
  
  @scala.inline
  def apply(Spread: SpreadDescriptor): Spread = {
    val __obj = js.Dynamic.literal(Spread = Spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spread]
  }
  
  @scala.inline
  implicit class SpreadOps[Self <: Spread] (val x: Self) extends AnyVal {
    
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
    def setSpread(value: SpreadDescriptor): Self = this.set("Spread", value.asInstanceOf[js.Any])
  }
}
