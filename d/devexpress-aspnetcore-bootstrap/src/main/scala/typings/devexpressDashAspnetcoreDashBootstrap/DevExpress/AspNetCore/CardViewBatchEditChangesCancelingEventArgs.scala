package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardViewBatchEditChangesCancelingEventArgs extends CancelEventArgs {
  val deletedValues: js.Any
  val insertedValues: js.Any
  val updatedValues: js.Any
}

object CardViewBatchEditChangesCancelingEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): CardViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, deletedValues = deletedValues, insertedValues = insertedValues, sender = sender, updatedValues = updatedValues)
  
    __obj.asInstanceOf[CardViewBatchEditChangesCancelingEventArgs]
  }
}

