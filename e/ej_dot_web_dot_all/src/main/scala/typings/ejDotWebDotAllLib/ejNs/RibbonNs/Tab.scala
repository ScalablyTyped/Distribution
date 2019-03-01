package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  /** Specifies single group or multiple groups and its contents to each tab in the ribbon control.
    * @Default {Array}
    */
  var groups: js.UndefOr[js.Array[TabsGroup]] = js.undefined
  /** Specifies the ID for each tab's content panel.
    * @Default {null}
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text of the tab in the ribbon control.
    * @Default {null}
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Tab {
  @scala.inline
  def apply(groups: js.Array[TabsGroup] = null, id: java.lang.String = null, text: java.lang.String = null): Tab = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (id != null) __obj.updateDynamic("id")(id)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Tab]
  }
}

