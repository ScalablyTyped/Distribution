package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches budget orders.
  *
  * Typical usage:
  *
  *      var budgetOrderIterator = AdsApp.budgetOrders()
  *        .withCondition("Status = ACTIVE")
  *        .get();
  */
trait BudgetOrderSelector
  extends StObject
     with Selector[BudgetOrderIterator]
     with SelectorWithCondition
object BudgetOrderSelector {
  
  inline def apply(get: () => BudgetOrderIterator, withCondition: String => BudgetOrderSelector): BudgetOrderSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), withCondition = js.Any.fromFunction1(withCondition))
    __obj.asInstanceOf[BudgetOrderSelector]
  }
}
