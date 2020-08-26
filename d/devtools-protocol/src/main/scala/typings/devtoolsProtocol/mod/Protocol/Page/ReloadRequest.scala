package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReloadRequest extends js.Object {
  /**
    * If true, browser cache is ignored (as if the user pressed Shift+refresh).
    */
  var ignoreCache: js.UndefOr[Boolean] = js.native
  /**
    * If set, the script will be injected into all frames of the inspected page after reload.
    * Argument will be ignored if reloading dataURL origin.
    */
  var scriptToEvaluateOnLoad: js.UndefOr[String] = js.native
}

object ReloadRequest {
  @scala.inline
  def apply(): ReloadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadRequest]
  }
  @scala.inline
  implicit class ReloadRequestOps[Self <: ReloadRequest] (val x: Self) extends AnyVal {
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
    def setIgnoreCache(value: Boolean): Self = this.set("ignoreCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCache: Self = this.set("ignoreCache", js.undefined)
    @scala.inline
    def setScriptToEvaluateOnLoad(value: String): Self = this.set("scriptToEvaluateOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScriptToEvaluateOnLoad: Self = this.set("scriptToEvaluateOnLoad", js.undefined)
  }
  
}

