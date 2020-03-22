package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var marker: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(id: String | Double = null, marker: String = null, value: js.Any = null): AnonId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

