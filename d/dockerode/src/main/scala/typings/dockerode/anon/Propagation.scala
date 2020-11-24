package typings.dockerode.anon

import typings.dockerode.mod.MountPropagation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Propagation extends js.Object {
  
  var Propagation: MountPropagation = js.native
}
object Propagation {
  
  @scala.inline
  def apply(Propagation: MountPropagation): Propagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Propagation]
  }
  
  @scala.inline
  implicit class PropagationOps[Self <: Propagation] (val x: Self) extends AnyVal {
    
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
    def setPropagation(value: MountPropagation): Self = this.set("Propagation", value.asInstanceOf[js.Any])
  }
}
