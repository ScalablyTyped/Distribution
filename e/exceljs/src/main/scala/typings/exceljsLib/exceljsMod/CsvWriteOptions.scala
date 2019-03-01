package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvWriteOptions extends js.Object {
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
}

object CsvWriteOptions {
  @scala.inline
  def apply(dateFormat: java.lang.String = null): CsvWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    __obj.asInstanceOf[CsvWriteOptions]
  }
}

