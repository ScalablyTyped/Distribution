package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CheckInfo extends js.Object {
  /** Consumer info of this check. */
  var consumerInfo: js.UndefOr[ConsumerInfo] = js.undefined
  /**
               * A list of fields and label keys that are ignored by the server.
               * The client doesn't need to send them for following requests to improve
               * performance and allow better aggregation.
               */
  var unusedArguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

