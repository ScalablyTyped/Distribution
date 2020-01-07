package typings.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message representing a health dataset.  A health dataset represents a
  * collection of healthcare data pertaining to one or more patients. This may
  * include multiple modalities of healthcare data, such as electronic medical
  * records or medical imaging data.
  */
@js.native
trait Schema$Dataset extends js.Object {
  /**
    * Output only. Resource name of the dataset, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The default timezone used by this dataset. Must be a either a valid IANA
    * time zone name such as &quot;America/New_York&quot; or empty, which
    * defaults to UTC. This is used for parsing times in resources (e.g., HL7
    * messages) where no explicit timezone is specified.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object Schema$Dataset {
  @scala.inline
  def apply(name: String = null, timeZone: String = null): Schema$Dataset = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Dataset]
  }
}

