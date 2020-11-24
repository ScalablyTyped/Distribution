package typings.foreverMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpawnWith extends js.Object {
  
  var customFds: js.Array[Double] = js.native
  
  var gid: Double = js.native
  
  var setsid: Boolean = js.native
  
  var uid: Double = js.native
}
object SpawnWith {
  
  @scala.inline
  def apply(customFds: js.Array[Double], gid: Double, setsid: Boolean, uid: Double): SpawnWith = {
    val __obj = js.Dynamic.literal(customFds = customFds.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], setsid = setsid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnWith]
  }
  
  @scala.inline
  implicit class SpawnWithOps[Self <: SpawnWith] (val x: Self) extends AnyVal {
    
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
    def setCustomFdsVarargs(value: Double*): Self = this.set("customFds", js.Array(value :_*))
    
    @scala.inline
    def setCustomFds(value: js.Array[Double]): Self = this.set("customFds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetsid(value: Boolean): Self = this.set("setsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
