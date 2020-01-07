package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains multiple sensitive information findings for each resource slice.
  */
@js.native
trait Schema$Detail extends js.Object {
  var findings: js.UndefOr[js.Array[Schema$Finding]] = js.native
}

object Schema$Detail {
  @scala.inline
  def apply(findings: js.Array[Schema$Finding] = null): Schema$Detail = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Detail]
  }
}

