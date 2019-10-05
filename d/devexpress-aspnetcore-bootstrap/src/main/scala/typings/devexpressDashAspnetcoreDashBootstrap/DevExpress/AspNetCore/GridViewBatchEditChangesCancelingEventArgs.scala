package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridViewBatchEditChangesCancelingEventArgs extends CancelEventArgs {
  val deletedValues: js.Any
  val insertedValues: js.Any
  val updatedValues: js.Any
}

object GridViewBatchEditChangesCancelingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): GridViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, deletedValues = deletedValues, insertedValues = insertedValues, sender = sender, updatedValues = updatedValues)
  
    __obj.asInstanceOf[GridViewBatchEditChangesCancelingEventArgs]
  }
}

