package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheInvalidationRule extends js.Object {
  /** If set, this invalidation rule will only apply to requests with a Host header matching host. */
  var host: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
}

object CacheInvalidationRule {
  @scala.inline
  def apply(): CacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheInvalidationRule]
  }
  @scala.inline
  implicit class CacheInvalidationRuleOps[Self <: CacheInvalidationRule] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

