package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.devtoolsProtocolStrings.allow
import typings.devtoolsProtocol.devtoolsProtocolStrings.allowAndName
import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import typings.devtoolsProtocol.devtoolsProtocolStrings.deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDownloadBehaviorRequest extends js.Object {
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). |allowAndName| allows download and names files according to
    * their dowmload guids. (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow | allowAndName | default_ = js.native
  /**
    * BrowserContext to set download behavior. When omitted, default browser context is used.
    */
  var browserContextId: js.UndefOr[BrowserContextID] = js.native
  /**
    * The default path to save downloaded files to. This is requred if behavior is set to 'allow'
    * or 'allowAndName'.
    */
  var downloadPath: js.UndefOr[String] = js.native
}

object SetDownloadBehaviorRequest {
  @scala.inline
  def apply(behavior: deny | allow | allowAndName | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  @scala.inline
  implicit class SetDownloadBehaviorRequestOps[Self <: SetDownloadBehaviorRequest] (val x: Self) extends AnyVal {
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
    def setBehavior(value: deny | allow | allowAndName | default_): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserContextId(value: BrowserContextID): Self = this.set("browserContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowserContextId: Self = this.set("browserContextId", js.undefined)
    @scala.inline
    def setDownloadPath(value: String): Self = this.set("downloadPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownloadPath: Self = this.set("downloadPath", js.undefined)
  }
  
}

