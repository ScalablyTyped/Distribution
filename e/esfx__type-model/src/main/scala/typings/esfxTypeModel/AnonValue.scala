package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var done: Boolean
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
}

object AnonValue {
  @scala.inline
  def apply(
    done: Boolean,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): AnonValue = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

