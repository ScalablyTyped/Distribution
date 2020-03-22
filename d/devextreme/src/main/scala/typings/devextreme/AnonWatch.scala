package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWatch extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var watch: js.UndefOr[js.Function] = js.undefined
}

object AnonWatch {
  @scala.inline
  def apply(data: js.Any = null, key: js.Any = null, watch: js.Function = null): AnonWatch = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWatch]
  }
}

