package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataKey extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
}

object AnonDataKey {
  @scala.inline
  def apply(data: js.Any = null, key: js.Any = null): AnonDataKey = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataKey]
  }
}

