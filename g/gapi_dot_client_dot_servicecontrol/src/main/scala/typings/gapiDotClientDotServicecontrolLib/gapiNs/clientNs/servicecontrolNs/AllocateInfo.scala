package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AllocateInfo extends js.Object {
  /**
               * A list of label keys that were unused by the server in processing the
               * request. Thus, for similar requests repeated in a certain future time
               * window, the caller can choose to ignore these labels in the requests
               * to achieve better client-side cache hits and quota aggregation.
               */
  var unusedArguments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

