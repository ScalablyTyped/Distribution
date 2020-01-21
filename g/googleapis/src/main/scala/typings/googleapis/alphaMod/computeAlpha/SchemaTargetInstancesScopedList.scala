package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetInstancesScopedList extends js.Object {
  /**
    * A list of target instances contained in this scope.
    */
  var targetInstances: js.UndefOr[js.Array[SchemaTargetInstance]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaTargetInstancesScopedList {
  @scala.inline
  def apply(targetInstances: js.Array[SchemaTargetInstance] = null, warning: AnonCode = null): SchemaTargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetInstances != null) __obj.updateDynamic("targetInstances")(targetInstances.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetInstancesScopedList]
  }
}

