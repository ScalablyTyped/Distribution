package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListAvailableServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Services available publicly or available to the authenticated caller. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.undefined
}

