package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstancesScopedList extends js.Object {
  /**
    * [Output Only] A list of instances contained in this scope.
    */
  var instances: js.UndefOr[js.Array[Schema$Instance]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of instances
    * when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$InstancesScopedList {
  @scala.inline
  def apply(instances: js.Array[Schema$Instance] = null, warning: Anon_Code = null): Schema$InstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstancesScopedList]
  }
}

