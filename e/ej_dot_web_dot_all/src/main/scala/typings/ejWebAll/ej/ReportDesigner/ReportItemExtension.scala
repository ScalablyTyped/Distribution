package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportItemExtension extends js.Object {
  /** Gets or sets the category name for the report item.
    * @Default {empty}
    */
  var category: js.UndefOr[String] = js.undefined
  /** Gets or sets the class name of the report item.
    * @Default {empty}
    */
  var className: js.UndefOr[String] = js.undefined
  /** Gets or sets the name for custom report item to display in the widgets pane tile.
    * @Default {empty}
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** Gets or sets the image class name to load image in widgets pane tile.
    * @Default {empty}
    */
  var imageClass: js.UndefOr[String] = js.undefined
  /** Gets or sets the name for the report item.
    * @Default {empty}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Gets information to provide content for custom report item tooltip.
    * @Default {null}
    */
  var toolTip: js.UndefOr[js.Any] = js.undefined
}

object ReportItemExtension {
  @scala.inline
  def apply(
    category: String = null,
    className: String = null,
    displayName: String = null,
    imageClass: String = null,
    name: String = null,
    toolTip: js.Any = null
  ): ReportItemExtension = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportItemExtension]
  }
}

