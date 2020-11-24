package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadDescriptor extends js.Object {
  
  var SpreadDescriptor: String = js.native
}
object SpreadDescriptor {
  
  @scala.inline
  def apply(SpreadDescriptor: String): SpreadDescriptor = {
    val __obj = js.Dynamic.literal(SpreadDescriptor = SpreadDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadDescriptor]
  }
  
  @scala.inline
  implicit class SpreadDescriptorOps[Self <: SpreadDescriptor] (val x: Self) extends AnyVal {
    
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
    def setSpreadDescriptor(value: String): Self = this.set("SpreadDescriptor", value.asInstanceOf[js.Any])
  }
}
