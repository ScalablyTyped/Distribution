package typings.ffmpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mount extends js.Object {
  var mountpoint: String = js.native
  var opts: Opts = js.native
  var `type`: String = js.native
}

object Mount {
  @scala.inline
  def apply(mountpoint: String, opts: Opts, `type`: String): Mount = {
    val __obj = js.Dynamic.literal(mountpoint = mountpoint.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
  @scala.inline
  implicit class MountOps[Self <: Mount] (val x: Self) extends AnyVal {
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
    def setMountpoint(value: String): Self = this.set("mountpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpts(value: Opts): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

