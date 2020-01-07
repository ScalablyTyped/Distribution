package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TransitTableTransitTimeRow extends js.Object {
  var values: js.UndefOr[js.Array[Schema$TransitTableTransitTimeRowTransitTimeValue]] = js.native
}

object Schema$TransitTableTransitTimeRow {
  @scala.inline
  def apply(values: js.Array[Schema$TransitTableTransitTimeRowTransitTimeValue] = null): Schema$TransitTableTransitTimeRow = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransitTableTransitTimeRow]
  }
}

