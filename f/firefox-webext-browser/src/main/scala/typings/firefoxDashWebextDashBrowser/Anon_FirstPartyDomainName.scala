package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstPartyDomainName extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: String
  /** The name of the cookie that's been removed. */
  var name: String
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: String
  /** The URL associated with the cookie that's been removed. */
  var url: String
}

object Anon_FirstPartyDomainName {
  @scala.inline
  def apply(firstPartyDomain: String, name: String, storeId: String, url: String): Anon_FirstPartyDomainName = {
    val __obj = js.Dynamic.literal(firstPartyDomain = firstPartyDomain, name = name, storeId = storeId, url = url)
  
    __obj.asInstanceOf[Anon_FirstPartyDomainName]
  }
}

