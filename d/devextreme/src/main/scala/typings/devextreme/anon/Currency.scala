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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currency extends _format {
  
  var currency: js.UndefOr[String] = js.native
  
  var formatter: js.UndefOr[js.Function1[/* value */ Double | typings.std.Date, String]] = js.native
  
  var parser: js.UndefOr[js.Function1[/* value */ String, Double | typings.std.Date]] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[
    billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
  ] = js.native
}
object Currency {
  
  @scala.inline
  def apply(): Currency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit class CurrencyOps[Self <: Currency] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setFormatter(value: /* value */ Double | typings.std.Date => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setParser(value: /* value */ String => Double | typings.std.Date): Self = this.set("parser", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setType(
      value: billions | currency | day | decimal_ | exponential | fixedPoint | largeNumber | longDate | longTime | millions | millisecond | month | monthAndDay | monthAndYear | percent | quarter | quarterAndYear | shortDate | shortTime | thousands | trillions | year | dayOfWeek | hour | longDateLongTime | minute | second | shortDateShortTime
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
