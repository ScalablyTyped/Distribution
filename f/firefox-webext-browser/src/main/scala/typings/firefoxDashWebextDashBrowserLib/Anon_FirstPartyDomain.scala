package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstPartyDomain extends js.Object {
  /**
    * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is
    * enabled.
    */
  var firstPartyDomain: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the cookie to remove. */
  var name: java.lang.String
  /**
    * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in
    * the current execution context's cookie store.
    */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: java.lang.String
}

object Anon_FirstPartyDomain {
  @scala.inline
  def apply(
    name: java.lang.String,
    url: java.lang.String,
    firstPartyDomain: java.lang.String = null,
    storeId: java.lang.String = null
  ): Anon_FirstPartyDomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("url")(url)
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    __obj.asInstanceOf[Anon_FirstPartyDomain]
  }
}

