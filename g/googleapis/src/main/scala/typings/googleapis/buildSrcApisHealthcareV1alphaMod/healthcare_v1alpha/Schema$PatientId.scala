package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A patient identifier and associated type.
  */
@js.native
trait Schema$PatientId extends js.Object {
  /**
    * ID type, e.g. MRN or NHS.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The patient&#39;s unique identifier.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$PatientId {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Schema$PatientId = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PatientId]
  }
}

