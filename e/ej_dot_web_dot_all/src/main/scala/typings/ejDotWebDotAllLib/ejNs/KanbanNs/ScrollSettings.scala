package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
    * @Default {false}
    */
  var allowFreezeSwimlane: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
    * @Default {0}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
    * @Default {auto}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    allowFreezeSwimlane: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    width: java.lang.String | scala.Double = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFreezeSwimlane)) __obj.updateDynamic("allowFreezeSwimlane")(allowFreezeSwimlane)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

