package typings.devextreme

import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.equals
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.startswith
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.UndefOr[
    js.Array[_] | (js.Function1[/* options */ AnonDataSource, _]) | DataSourceOptions
  ] = js.undefined
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonSearchMode {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[_] | (js.Function1[/* options */ AnonDataSource, _]) | DataSourceOptions = null,
    groupInterval: day | hour | minute | month | quarter | second | year | Double = null,
    height: Int | Double = null,
    searchMode: contains | startswith | equals = null,
    width: Int | Double = null
  ): AnonSearchMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchMode]
  }
}

