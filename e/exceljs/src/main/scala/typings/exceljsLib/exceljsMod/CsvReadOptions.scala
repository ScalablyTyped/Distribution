package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvReadOptions extends js.Object {
  var dateFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var map: js.UndefOr[js.Function2[/* value */ js.Any, /* index */ scala.Double, _]] = js.undefined
}

object CsvReadOptions {
  @scala.inline
  def apply(
    dateFormats: js.Array[java.lang.String] = null,
    map: (/* value */ js.Any, /* index */ scala.Double) => _ = null
  ): CsvReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormats != null) __obj.updateDynamic("dateFormats")(dateFormats)
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction2(map))
    __obj.asInstanceOf[CsvReadOptions]
  }
}

