package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInfo extends js.Object {
  /**
    * Whether the target has an attached client.
    */
  var attached: Boolean = js.native
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
  /**
    * Opener target Id
    */
  var openerId: js.UndefOr[TargetID] = js.native
  var targetId: TargetID = js.native
  var title: String = js.native
  var `type`: String = js.native
  var url: String = js.native
}

object TargetInfo {
  @scala.inline
  def apply(attached: Boolean, targetId: TargetID, title: String, `type`: String, url: String): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
  @scala.inline
  implicit class TargetInfoOps[Self <: TargetInfo] (val x: Self) extends AnyVal {
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
    def setAttached(value: Boolean): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetId(value: TargetID): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
    @scala.inline
    def setOpenerId(value: TargetID): Self = this.set("openerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenerId: Self = this.set("openerId", js.undefined)
  }
  
}

