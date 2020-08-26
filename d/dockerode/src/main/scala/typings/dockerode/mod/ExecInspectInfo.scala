package typings.dockerode.mod

import typings.dockerode.anon.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecInspectInfo extends js.Object {
  var CanRemove: Boolean = js.native
  var ContainerID: String = js.native
  var DetachKeys: String = js.native
  var ExitCode: Double | Null = js.native
  var ID: String = js.native
  var OpenStderr: Boolean = js.native
  var OpenStdin: Boolean = js.native
  var OpenStdout: Boolean = js.native
  var Pid: Double = js.native
  var ProcessConfig: Arguments = js.native
  var Running: Boolean = js.native
}

object ExecInspectInfo {
  @scala.inline
  def apply(
    CanRemove: Boolean,
    ContainerID: String,
    DetachKeys: String,
    ID: String,
    OpenStderr: Boolean,
    OpenStdin: Boolean,
    OpenStdout: Boolean,
    Pid: Double,
    ProcessConfig: Arguments,
    Running: Boolean
  ): ExecInspectInfo = {
    val __obj = js.Dynamic.literal(CanRemove = CanRemove.asInstanceOf[js.Any], ContainerID = ContainerID.asInstanceOf[js.Any], DetachKeys = DetachKeys.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], OpenStderr = OpenStderr.asInstanceOf[js.Any], OpenStdin = OpenStdin.asInstanceOf[js.Any], OpenStdout = OpenStdout.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], ProcessConfig = ProcessConfig.asInstanceOf[js.Any], Running = Running.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInspectInfo]
  }
  @scala.inline
  implicit class ExecInspectInfoOps[Self <: ExecInspectInfo] (val x: Self) extends AnyVal {
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
    def setCanRemove(value: Boolean): Self = this.set("CanRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerID(value: String): Self = this.set("ContainerID", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetachKeys(value: String): Self = this.set("DetachKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenStderr(value: Boolean): Self = this.set("OpenStderr", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenStdin(value: Boolean): Self = this.set("OpenStdin", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenStdout(value: Boolean): Self = this.set("OpenStdout", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("Pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessConfig(value: Arguments): Self = this.set("ProcessConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("Running", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitCode(value: Double): Self = this.set("ExitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitCodeNull: Self = this.set("ExitCode", null)
  }
  
}

