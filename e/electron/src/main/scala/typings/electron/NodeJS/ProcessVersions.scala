package typings.electron.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessVersions extends js.Object {
  val chrome: String = js.native
  val electron: String = js.native
}

object ProcessVersions {
  @scala.inline
  def apply(chrome: String, electron: String): ProcessVersions = {
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], electron = electron.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVersions]
  }
  @scala.inline
  implicit class ProcessVersionsOps[Self <: ProcessVersions] (val x: Self) extends AnyVal {
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
    def setChrome(value: String): Self = this.set("chrome", value.asInstanceOf[js.Any])
    @scala.inline
    def setElectron(value: String): Self = this.set("electron", value.asInstanceOf[js.Any])
  }
  
}

