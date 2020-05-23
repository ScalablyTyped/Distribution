package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dead extends js.Object {
  var Dead: Boolean
  var Error: String
  var ExitCode: Double
  var FinishedAt: String
  var Health: js.UndefOr[FailingStreak] = js.undefined
  var OOMKilled: Boolean
  var Paused: Boolean
  var Pid: Double
  var Restarting: Boolean
  var Running: Boolean
  var StartedAt: String
  var Status: String
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
    Status: String,
    Health: FailingStreak = null
  ): Dead = {
    val __obj = js.Dynamic.literal(Dead = Dead.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], FinishedAt = FinishedAt.asInstanceOf[js.Any], OOMKilled = OOMKilled.asInstanceOf[js.Any], Paused = Paused.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], Restarting = Restarting.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any], StartedAt = StartedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Health != null) __obj.updateDynamic("Health")(Health.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dead]
  }
}

