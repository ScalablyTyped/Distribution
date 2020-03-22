package typings.devextreme

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSource extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[DataSourceOptions] = js.undefined
}

object AnonDataSource {
  @scala.inline
  def apply(component: js.Any = null, dataSource: DataSourceOptions = null): AnonDataSource = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataSource]
  }
}

