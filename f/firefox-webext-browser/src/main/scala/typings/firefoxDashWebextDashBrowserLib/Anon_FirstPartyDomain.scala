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

