package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreId extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: String
  /** The name of the cookie that's been removed. */
  var name: String
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: String
  /** The URL associated with the cookie that's been removed. */
  var url: String
}

object StoreId {
  @scala.inline
  def apply(firstPartyDomain: String, name: String, storeId: String, url: String): StoreId = {
    val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreId]
  }
}

