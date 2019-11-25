package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRange extends js.Object {
  /** The name of the named range. */
  var name: js.UndefOr[String] = js.undefined
  /** The ID of the named range. */
  var namedRangeId: js.UndefOr[String] = js.undefined
  /** The range this represents. */
  var range: js.UndefOr[GridRange] = js.undefined
}

object NamedRange {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null, range: GridRange = null): NamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedRange]
  }
}

