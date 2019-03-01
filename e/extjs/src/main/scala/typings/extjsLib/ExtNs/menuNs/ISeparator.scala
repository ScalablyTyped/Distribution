package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparator extends IItem {
  /** [Config Option] (String) */
  var separatorCls: js.UndefOr[java.lang.String] = js.undefined
}

object ISeparator {
  @scala.inline
  def apply(IItem: IItem = null, separatorCls: java.lang.String = null): ISeparator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IItem)
    if (separatorCls != null) __obj.updateDynamic("separatorCls")(separatorCls)
    __obj.asInstanceOf[ISeparator]
  }
}

