package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__ManualScaling extends js.Object {
  /**
    * The number of nodes to allocate for this model. These nodes are always up,
    * starting from the time the model is deployed, so the cost of operating
    * this model will be proportional to `nodes` &#42; number of hours since
    * last billing cycle plus the cost for each prediction performed.
    */
  var nodes: js.UndefOr[scala.Double] = js.undefined
}

