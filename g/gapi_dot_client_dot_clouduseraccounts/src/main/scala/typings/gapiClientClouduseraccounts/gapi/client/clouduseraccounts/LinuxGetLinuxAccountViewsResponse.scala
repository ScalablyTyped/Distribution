package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxGetLinuxAccountViewsResponse extends js.Object {
  /** [Output Only] A list of authorized user accounts and groups. */
  var resource: js.UndefOr[LinuxAccountViews] = js.native
}

object LinuxGetLinuxAccountViewsResponse {
  @scala.inline
  def apply(): LinuxGetLinuxAccountViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxGetLinuxAccountViewsResponse]
  }
  @scala.inline
  implicit class LinuxGetLinuxAccountViewsResponseOps[Self <: LinuxGetLinuxAccountViewsResponse] (val x: Self) extends AnyVal {
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
    def setResource(value: LinuxAccountViews): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

