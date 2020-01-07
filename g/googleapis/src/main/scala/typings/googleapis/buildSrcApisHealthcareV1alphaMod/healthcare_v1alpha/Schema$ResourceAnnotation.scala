package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

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

