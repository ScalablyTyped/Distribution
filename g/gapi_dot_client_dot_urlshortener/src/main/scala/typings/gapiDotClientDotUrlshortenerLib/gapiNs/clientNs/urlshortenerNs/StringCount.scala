package typings
package gapiDotClientDotUrlshortenerLib.gapiNs.clientNs.urlshortenerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCount extends js.Object {
  /** Number of clicks for this top entry, e.g. for this particular country or browser. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** Label assigned to this top entry, e.g. "US" or "Chrome". */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object StringCount {
  @scala.inline
  def apply(count: java.lang.String = null, id: java.lang.String = null): StringCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[StringCount]
  }
}

