package typings.ejDotWebDotAll.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSettings extends js.Object {
  /** To allow the Kanban to freeze particular swimlane at the time of scrolling , until scroll reaches next swimlane and it continues.
    * @Default {false}
    */
  var allowFreezeSwimlane: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll height.
    * @Default {0}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Gets or sets an object that indicates to render the Kanban with specified scroll width.
    * @Default {auto}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object ScrollSettings {
  @scala.inline
  def apply(
    allowFreezeSwimlane: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    width: String | Double = null
  ): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFreezeSwimlane)) __obj.updateDynamic("allowFreezeSwimlane")(allowFreezeSwimlane)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollSettings]
  }
}

