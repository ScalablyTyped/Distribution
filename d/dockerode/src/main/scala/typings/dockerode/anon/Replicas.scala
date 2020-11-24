package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replicas extends js.Object {
  
  var Replicas: js.UndefOr[Double] = js.native
}
object Replicas {
  
  @scala.inline
  def apply(): Replicas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replicas]
  }
  
  @scala.inline
  implicit class ReplicasOps[Self <: Replicas] (val x: Self) extends AnyVal {
    
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
    def setReplicas(value: Double): Self = this.set("Replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicas: Self = this.set("Replicas", js.undefined)
  }
}
