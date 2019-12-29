package typings.extjs.Ext.menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparator extends IItem {
  /** [Config Option] (String) */
  var separatorCls: js.UndefOr[String] = js.undefined
}

object ISeparator {
  @scala.inline
  def apply(IItem: IItem = null, separatorCls: String = null): ISeparator = {
    val __obj = js.Dynamic.literal()
    if (IItem != null) js.Dynamic.global.Object.assign(__obj, IItem)
    if (separatorCls != null) __obj.updateDynamic("separatorCls")(separatorCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeparator]
  }
}

