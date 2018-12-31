package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StoreId extends js.Object {
  /**
    * The first-party domain which the cookie to retrieve is associated. This attribute is required if First-Party
    * Isolation is enabled.
    */
  var firstPartyDomain: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the cookie to retrieve. */
  var name: java.lang.String
  /**
    * The ID of the cookie store in which to look for the cookie. By default, the current execution context's
    * cookie store will be used.
    */
  var storeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL with which the cookie to retrieve is associated. This argument may be a full URL, in which case any
    * data following the URL path (e.g. the query string) is simply ignored. If host permissions for this URL are
    * not specified in the manifest file, the API call will fail.
    */
  var url: java.lang.String
}

