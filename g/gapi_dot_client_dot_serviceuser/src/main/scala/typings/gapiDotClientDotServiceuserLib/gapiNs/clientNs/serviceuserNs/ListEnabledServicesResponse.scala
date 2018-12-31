package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnabledServicesResponse extends js.Object {
  /**
    * Token that can be passed to `ListEnabledServices` to resume a paginated
    * query.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Services enabled for the specified parent. */
  var services: js.UndefOr[js.Array[PublishedService]] = js.undefined
}

