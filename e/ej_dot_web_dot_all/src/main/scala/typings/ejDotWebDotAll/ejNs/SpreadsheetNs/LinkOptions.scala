package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkOptions extends js.Object {
  /** Pass the cell address in the cell
    */
  var cellAddress: js.UndefOr[String] = js.undefined
  /** Pass the text address in the cell
    */
  var text: js.UndefOr[String] = js.undefined
  /** Pass the web address in the cell
    */
  var webAddress: js.UndefOr[String] = js.undefined
}

object LinkOptions {
  @scala.inline
  def apply(cellAddress: String = null, text: String = null, webAddress: String = null): LinkOptions = {
    val __obj = js.Dynamic.literal()
    if (cellAddress != null) __obj.updateDynamic("cellAddress")(cellAddress)
    if (text != null) __obj.updateDynamic("text")(text)
    if (webAddress != null) __obj.updateDynamic("webAddress")(webAddress)
    __obj.asInstanceOf[LinkOptions]
  }
}

