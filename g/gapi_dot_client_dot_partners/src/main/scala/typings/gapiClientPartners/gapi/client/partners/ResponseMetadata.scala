package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseMetadata extends js.Object {
  /** Debug information about this request. */
  var debugInfo: js.UndefOr[DebugInfo] = js.native
}

object ResponseMetadata {
  @scala.inline
  def apply(): ResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseMetadata]
  }
  @scala.inline
  implicit class ResponseMetadataOps[Self <: ResponseMetadata] (val x: Self) extends AnyVal {
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
    def setDebugInfo(value: DebugInfo): Self = this.set("debugInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugInfo: Self = this.set("debugInfo", js.undefined)
  }
  
}

