package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreId extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: String = js.native
  /** The name of the cookie that's been removed. */
  var name: String = js.native
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: String = js.native
  /** The URL associated with the cookie that's been removed. */
  var url: String = js.native
}

object StoreId {
  @scala.inline
  def apply(firstPartyDomain: String, name: String, storeId: String, url: String): StoreId = {
    val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreId]
  }
  @scala.inline
  implicit class StoreIdOps[Self <: StoreId] (val x: Self) extends AnyVal {
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
    def setFirstPartyDomain(value: String): Self = this.set("firstPartyDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

