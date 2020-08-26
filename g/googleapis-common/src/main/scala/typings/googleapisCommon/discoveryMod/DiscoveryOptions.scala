package typings.googleapisCommon.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoveryOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var includePrivate: js.UndefOr[Boolean] = js.native
}

object DiscoveryOptions {
  @scala.inline
  def apply(): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryOptions]
  }
  @scala.inline
  implicit class DiscoveryOptionsOps[Self <: DiscoveryOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setIncludePrivate(value: Boolean): Self = this.set("includePrivate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePrivate: Self = this.set("includePrivate", js.undefined)
  }
  
}

