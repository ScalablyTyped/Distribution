package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dead extends js.Object {
  var Dead: Boolean
  var Error: String
  var ExitCode: Double
  var FinishedAt: String
  var OOMKilled: Boolean
  var Paused: Boolean
  var Pid: Double
  var Restarting: Boolean
  var Running: Boolean
  var StartedAt: String
  var Status: String
}

object Anon_Dead {
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
  ): Anon_Dead = {
    val __obj = js.Dynamic.literal(Dead = Dead, Error = Error, ExitCode = ExitCode, FinishedAt = FinishedAt, OOMKilled = OOMKilled, Paused = Paused, Pid = Pid, Restarting = Restarting, Running = Running, StartedAt = StartedAt, Status = Status)
  
    __obj.asInstanceOf[Anon_Dead]
  }
}

