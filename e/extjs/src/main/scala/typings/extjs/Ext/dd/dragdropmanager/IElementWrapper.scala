package typings.extjs.Ext.dd.dragdropmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementWrapper extends js.Object {
  /** [Property] (Object) */
  var css: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var el: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var id: js.UndefOr[js.Any] = js.undefined
}

object IElementWrapper {
  @scala.inline
  def apply(css: js.Any = null, el: js.Any = null, id: js.Any = null): IElementWrapper = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css)
    if (el != null) __obj.updateDynamic("el")(el)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[IElementWrapper]
  }
}

