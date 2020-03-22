package typings.devextreme.mod._Global_

import typings.devextreme.mod.DevExpress.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryEventObject extends event {
  var cancel: js.UndefOr[Boolean] = js.undefined
}

object JQueryEventObject {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined): JQueryEventObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryEventObject]
  }
}

