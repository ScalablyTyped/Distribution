package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom constraint that specifies a key and a list of allowed values for
  * Istio attributes.
  */
@js.native
trait Schema$PermissionConstraint extends js.Object {
  /**
    * Key of the constraint.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A list of allowed values.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PermissionConstraint {
  @scala.inline
  def apply(key: String = null, values: js.Array[String] = null): Schema$PermissionConstraint = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PermissionConstraint]
  }
}

