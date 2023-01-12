package typings.electron.Electron

import typings.electron.electronStrings.day
import typings.electron.electronStrings.month
import typings.electron.electronStrings.week
import typings.electron.electronStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSubscriptionPeriod extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/product-subscription-period
  /**
    * The number of units per subscription period.
    */
  var numberOfUnits: Double
  
  /**
    * The increment of time that a subscription period is specified in. Can be `day`,
    * `week`, `month`, `year`.
    */
  var unit: day | week | month | year
}
object ProductSubscriptionPeriod {
  
  inline def apply(numberOfUnits: Double, unit: day | week | month | year): ProductSubscriptionPeriod = {
    val __obj = js.Dynamic.literal(numberOfUnits = numberOfUnits.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSubscriptionPeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductSubscriptionPeriod] (val x: Self) extends AnyVal {
    
    inline def setNumberOfUnits(value: Double): Self = StObject.set(x, "numberOfUnits", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: day | week | month | year): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
