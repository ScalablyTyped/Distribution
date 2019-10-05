package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to prevent conflicts. Provide the latest fingerprint value when making a request to
    * add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[Record[String, String]] = js.undefined
}

object InstancesSetLabelsRequest {
  @scala.inline
  def apply(labelFingerprint: String = null, labels: Record[String, String] = null): InstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    __obj.asInstanceOf[InstancesSetLabelsRequest]
  }
}

