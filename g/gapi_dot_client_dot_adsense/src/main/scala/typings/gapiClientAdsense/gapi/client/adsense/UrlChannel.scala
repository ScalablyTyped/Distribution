package typings.gapiClientAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlChannel extends js.Object {
  /** Unique identifier of this URL channel. This should be considered an opaque identifier; it is not safe to rely on it being in any particular format. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adsense#urlChannel. */
  var kind: js.UndefOr[String] = js.native
  /** URL Pattern of this URL channel. Does not include "http://" or "https://". Example: www.example.com/home */
  var urlPattern: js.UndefOr[String] = js.native
}

object UrlChannel {
  @scala.inline
  def apply(): UrlChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlChannel]
  }
  @scala.inline
  implicit class UrlChannelOps[Self <: UrlChannel] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUrlPattern(value: String): Self = this.set("urlPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlPattern: Self = this.set("urlPattern", js.undefined)
  }
  
}

