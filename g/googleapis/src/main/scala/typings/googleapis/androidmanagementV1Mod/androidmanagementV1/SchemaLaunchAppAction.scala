package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An action to launch an app.
  */
@js.native
trait SchemaLaunchAppAction extends js.Object {
  /**
    * Package name of app to be launched
    */
  var packageName: js.UndefOr[String] = js.native
}

object SchemaLaunchAppAction {
  @scala.inline
  def apply(): SchemaLaunchAppAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLaunchAppAction]
  }
  @scala.inline
  implicit class SchemaLaunchAppActionOps[Self <: SchemaLaunchAppAction] (val x: Self) extends AnyVal {
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
  }
  
}

