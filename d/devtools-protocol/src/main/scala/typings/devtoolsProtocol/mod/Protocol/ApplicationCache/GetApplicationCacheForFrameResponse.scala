package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationCacheForFrameResponse extends js.Object {
  /**
    * Relevant application cache data for the document in given frame.
    */
  var applicationCache: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache = js.native
}

object GetApplicationCacheForFrameResponse {
  @scala.inline
  def apply(applicationCache: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache): GetApplicationCacheForFrameResponse = {
    val __obj = js.Dynamic.literal(applicationCache = applicationCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApplicationCacheForFrameResponse]
  }
  @scala.inline
  implicit class GetApplicationCacheForFrameResponseOps[Self <: GetApplicationCacheForFrameResponse] (val x: Self) extends AnyVal {
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
    def setApplicationCache(value: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache): Self = this.set("applicationCache", value.asInstanceOf[js.Any])
  }
  
}

