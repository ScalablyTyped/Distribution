package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstPartyDomain extends js.Object {
  /**
    * The first-party domain associated with the cookie. This attribute is required if First-Party Isolation is
    * enabled.
    */
  var firstPartyDomain: js.UndefOr[String] = js.undefined
  /** The name of the cookie to remove. */
  var name: String
  /**
    * The ID of the cookie store to look in for the cookie. If unspecified, the cookie is looked for by default in
    * the current execution context's cookie store.
    */
  var storeId: js.UndefOr[String] = js.undefined
  /**
    * The URL associated with the cookie. If host permissions for this URL are not specified in the manifest file,
    * the API call will fail.
    */
  var url: String
}

object Anon_FirstPartyDomain {
  @scala.inline
  def apply(name: String, url: String, firstPartyDomain: String = null, storeId: String = null): Anon_FirstPartyDomain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (firstPartyDomain != null) __obj.updateDynamic("firstPartyDomain")(firstPartyDomain.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FirstPartyDomain]
  }
}

