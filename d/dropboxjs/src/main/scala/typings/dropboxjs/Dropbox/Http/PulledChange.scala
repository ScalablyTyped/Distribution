package typings.dropboxjs.Dropbox.Http

import typings.dropboxjs.Dropbox.File.Stat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PulledChange extends js.Object {
  var path: String = js.native
  var stat: Stat = js.native
  var wasRemoved: Boolean = js.native
}

object PulledChange {
  @scala.inline
  def apply(path: String, stat: Stat, wasRemoved: Boolean): PulledChange = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], wasRemoved = wasRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulledChange]
  }
  @scala.inline
  implicit class PulledChangeOps[Self <: PulledChange] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStat(value: Stat): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasRemoved(value: Boolean): Self = this.set("wasRemoved", value.asInstanceOf[js.Any])
  }
  
}

