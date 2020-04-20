package typings.esfxTypeModel

import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoneValue extends js.Object {
  var done: `true`
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.undefined
}

object AnonDoneValue {
  @scala.inline
  def apply(
    done: `true`,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = null
  ): AnonDoneValue = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoneValue]
  }
}

