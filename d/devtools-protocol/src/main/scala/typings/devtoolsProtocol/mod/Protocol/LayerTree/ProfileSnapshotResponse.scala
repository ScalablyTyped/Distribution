package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileSnapshotResponse extends js.Object {
  
  /**
    * The array of paint profiles, one per run.
    */
  var timings: js.Array[PaintProfile] = js.native
}
object ProfileSnapshotResponse {
  
  @scala.inline
  def apply(timings: js.Array[PaintProfile]): ProfileSnapshotResponse = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSnapshotResponse]
  }
  
  @scala.inline
  implicit class ProfileSnapshotResponseOps[Self <: ProfileSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setTimingsVarargs(value: PaintProfile*): Self = this.set("timings", js.Array(value :_*))
    
    @scala.inline
    def setTimings(value: js.Array[PaintProfile]): Self = this.set("timings", value.asInstanceOf[js.Any])
  }
}
