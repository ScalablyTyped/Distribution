package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<electron-notarize.electron-notarize.NotarizeAppOptions, 'appPath'> */
@js.native
trait NotarizeStapleOptions extends js.Object {
  var appPath: String = js.native
}

object NotarizeStapleOptions {
  @scala.inline
  def apply(appPath: String): NotarizeStapleOptions = {
    val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeStapleOptions]
  }
  @scala.inline
  implicit class NotarizeStapleOptionsOps[Self <: NotarizeStapleOptions] (val x: Self) extends AnyVal {
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
    def setAppPath(value: String): Self = this.set("appPath", value.asInstanceOf[js.Any])
  }
  
}

