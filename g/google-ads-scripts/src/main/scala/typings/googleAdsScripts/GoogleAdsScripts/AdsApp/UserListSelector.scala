package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Selector
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorOrderBy
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithCondition
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithIds
import typings.googleAdsScripts.GoogleAdsScripts.Base.SelectorWithLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetches user lists. Supports filtering and sorting.
  *
  * Typical usage:
  *
  *      var userListSelector = campaign.targeting()
  *          .userLists()
  *          .withCondition("Impressions > 100")
  *          .orderBy("Clicks DESC");
  *
  *      var userListIterator = userListSelector.get();
  *      while (userListIterator.hasNext()) {
  *        var userList = userListIterator.next();
  *      }
  */
trait UserListSelector
  extends StObject
     with Selector[UserListIterator]
     with SelectorOrderBy
     with SelectorWithCondition
     with SelectorWithIds
     with SelectorWithLimit
object UserListSelector {
  
  inline def apply(
    get: () => UserListIterator,
    orderBy: String => UserListSelector,
    withCondition: String => UserListSelector,
    withIds: js.Array[Double] => UserListSelector,
    withLimit: Double => UserListSelector
  ): UserListSelector = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), orderBy = js.Any.fromFunction1(orderBy), withCondition = js.Any.fromFunction1(withCondition), withIds = js.Any.fromFunction1(withIds), withLimit = js.Any.fromFunction1(withLimit))
    __obj.asInstanceOf[UserListSelector]
  }
}
