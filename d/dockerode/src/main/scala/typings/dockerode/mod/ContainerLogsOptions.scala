package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerLogsOptions extends js.Object {
  var details: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var since: js.UndefOr[Double] = js.native
  var stderr: js.UndefOr[Boolean] = js.native
  var stdout: js.UndefOr[Boolean] = js.native
  var tail: js.UndefOr[Double] = js.native
  var timestamps: js.UndefOr[Boolean] = js.native
}

object ContainerLogsOptions {
  @scala.inline
  def apply(): ContainerLogsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerLogsOptions]
  }
  @scala.inline
  implicit class ContainerLogsOptionsOps[Self <: ContainerLogsOptions] (val x: Self) extends AnyVal {
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
    def setDetails(value: Boolean): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setSince(value: Double): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    @scala.inline
    def setStderr(value: Boolean): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setTail(value: Double): Self = this.set("tail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTail: Self = this.set("tail", js.undefined)
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
  
}

