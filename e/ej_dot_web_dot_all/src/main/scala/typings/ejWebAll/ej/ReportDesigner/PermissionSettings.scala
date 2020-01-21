package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionSettings extends js.Object {
  /** Shows or hides the create, edit and delete options in data source pane with the help of ej.ReportDesigner.Permission enum.
    * @Default {ej.ReportDesigner.Permission.All}
    */
  var dataSource: js.UndefOr[Permission | String] = js.undefined
}

object PermissionSettings {
  @scala.inline
  def apply(dataSource: Permission | String = null): PermissionSettings = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionSettings]
  }
}

