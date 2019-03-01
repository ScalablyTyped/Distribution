package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditChangesSavingEventArgs extends CancelEventArgs {
  val deletedValues: js.Any
  val insertedValues: js.Any
  val updatedValues: js.Any
}

object GridViewBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): GridViewBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("deletedValues")(deletedValues)
    __obj.updateDynamic("insertedValues")(insertedValues)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("updatedValues")(updatedValues)
    __obj.asInstanceOf[GridViewBatchEditChangesSavingEventArgs]
  }
}

