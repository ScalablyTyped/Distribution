package typings.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListValue. */
trait IListValue extends js.Object {
  /** ListValue values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.undefined
}

object IListValue {
  @scala.inline
  def apply(values: js.UndefOr[Null | js.Array[IValue]] = js.undefined): IListValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(values)) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListValue]
  }
}

