package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManifestIconsResponse extends js.Object {
  var primaryIcon: js.UndefOr[String] = js.native
}

object GetManifestIconsResponse {
  @scala.inline
  def apply(): GetManifestIconsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManifestIconsResponse]
  }
  @scala.inline
  implicit class GetManifestIconsResponseOps[Self <: GetManifestIconsResponse] (val x: Self) extends AnyVal {
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
    def setPrimaryIcon(value: String): Self = this.set("primaryIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryIcon: Self = this.set("primaryIcon", js.undefined)
  }
  
}

