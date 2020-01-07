package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource level annotation.
  */
@js.native
trait Schema$ResourceAnnotation extends js.Object {
  var label: js.UndefOr[String] = js.native
}

object Schema$ResourceAnnotation {
  @scala.inline
  def apply(label: String = null): Schema$ResourceAnnotation = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceAnnotation]
  }
}

