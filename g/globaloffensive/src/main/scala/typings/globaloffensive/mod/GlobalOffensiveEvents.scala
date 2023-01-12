package typings.globaloffensive.mod

import typings.globaloffensive.anon.ActivateFanToken
import typings.globaloffensive.anon.GCGOINGDOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalOffensiveEvents extends StObject {
  
  var accountData: js.Array[/* accountData */ AccountData]
  
  var connectedToGC: js.Array[Any]
  
  var connectionStatus: js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any]
  
  var disconnectedFromGC: js.Array[/* reason */ ValueOf[GCGOINGDOWN]]
  
  var inspectItemInfo: js.Array[/* item */ ItemInfo]
  
  var inspectItemTimedOut: js.Array[/* assetid */ String]
  
  var itemAcquired: js.Array[/* item */ InventoryItem]
  
  var itemChanged: js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem]
  
  var itemCustomizationNotification: js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]]
  
  var itemRemoved: js.Array[/* item */ InventoryItem]
  
  var matchList: js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData]
  
  var playersProfile: js.Array[/* profile */ Profile]
}
object GlobalOffensiveEvents {
  
  inline def apply(
    accountData: js.Array[/* accountData */ AccountData],
    connectedToGC: js.Array[Any],
    connectionStatus: js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any],
    disconnectedFromGC: js.Array[/* reason */ ValueOf[GCGOINGDOWN]],
    inspectItemInfo: js.Array[/* item */ ItemInfo],
    inspectItemTimedOut: js.Array[/* assetid */ String],
    itemAcquired: js.Array[/* item */ InventoryItem],
    itemChanged: js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem],
    itemCustomizationNotification: js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]],
    itemRemoved: js.Array[/* item */ InventoryItem],
    matchList: js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData],
    playersProfile: js.Array[/* profile */ Profile]
  ): GlobalOffensiveEvents = {
    val __obj = js.Dynamic.literal(accountData = accountData.asInstanceOf[js.Any], connectedToGC = connectedToGC.asInstanceOf[js.Any], connectionStatus = connectionStatus.asInstanceOf[js.Any], disconnectedFromGC = disconnectedFromGC.asInstanceOf[js.Any], inspectItemInfo = inspectItemInfo.asInstanceOf[js.Any], inspectItemTimedOut = inspectItemTimedOut.asInstanceOf[js.Any], itemAcquired = itemAcquired.asInstanceOf[js.Any], itemChanged = itemChanged.asInstanceOf[js.Any], itemCustomizationNotification = itemCustomizationNotification.asInstanceOf[js.Any], itemRemoved = itemRemoved.asInstanceOf[js.Any], matchList = matchList.asInstanceOf[js.Any], playersProfile = playersProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalOffensiveEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalOffensiveEvents] (val x: Self) extends AnyVal {
    
    inline def setAccountData(value: js.Array[/* accountData */ AccountData]): Self = StObject.set(x, "accountData", value.asInstanceOf[js.Any])
    
    inline def setAccountDataVarargs(value: (/* accountData */ AccountData)*): Self = StObject.set(x, "accountData", js.Array(value*))
    
    inline def setConnectedToGC(value: js.Array[Any]): Self = StObject.set(x, "connectedToGC", value.asInstanceOf[js.Any])
    
    inline def setConnectedToGCVarargs(value: Any*): Self = StObject.set(x, "connectedToGC", js.Array(value*))
    
    inline def setConnectionStatus(value: js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any]): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDisconnectedFromGC(value: js.Array[/* reason */ ValueOf[GCGOINGDOWN]]): Self = StObject.set(x, "disconnectedFromGC", value.asInstanceOf[js.Any])
    
    inline def setDisconnectedFromGCVarargs(value: (/* reason */ ValueOf[GCGOINGDOWN])*): Self = StObject.set(x, "disconnectedFromGC", js.Array(value*))
    
    inline def setInspectItemInfo(value: js.Array[/* item */ ItemInfo]): Self = StObject.set(x, "inspectItemInfo", value.asInstanceOf[js.Any])
    
    inline def setInspectItemInfoVarargs(value: (/* item */ ItemInfo)*): Self = StObject.set(x, "inspectItemInfo", js.Array(value*))
    
    inline def setInspectItemTimedOut(value: js.Array[/* assetid */ String]): Self = StObject.set(x, "inspectItemTimedOut", value.asInstanceOf[js.Any])
    
    inline def setInspectItemTimedOutVarargs(value: (/* assetid */ String)*): Self = StObject.set(x, "inspectItemTimedOut", js.Array(value*))
    
    inline def setItemAcquired(value: js.Array[/* item */ InventoryItem]): Self = StObject.set(x, "itemAcquired", value.asInstanceOf[js.Any])
    
    inline def setItemAcquiredVarargs(value: (/* item */ InventoryItem)*): Self = StObject.set(x, "itemAcquired", js.Array(value*))
    
    inline def setItemChanged(value: js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem]): Self = StObject.set(x, "itemChanged", value.asInstanceOf[js.Any])
    
    inline def setItemCustomizationNotification(value: js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]]): Self = StObject.set(x, "itemCustomizationNotification", value.asInstanceOf[js.Any])
    
    inline def setItemRemoved(value: js.Array[/* item */ InventoryItem]): Self = StObject.set(x, "itemRemoved", value.asInstanceOf[js.Any])
    
    inline def setItemRemovedVarargs(value: (/* item */ InventoryItem)*): Self = StObject.set(x, "itemRemoved", js.Array(value*))
    
    inline def setMatchList(value: js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData]): Self = StObject.set(x, "matchList", value.asInstanceOf[js.Any])
    
    inline def setPlayersProfile(value: js.Array[/* profile */ Profile]): Self = StObject.set(x, "playersProfile", value.asInstanceOf[js.Any])
    
    inline def setPlayersProfileVarargs(value: (/* profile */ Profile)*): Self = StObject.set(x, "playersProfile", js.Array(value*))
  }
}
