package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstPartyDomainName extends js.Object {
  /** The first-party domain associated with the cookie that's been removed. */
  var firstPartyDomain: java.lang.String
  /** The name of the cookie that's been removed. */
  var name: java.lang.String
  /** The ID of the cookie store from which the cookie was removed. */
  var storeId: java.lang.String
  /** The URL associated with the cookie that's been removed. */
  var url: java.lang.String
}

object Anon_FirstPartyDomainName {
  @scala.inline
  def apply(
    firstPartyDomain: java.lang.String,
    name: java.lang.String,
    storeId: java.lang.String,
    url: java.lang.String
  ): Anon_FirstPartyDomainName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstPartyDomain")(firstPartyDomain)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("storeId")(storeId)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_FirstPartyDomainName]
  }
}

