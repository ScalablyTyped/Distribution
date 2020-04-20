package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStoreId extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: String
  /** The name of the cookie that's been removed. */
  var name: String
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: String
  /** The URL associated with the cookie that's been removed. */
  var url: String
}

object AnonStoreId {
  @scala.inline
  def apply(firstPartyDomain: String, name: String, storeId: String, url: String): AnonStoreId = {
    val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStoreId]
  }
}

