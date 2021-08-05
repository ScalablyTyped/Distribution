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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchMode extends StObject {
  
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  var dataSource: js.UndefOr[
    js.Array[js.Any] | (js.Function1[/* options */ DataSource, js.Any]) | DataSourceOptions
  ] = js.undefined
  
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SearchMode {
  
  inline def apply(): SearchMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMode]
  }
  
  extension [Self <: SearchMode](x: Self) {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setDataSource(value: js.Array[js.Any] | (js.Function1[/* options */ DataSource, js.Any]) | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceFunction1(value: /* options */ DataSource => js.Any): Self = StObject.set(x, "dataSource", js.Any.fromFunction1(value))
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    inline def setGroupInterval(value: day | hour | minute | month | quarter | second | year | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSearchMode(value: contains | startswith | equals): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
