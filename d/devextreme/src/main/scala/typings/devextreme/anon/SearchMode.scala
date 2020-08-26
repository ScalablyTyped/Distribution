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

@js.native
trait SearchMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.native
  var dataSource: js.UndefOr[js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions] = js.native
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var searchMode: js.UndefOr[contains | startswith | equals] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SearchMode {
  @scala.inline
  def apply(): SearchMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMode]
  }
  @scala.inline
  implicit class SearchModeOps[Self <: SearchMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowSearch(value: Boolean): Self = this.set("allowSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearch: Self = this.set("allowSearch", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSourceFunction1(value: /* options */ DataSource => _): Self = this.set("dataSource", js.Any.fromFunction1(value))
    @scala.inline
    def setDataSource(value: js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setGroupInterval(value: day | hour | minute | month | quarter | second | year | Double): Self = this.set("groupInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupInterval: Self = this.set("groupInterval", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSearchMode(value: contains | startswith | equals): Self = this.set("searchMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchMode: Self = this.set("searchMode", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

