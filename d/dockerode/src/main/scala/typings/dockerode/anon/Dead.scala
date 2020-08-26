package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dead extends js.Object {
  var Dead: Boolean = js.native
  var Error: String = js.native
  var ExitCode: Double = js.native
  var FinishedAt: String = js.native
  var Health: js.UndefOr[FailingStreak] = js.native
  var OOMKilled: Boolean = js.native
  var Paused: Boolean = js.native
  var Pid: Double = js.native
  var Restarting: Boolean = js.native
  var Running: Boolean = js.native
  var StartedAt: String = js.native
  var Status: String = js.native
}

object Dead {
  @scala.inline
  def apply(
    Dead: Boolean,
    Error: String,
    ExitCode: Double,
    FinishedAt: String,
    OOMKilled: Boolean,
    Paused: Boolean,
    Pid: Double,
    Restarting: Boolean,
    Running: Boolean,
    StartedAt: String,
    Status: String
  ): Dead = {
    val __obj = js.Dynamic.literal(Dead = Dead.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], FinishedAt = FinishedAt.asInstanceOf[js.Any], OOMKilled = OOMKilled.asInstanceOf[js.Any], Paused = Paused.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], Restarting = Restarting.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dead]
  }
  @scala.inline
  implicit class DeadOps[Self <: Dead] (val x: Self) extends AnyVal {
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
    def setDead(value: Boolean): Self = this.set("Dead", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitCode(value: Double): Self = this.set("ExitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishedAt(value: String): Self = this.set("FinishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setOOMKilled(value: Boolean): Self = this.set("OOMKilled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("Paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("Pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestarting(value: Boolean): Self = this.set("Restarting", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("Running", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: String): Self = this.set("StartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealth(value: FailingStreak): Self = this.set("Health", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealth: Self = this.set("Health", js.undefined)
  }
  
}

