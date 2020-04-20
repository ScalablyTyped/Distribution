package typings.esfxTypeModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThen extends js.Object {
  def `then`(
    onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  ): js.Any
}

object AnonThen {
  @scala.inline
  def apply(
    `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any => js.Any
  ): AnonThen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[AnonThen]
  }
}

