package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOptions extends js.Object {
  /** Pass the cell address in the cell
    */
  var cellAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the text address in the cell
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the web address in the cell
    */
  var webAddress: js.UndefOr[java.lang.String] = js.undefined
}

object LinkOptions {
  @scala.inline
  def apply(
    cellAddress: java.lang.String = null,
    text: java.lang.String = null,
    webAddress: java.lang.String = null
  ): LinkOptions = {
    val __obj = js.Dynamic.literal()
    if (cellAddress != null) __obj.updateDynamic("cellAddress")(cellAddress)
    if (text != null) __obj.updateDynamic("text")(text)
    if (webAddress != null) __obj.updateDynamic("webAddress")(webAddress)
    __obj.asInstanceOf[LinkOptions]
  }
}

