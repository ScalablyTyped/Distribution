package typings.devextreme.anon

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

trait SearchMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions] = js.undefined
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SearchMode {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions = null,
    groupInterval: day | hour | minute | month | quarter | second | year | Double = null,
    height: js.UndefOr[Double] = js.undefined,
    searchMode: contains | startswith | equals = null,
    width: js.UndefOr[Double] = js.undefined
  ): SearchMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMode]
  }
}

