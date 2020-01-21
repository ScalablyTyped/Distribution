package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDisksScopedList extends js.Object {
  /**
    * [Output Only] A list of disks contained in this scope.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of disks when
    * the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaDisksScopedList {
  @scala.inline
  def apply(disks: js.Array[SchemaDisk] = null, warning: AnonCode = null): SchemaDisksScopedList = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisksScopedList]
  }
}

