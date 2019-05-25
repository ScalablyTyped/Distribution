package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackstageOptions extends js.Object {
  /** Pass the id to added in backstage
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Pass the item type to added in backstage
    */
  var itemType: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /** Pass the text to added in backstage
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object BackstageOptions {
  @scala.inline
  def apply(id: java.lang.String = null, itemType: stdLib.HTMLElement = null, text: java.lang.String = null): BackstageOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BackstageOptions]
  }
}

