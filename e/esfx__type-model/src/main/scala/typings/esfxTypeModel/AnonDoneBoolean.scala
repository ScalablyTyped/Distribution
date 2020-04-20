package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoneBoolean extends js.Object {
  var done: Boolean
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ] = js.undefined
}

object AnonDoneBoolean {
  @scala.inline
  def apply(
    done: Boolean,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any = null
  ): AnonDoneBoolean = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoneBoolean]
  }
}

