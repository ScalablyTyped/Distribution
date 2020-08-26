package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServiceCdnPolicy extends js.Object {
  /** The CacheKeyPolicy for this CdnPolicy. */
  var cacheKeyPolicy: js.UndefOr[CacheKeyPolicy] = js.native
}

object BackendServiceCdnPolicy {
  @scala.inline
  def apply(): BackendServiceCdnPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceCdnPolicy]
  }
  @scala.inline
  implicit class BackendServiceCdnPolicyOps[Self <: BackendServiceCdnPolicy] (val x: Self) extends AnyVal {
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
    def setCacheKeyPolicy(value: CacheKeyPolicy): Self = this.set("cacheKeyPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheKeyPolicy: Self = this.set("cacheKeyPolicy", js.undefined)
  }
  
}

