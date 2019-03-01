package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparator extends IItem

object ISeparator {
  @scala.inline
  def apply(IItem: IItem = null, baseCls: java.lang.String = null): ISeparator = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IItem)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    __obj.asInstanceOf[ISeparator]
  }
}

