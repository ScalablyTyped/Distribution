package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextAnnotation specifies a text range that includes sensitive
  * information.
  */
@js.native
trait Schema$SensitiveTextAnnotation extends js.Object {
  /**
    * Maps from a resource slice (e.g. FHIR resource field path) to a set of
    * sensitive text findings. For example, Appointment.Narrative text1 --&gt;
    * {findings_1, findings_2, findings_3}
    */
  var details: js.UndefOr[StringDictionary[Schema$Detail]] = js.native
}

object Schema$SensitiveTextAnnotation {
  @scala.inline
  def apply(details: StringDictionary[Schema$Detail] = null): Schema$SensitiveTextAnnotation = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SensitiveTextAnnotation]
  }
}

