package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanClearBrowserCacheResponse extends js.Object {
  /**
    * True if browser cache can be cleared.
    */
  var result: Boolean = js.native
}

object CanClearBrowserCacheResponse {
  @scala.inline
  def apply(result: Boolean): CanClearBrowserCacheResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanClearBrowserCacheResponse]
  }
  @scala.inline
  implicit class CanClearBrowserCacheResponseOps[Self <: CanClearBrowserCacheResponse] (val x: Self) extends AnyVal {
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
    def setResult(value: Boolean): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

