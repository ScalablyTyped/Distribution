package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Network.LoaderId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  /**
    * Frame unique identifier.
    */
  var id: FrameId = js.native
  /**
    * Identifier of the loader associated with this frame.
    */
  var loaderId: LoaderId = js.native
  /**
    * Frame document's mimeType as determined by the browser.
    */
  var mimeType: String = js.native
  /**
    * Frame's name as specified in the tag.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent frame identifier.
    */
  var parentId: js.UndefOr[String] = js.native
  /**
    * Frame document's security origin.
    */
  var securityOrigin: String = js.native
  /**
    * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike url above, this URL may contain a fragment.
    */
  var unreachableUrl: js.UndefOr[String] = js.native
  /**
    * Frame document's URL without fragment.
    */
  var url: String = js.native
  /**
    * Frame document's URL fragment including the '#'.
    */
  var urlFragment: js.UndefOr[String] = js.native
}

object Frame {
  @scala.inline
  def apply(id: FrameId, loaderId: LoaderId, mimeType: String, securityOrigin: String, url: String): Frame = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loaderId = loaderId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setId(value: FrameId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderId(value: LoaderId): Self = this.set("loaderId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setUnreachableUrl(value: String): Self = this.set("unreachableUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreachableUrl: Self = this.set("unreachableUrl", js.undefined)
    @scala.inline
    def setUrlFragment(value: String): Self = this.set("urlFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlFragment: Self = this.set("urlFragment", js.undefined)
  }
  
}

