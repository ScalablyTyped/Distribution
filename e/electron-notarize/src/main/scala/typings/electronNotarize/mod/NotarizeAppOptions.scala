package typings.electronNotarize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotarizeAppOptions extends js.Object {
  var appBundleId: String = js.native
  var appPath: String = js.native
}

object NotarizeAppOptions {
  @scala.inline
  def apply(appBundleId: String, appPath: String): NotarizeAppOptions = {
    val __obj = js.Dynamic.literal(appBundleId = appBundleId.asInstanceOf[js.Any], appPath = appPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotarizeAppOptions]
  }
  @scala.inline
  implicit class NotarizeAppOptionsOps[Self <: NotarizeAppOptions] (val x: Self) extends AnyVal {
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
    def setAppBundleId(value: String): Self = this.set("appBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppPath(value: String): Self = this.set("appPath", value.asInstanceOf[js.Any])
  }
  
}

