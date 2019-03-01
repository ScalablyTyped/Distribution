package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameManager extends js.Object {
  /** Specifies the name for the cell or a range.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the address for the cell or a range.
    */
  var refersto: js.UndefOr[java.lang.String] = js.undefined
}

object NameManager {
  @scala.inline
  def apply(name: java.lang.String = null, refersto: java.lang.String = null): NameManager = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (refersto != null) __obj.updateDynamic("refersto")(refersto)
    __obj.asInstanceOf[NameManager]
  }
}

