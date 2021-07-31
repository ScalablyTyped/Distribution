package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaftConfig extends StObject {
  
  var ElectionTick: js.UndefOr[Double] = js.undefined
  
  var HeartbeatTick: js.UndefOr[Double] = js.undefined
  
  var KeepOldSnapshots: js.UndefOr[Double] = js.undefined
  
  var LogEntriesForSlowFollowers: js.UndefOr[Double] = js.undefined
  
  var SnapshotInterval: js.UndefOr[Double] = js.undefined
}
object RaftConfig {
  
  @scala.inline
  def apply(): RaftConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaftConfig]
  }
  
  @scala.inline
  implicit class RaftConfigMutableBuilder[Self <: RaftConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElectionTick(value: Double): Self = StObject.set(x, "ElectionTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionTickUndefined: Self = StObject.set(x, "ElectionTick", js.undefined)
    
    @scala.inline
    def setHeartbeatTick(value: Double): Self = StObject.set(x, "HeartbeatTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeatTickUndefined: Self = StObject.set(x, "HeartbeatTick", js.undefined)
    
    @scala.inline
    def setKeepOldSnapshots(value: Double): Self = StObject.set(x, "KeepOldSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOldSnapshotsUndefined: Self = StObject.set(x, "KeepOldSnapshots", js.undefined)
    
    @scala.inline
    def setLogEntriesForSlowFollowers(value: Double): Self = StObject.set(x, "LogEntriesForSlowFollowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEntriesForSlowFollowersUndefined: Self = StObject.set(x, "LogEntriesForSlowFollowers", js.undefined)
    
    @scala.inline
    def setSnapshotInterval(value: Double): Self = StObject.set(x, "SnapshotInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIntervalUndefined: Self = StObject.set(x, "SnapshotInterval", js.undefined)
  }
}
