package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var emptyValue: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
}

object AnonCancel {
  @scala.inline
  def apply(cancel: String = null, emptyValue: String = null, ok: String = null): AnonCancel = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (emptyValue != null) __obj.updateDynamic("emptyValue")(emptyValue.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

