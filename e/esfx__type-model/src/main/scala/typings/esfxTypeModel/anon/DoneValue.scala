package typings.esfxTypeModel.anon

import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneValue extends js.Object {
  var done: `true`
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.undefined
}

object DoneValue {
  @scala.inline
  def apply(
    done: `true`,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = null
  ): DoneValue = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneValue]
  }
}

