package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaftConfig extends js.Object {
  
  var ElectionTick: js.UndefOr[Double] = js.native
  
  var HeartbeatTick: js.UndefOr[Double] = js.native
  
  var KeepOldSnapshots: js.UndefOr[Double] = js.native
  
  var LogEntriesForSlowFollowers: js.UndefOr[Double] = js.native
  
  var SnapshotInterval: js.UndefOr[Double] = js.native
}
object RaftConfig {
  
  @scala.inline
  def apply(): RaftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaftConfig]
  }
  
  @scala.inline
  implicit class RaftConfigOps[Self <: RaftConfig] (val x: Self) extends AnyVal {
    
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
    def setElectionTick(value: Double): Self = this.set("ElectionTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectionTick: Self = this.set("ElectionTick", js.undefined)
    
    @scala.inline
    def setHeartbeatTick(value: Double): Self = this.set("HeartbeatTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatTick: Self = this.set("HeartbeatTick", js.undefined)
    
    @scala.inline
    def setKeepOldSnapshots(value: Double): Self = this.set("KeepOldSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOldSnapshots: Self = this.set("KeepOldSnapshots", js.undefined)
    
    @scala.inline
    def setLogEntriesForSlowFollowers(value: Double): Self = this.set("LogEntriesForSlowFollowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogEntriesForSlowFollowers: Self = this.set("LogEntriesForSlowFollowers", js.undefined)
    
    @scala.inline
    def setSnapshotInterval(value: Double): Self = this.set("SnapshotInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotInterval: Self = this.set("SnapshotInterval", js.undefined)
  }
}
