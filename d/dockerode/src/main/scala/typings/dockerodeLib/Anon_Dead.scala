package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dead extends js.Object {
  var Dead: scala.Boolean
  var Error: java.lang.String
  var ExitCode: scala.Double
  var FinishedAt: java.lang.String
  var OOMKilled: scala.Boolean
  var Paused: scala.Boolean
  var Pid: scala.Double
  var Restarting: scala.Boolean
  var Running: scala.Boolean
  var StartedAt: java.lang.String
  var Status: java.lang.String
}

object Anon_Dead {
  @scala.inline
  def apply(
    Dead: scala.Boolean,
    Error: java.lang.String,
    ExitCode: scala.Double,
    FinishedAt: java.lang.String,
    OOMKilled: scala.Boolean,
    Paused: scala.Boolean,
    Pid: scala.Double,
    Restarting: scala.Boolean,
    Running: scala.Boolean,
    StartedAt: java.lang.String,
    Status: java.lang.String
  ): Anon_Dead = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Dead")(Dead)
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("ExitCode")(ExitCode)
    __obj.updateDynamic("FinishedAt")(FinishedAt)
    __obj.updateDynamic("OOMKilled")(OOMKilled)
    __obj.updateDynamic("Paused")(Paused)
    __obj.updateDynamic("Pid")(Pid)
    __obj.updateDynamic("Restarting")(Restarting)
    __obj.updateDynamic("Running")(Running)
    __obj.updateDynamic("StartedAt")(StartedAt)
    __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Anon_Dead]
  }
}

