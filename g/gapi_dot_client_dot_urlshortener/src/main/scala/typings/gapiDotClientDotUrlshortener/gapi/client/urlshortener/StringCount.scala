package typings.gapiDotClientDotUrlshortener.gapi.client.urlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCount extends js.Object {
  /** Number of clicks for this top entry, e.g. for this particular country or browser. */
  var count: js.UndefOr[String] = js.undefined
  /** Label assigned to this top entry, e.g. "US" or "Chrome". */
  var id: js.UndefOr[String] = js.undefined
}

object StringCount {
  @scala.inline
  def apply(count: String = null, id: String = null): StringCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[StringCount]
  }
}

