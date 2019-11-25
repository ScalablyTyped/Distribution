package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportDataExtension extends js.Object {
  /** Gets or sets the class name of the data extension.
    * @Default {empty}
    */
  var className: js.UndefOr[String] = js.undefined
  /** Gets or sets the name for data extension item to display in the data pane tile.
    * @Default {empty}
    */
  var displayName: js.UndefOr[String] = js.undefined
  /** Gets or sets the image class name to load image in data pane tile.
    * @Default {empty}
    */
  var imageClass: js.UndefOr[String] = js.undefined
  /** Gets or sets the name of the datasource type.
    * @Default {empty}
    */
  var name: js.UndefOr[String] = js.undefined
}

object ReportDataExtension {
  @scala.inline
  def apply(
    className: String = null,
    displayName: String = null,
    imageClass: String = null,
    name: String = null
  ): ReportDataExtension = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportDataExtension]
  }
}

