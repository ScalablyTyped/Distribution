package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var dataSource: js.UndefOr[DataSourceOptions] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(component: js.Any = null, dataSource: DataSourceOptions = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

