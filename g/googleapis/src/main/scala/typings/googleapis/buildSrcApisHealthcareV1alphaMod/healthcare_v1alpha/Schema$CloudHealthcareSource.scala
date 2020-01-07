package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Healthcare API resource.
  */
@js.native
trait Schema$CloudHealthcareSource extends js.Object {
  /**
    * Full path of a Cloud Healthcare API resource.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$CloudHealthcareSource {
  @scala.inline
  def apply(name: String = null): Schema$CloudHealthcareSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CloudHealthcareSource]
  }
}

