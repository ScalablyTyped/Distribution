package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AcceleratorTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of accelerator types contained in this scope.
    */
  var acceleratorTypes: js.UndefOr[js.Array[Schema$AcceleratorType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the accelerator
    * types list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$AcceleratorTypesScopedList {
  @scala.inline
  def apply(acceleratorTypes: js.Array[Schema$AcceleratorType] = null, warning: Anon_Code = null): Schema$AcceleratorTypesScopedList = {
    val __obj = js.Dynamic.literal()
    if (acceleratorTypes != null) __obj.updateDynamic("acceleratorTypes")(acceleratorTypes.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AcceleratorTypesScopedList]
  }
}

