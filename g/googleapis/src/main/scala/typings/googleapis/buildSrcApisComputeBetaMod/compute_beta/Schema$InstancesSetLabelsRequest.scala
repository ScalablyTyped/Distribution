package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesSetLabelsRequest extends js.Object {
  /**
    * Fingerprint of the previous set of labels for this resource, used to
    * prevent conflicts. Provide the latest fingerprint value when making a
    * request to add or change labels.
    */
  var labelFingerprint: js.UndefOr[String] = js.native
  var labels: js.UndefOr[StringDictionary[String]] = js.native
}

object Schema$InstancesSetLabelsRequest {
  @scala.inline
  def apply(labelFingerprint: String = null, labels: StringDictionary[String] = null): Schema$InstancesSetLabelsRequest = {
    val __obj = js.Dynamic.literal()
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesSetLabelsRequest]
  }
}

