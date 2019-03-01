package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualTab extends js.Object {
  /** Specifies the backgroundColor of the contextual tabs and tab set in the ribbon control.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the borderColor of the contextual tabs and tab set in the ribbon control.
    * @Default {null}
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the tabs to present in the contextual tabs and tab set. Refer to the tabs section for adding tabs into the contextual tabs and tab set.
    * @Default {Array}
    */
  var tabs: js.UndefOr[js.Array[_]] = js.undefined
}

object ContextualTab {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    tabs: js.Array[_] = null
  ): ContextualTab = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    __obj.asInstanceOf[ContextualTab]
  }
}

