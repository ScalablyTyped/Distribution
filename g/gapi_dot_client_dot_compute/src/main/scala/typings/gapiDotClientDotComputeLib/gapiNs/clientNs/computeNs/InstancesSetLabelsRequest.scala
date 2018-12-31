package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to prevent conflicts. Provide the latest fingerprint value when making a request to
    * add or change labels.
    */
  var labelFingerprint: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

