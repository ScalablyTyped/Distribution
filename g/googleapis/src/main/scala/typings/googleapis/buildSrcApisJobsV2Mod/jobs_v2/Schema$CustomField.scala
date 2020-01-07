package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource that represents the custom data not captured by the standard
  * fields.
  */
@js.native
trait Schema$CustomField extends js.Object {
  /**
    * Optional.  The values of the custom data.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CustomField {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$CustomField = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomField]
  }
}

