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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchMode extends StObject {
  
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
  implicit class SearchModeMutableBuilder[Self <: SearchMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceFunction1(value: /* options */ DataSource => _): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setGroupInterval(value: day | hour | minute | month | quarter | second | year | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSearchMode(value: contains | startswith | equals): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
