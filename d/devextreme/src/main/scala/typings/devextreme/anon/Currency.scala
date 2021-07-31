package typings.devextreme.anon

import typings.devextreme.devextremeStrings.billions
import typings.devextreme.devextremeStrings.currency
import typings.devextreme.devextremeStrings.day
import typings.devextreme.devextremeStrings.dayOfWeek
import typings.devextreme.devextremeStrings.decimal_
import typings.devextreme.devextremeStrings.exponential
import typings.devextreme.devextremeStrings.fixedPoint
import typings.devextreme.devextremeStrings.hour
import typings.devextreme.devextremeStrings.largeNumber
import typings.devextreme.devextremeStrings.longDate
import typings.devextreme.devextremeStrings.longDateLongTime
import typings.devextreme.devextremeStrings.longTime
import typings.devextreme.devextremeStrings.millions
import typings.devextreme.devextremeStrings.millisecond
import typings.devextreme.devextremeStrings.minute
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.monthAndDay
import typings.devextreme.devextremeStrings.monthAndYear
import typings.devextreme.devextremeStrings.percent
import typings.devextreme.devextremeStrings.quarter
import typings.devextreme.devextremeStrings.quarterAndYear
import typings.devextreme.devextremeStrings.second
import typings.devextreme.devextremeStrings.shortDate
import typings.devextreme.devextremeStrings.shortDateShortTime
import typings.devextreme.devextremeStrings.shortTime
import typings.devextreme.devextremeStrings.thousands
import typings.devextreme.devextremeStrings.trillions
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.ui._format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency
  extends StObject
     with _format {
  
  var currency: js.UndefOr[String] = js.undefined
  
  var formatter: js.UndefOr[js.Function1[/* value */ Double | typings.std.Date, String]] = js.undefined
  
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | typings.std.Date]] = js.undefined
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.undefined
}
object Currency {
  
  @scala.inline
  def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setParser(value: /* value */ String => Double | typings.std.Date): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setType(
      value: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
