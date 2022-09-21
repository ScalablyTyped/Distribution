package typings.globaloffensive.mod

import typings.globaloffensive.anon.ActivateFanToken
import typings.globaloffensive.anon.GCGOINGDOWN
import typings.globaloffensive.anon.MatchId
import typings.globaloffensive.globaloffensiveStrings.connectedToGC
import typings.globaloffensive.globaloffensiveStrings.connectionStatus
import typings.globaloffensive.globaloffensiveStrings.disconnectedFromGC
import typings.globaloffensive.globaloffensiveStrings.inspectItemInfo
import typings.globaloffensive.globaloffensiveStrings.inspectItemTimedOut
import typings.globaloffensive.globaloffensiveStrings.itemAcquired
import typings.globaloffensive.globaloffensiveStrings.itemChanged
import typings.globaloffensive.globaloffensiveStrings.itemCustomizationNotification
import typings.globaloffensive.globaloffensiveStrings.itemRemoved
import typings.globaloffensive.globaloffensiveStrings.matchList
import typings.globaloffensive.globaloffensiveStrings.playersProfile
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalOffensive extends EventEmitter {
  
  /**
    * A big object containing account data and some statistics including players in-game.
    * `undefined` until `accountData` is emitted.
    */
  val accountData: js.UndefOr[AccountData] = js.native
  
  /**
    * Put an item in your inventory into a casket (storage unit) you own.
    * Assuming the request succeeds, `itemRemoved` will be emitted for the item that was put into the casket,
    * and `itemCustomizationNotification` will be emitted with notification type `CasketAdded` for the casket.
    * @param casketId The ID of the casket (storage unit) you want to put an item into
    * @param itemId The ID of the item you want to put into the casket
    * @since v2.1
    */
  def addToCasket(casketId: String, itemId: String): Unit = js.native
  
  /**
    * Deletes a particular item from your inventory.
    * This is a destructive operation, which cannot be undone.
    * @param itemId The ID of the item you want to delete
    * @since v1.3
    */
  def deleteItem(itemId: String): Unit = js.native
  
  /**
    * Loads the contents of a storage unit.
    * Note that calling this will have the GC load the contents of the storage unit using the same mechanism as your actual inventory,
    * so items in the storage unit will appear in the `inventory` property,
    * and `itemAcquired` will be emitted for each item.
    * Each item in your `inventory` that is contained inside of a storage unit has a property `casket_id`,
    * the value of which is a string containing the ID of the storage unit that contains that item.
    *
    * It appears that under some circumstances,
    * the GC might load these items into your inventory without calling this method,
    * so if you are using inventory to see what items are in your `inventory`,
    * you will need to check `casket_id` to filter out items stored in storage units.
    *
    * @param casketId The ID of the casket (storage unit) you want to get the contents of
    * @param callback A function to be called once the contents are loaded
    * @since v2.1
    */
  def getCasketContents(
    casketId: String,
    callback: js.Function2[/* err */ js.Error | Null, /* items */ js.Array[InventoryItem], Unit]
  ): js.Promise[js.Array[InventoryItem]] = js.native
  
  /**
    * `true` if we're currently connected to the GC, `false` otherwise.
    * You should only call methods when we have an active GC session.
    */
  val haveGCSession: Boolean = js.native
  
  def inspectItem(owner: String): Unit = js.native
  def inspectItem(owner: String, assetid: String): Unit = js.native
  def inspectItem(owner: String, assetid: String, d: String): Unit = js.native
  def inspectItem(owner: String, assetid: String, d: String, callback: js.Function1[/* item */ ItemInfo, Unit]): Unit = js.native
  def inspectItem(owner: String, assetid: String, d: Unit, callback: js.Function1[/* item */ ItemInfo, Unit]): Unit = js.native
  def inspectItem(owner: String, assetid: Unit, d: String): Unit = js.native
  def inspectItem(owner: String, assetid: Unit, d: String, callback: js.Function1[/* item */ ItemInfo, Unit]): Unit = js.native
  def inspectItem(owner: String, assetid: Unit, d: Unit, callback: js.Function1[/* item */ ItemInfo, Unit]): Unit = js.native
  /**
    * Sends the same request to the GC that the official client sends when you inspect an item.
    * If all parameters are correct and the GC is in a good mood, returns the item's data.
    * Using this for an item your account owns is useless as all the data is already available in `inventory`.
    *
    * The response will arrive in the callback and in the `inspectItemInfo` event.
    *
    * As of v2.1.0, the request will time out if no response is received in 10 seconds.
    * If this happens, `inspectItemTimedOut` will be emitted.
    *
    * @param owner The numeric SteamID or market listing ID of the owning Steam account or market listing,
    *              as a string; or an entire inspect link.
    * @param assetid If `owner` is not an entire inspect link, this is the numeric asset ID of this item, as a string
    *                (the number following the "A" character)
    * @param d If `owner` is not an entire inspect link, this is the "D" number from the inspect link
    *          (the last number following the "D" character)
    * @param callback Called if all parameters are valid when Steam responds to us.
    *
    * @since v1.1
    */
  def inspectItem(owner: typings.steamid.mod.^): Unit = js.native
  def inspectItem(owner: typings.steamid.mod.^, assetid: String): Unit = js.native
  def inspectItem(owner: typings.steamid.mod.^, assetid: String, d: String): Unit = js.native
  def inspectItem(
    owner: typings.steamid.mod.^,
    assetid: String,
    d: String,
    callback: js.Function1[/* item */ ItemInfo, Unit]
  ): Unit = js.native
  def inspectItem(
    owner: typings.steamid.mod.^,
    assetid: String,
    d: Unit,
    callback: js.Function1[/* item */ ItemInfo, Unit]
  ): Unit = js.native
  def inspectItem(owner: typings.steamid.mod.^, assetid: Unit, d: String): Unit = js.native
  def inspectItem(
    owner: typings.steamid.mod.^,
    assetid: Unit,
    d: String,
    callback: js.Function1[/* item */ ItemInfo, Unit]
  ): Unit = js.native
  def inspectItem(
    owner: typings.steamid.mod.^,
    assetid: Unit,
    d: Unit,
    callback: js.Function1[/* item */ ItemInfo, Unit]
  ): Unit = js.native
  
  /**
    * An array containing the items in your inventory.
    * `undefined` until `connectedToGC` is emitted.
    */
  val inventory: js.UndefOr[js.Array[InventoryItem]] = js.native
  
  /**
    * Renames a particular item in your inventory, using a given name tag.
    * You can rename storage units for free by passing `0` as the `nameTagId`.
    * @param nameTagId The ID of the name tag you want to consume to do this
    * @param itemId The ID of the item you want to rename
    * @param name A string containing the item's new name
    * @since v2.1
    */
  def nameItem(nameTagId: String, itemId: String, name: String): Unit = js.native
  
  @JSName("off")
  def off_accountData(
    event: typings.globaloffensive.globaloffensiveStrings.accountData,
    listener: js.Function1[/* args */ js.Array[/* accountData */ AccountData], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connectedToGC(event: connectedToGC, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("off")
  def off_connectionStatus(
    event: connectionStatus,
    listener: js.Function1[/* args */ js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_disconnectedFromGC(
    event: disconnectedFromGC,
    listener: js.Function1[/* args */ js.Array[/* reason */ ValueOf[GCGOINGDOWN]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_inspectItemInfo(event: inspectItemInfo, listener: js.Function1[/* args */ js.Array[/* item */ ItemInfo], Unit]): this.type = js.native
  @JSName("off")
  def off_inspectItemTimedOut(
    event: inspectItemTimedOut,
    listener: js.Function1[/* args */ js.Array[/* assetid */ String], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemAcquired(event: itemAcquired, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("off")
  def off_itemChanged(
    event: itemChanged,
    listener: js.Function1[/* args */ js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_itemCustomizationNotification(
    event: itemCustomizationNotification,
    listener: js.Function1[
      /* args */ js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_itemRemoved(event: itemRemoved, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("off")
  def off_matchList(
    event: matchList,
    listener: js.Function1[/* args */ js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_playersProfile(event: playersProfile, listener: js.Function1[/* args */ js.Array[/* profile */ Profile], Unit]): this.type = js.native
  
  @JSName("on")
  def on_accountData(
    event: typings.globaloffensive.globaloffensiveStrings.accountData,
    listener: js.Function1[/* args */ js.Array[/* accountData */ AccountData], Unit]
  ): this.type = js.native
  // EVENTS
  @JSName("on")
  def on_connectedToGC(event: connectedToGC, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("on")
  def on_connectionStatus(
    event: connectionStatus,
    listener: js.Function1[/* args */ js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnectedFromGC(
    event: disconnectedFromGC,
    listener: js.Function1[/* args */ js.Array[/* reason */ ValueOf[GCGOINGDOWN]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_inspectItemInfo(event: inspectItemInfo, listener: js.Function1[/* args */ js.Array[/* item */ ItemInfo], Unit]): this.type = js.native
  @JSName("on")
  def on_inspectItemTimedOut(
    event: inspectItemTimedOut,
    listener: js.Function1[/* args */ js.Array[/* assetid */ String], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemAcquired(event: itemAcquired, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("on")
  def on_itemChanged(
    event: itemChanged,
    listener: js.Function1[/* args */ js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_itemCustomizationNotification(
    event: itemCustomizationNotification,
    listener: js.Function1[
      /* args */ js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_itemRemoved(event: itemRemoved, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("on")
  def on_matchList(
    event: matchList,
    listener: js.Function1[/* args */ js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_playersProfile(event: playersProfile, listener: js.Function1[/* args */ js.Array[/* profile */ Profile], Unit]): this.type = js.native
  
  @JSName("once")
  def once_accountData(
    event: typings.globaloffensive.globaloffensiveStrings.accountData,
    listener: js.Function1[/* args */ js.Array[/* accountData */ AccountData], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connectedToGC(event: connectedToGC, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("once")
  def once_connectionStatus(
    event: connectionStatus,
    listener: js.Function1[/* args */ js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnectedFromGC(
    event: disconnectedFromGC,
    listener: js.Function1[/* args */ js.Array[/* reason */ ValueOf[GCGOINGDOWN]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_inspectItemInfo(event: inspectItemInfo, listener: js.Function1[/* args */ js.Array[/* item */ ItemInfo], Unit]): this.type = js.native
  @JSName("once")
  def once_inspectItemTimedOut(
    event: inspectItemTimedOut,
    listener: js.Function1[/* args */ js.Array[/* assetid */ String], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemAcquired(event: itemAcquired, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("once")
  def once_itemChanged(
    event: itemChanged,
    listener: js.Function1[/* args */ js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_itemCustomizationNotification(
    event: itemCustomizationNotification,
    listener: js.Function1[
      /* args */ js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_itemRemoved(event: itemRemoved, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("once")
  def once_matchList(
    event: matchList,
    listener: js.Function1[/* args */ js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_playersProfile(event: playersProfile, listener: js.Function1[/* args */ js.Array[/* profile */ Profile], Unit]): this.type = js.native
  
  def removeAllListeners(
    event: connectedToGC | disconnectedFromGC | typings.globaloffensive.globaloffensiveStrings.accountData | connectionStatus | matchList | inspectItemInfo | inspectItemTimedOut | itemAcquired | itemChanged | itemRemoved | itemCustomizationNotification | playersProfile
  ): this.type = js.native
  
  /**
    * Remove an item from a casket (storage unit) you own and put it into your inventory.
    * Assuming the request succeeds, `itemAcquired` will be emitted for the item that was removed from the casket,
    * and `itemCustomizationNotification` will be emitted with notification type `CasketRemoved` for the casket.
    * @param casketId The ID of the casket (storage unit) you want to remove an item from
    * @param itemId The ID of the item you want to remove from the casket
    * @since v2.1
    */
  def removeFromCasket(casketId: String, itemId: String): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_accountData(
    event: typings.globaloffensive.globaloffensiveStrings.accountData,
    listener: js.Function1[/* args */ js.Array[/* accountData */ AccountData], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_connectedToGC(event: connectedToGC, listener: js.Function1[/* args */ js.Array[Any], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_connectionStatus(
    event: connectionStatus,
    listener: js.Function1[/* args */ js.Tuple2[/* status */ ValueOf[GCGOINGDOWN], /* data */ Any], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_disconnectedFromGC(
    event: disconnectedFromGC,
    listener: js.Function1[/* args */ js.Array[/* reason */ ValueOf[GCGOINGDOWN]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_inspectItemInfo(event: inspectItemInfo, listener: js.Function1[/* args */ js.Array[/* item */ ItemInfo], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_inspectItemTimedOut(
    event: inspectItemTimedOut,
    listener: js.Function1[/* args */ js.Array[/* assetid */ String], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_itemAcquired(event: itemAcquired, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_itemChanged(
    event: itemChanged,
    listener: js.Function1[/* args */ js.Tuple2[/* oldItem */ InventoryItem, /* item */ InventoryItem], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_itemCustomizationNotification(
    event: itemCustomizationNotification,
    listener: js.Function1[
      /* args */ js.Tuple2[/* itemIds */ js.Array[String], /* notificationType */ ValueOf[ActivateFanToken]], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_itemRemoved(event: itemRemoved, listener: js.Function1[/* args */ js.Array[/* item */ InventoryItem], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_matchList(
    event: matchList,
    listener: js.Function1[/* args */ js.Tuple2[/* matches */ js.Array[Match], /* data */ MatchesData], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_playersProfile(event: playersProfile, listener: js.Function1[/* args */ js.Array[/* profile */ Profile], Unit]): this.type = js.native
  
  /**
    * Requests stats for a historical game.
    * Listen for the `matchList` event to get your response.
    * @param shareCodeOrDetails Either a share code as a string, or an object containing properties `matchId`, `outcomeId`, `token`.
    * @since v2.2
    */
  def requestGame(shareCodeOrDetails: String): Unit = js.native
  def requestGame(shareCodeOrDetails: MatchId): Unit = js.native
  
  def requestLiveGameForUser(steamid: String): Unit = js.native
  /**
    * Request live game info for a specific user.
    * Listen for the `matchList` event to get your response.
    * @param steamid the users steamid
    */
  def requestLiveGameForUser(steamid: typings.steamid.mod.^): Unit = js.native
  
  /**
    * Request a list of current live tournament games. This is the list you see in the client under Watch -> Live.
    * Listen for the `matchList` event to get your response.
    */
  def requestLiveGames(): Unit = js.native
  
  def requestPlayersProfile(steamid: String): Unit = js.native
  def requestPlayersProfile(steamid: String, callback: js.Function1[/* profile */ Profile, Unit]): Unit = js.native
  /**
    * Sends the same request to the GC that viewing the CSGO player profile from the in-game friendlist sends.
    * Returns the same information that you would get in-game.
    * This returns the same protobuf that is used when you request your own profile data, so most of it stays empty.
    * @param steamid The numeric SteamID of the Steam account to pull profile data for.
    *                Needs to be playing CSGO and be on the friend list of the requesting account.
    * @param callback Called if all parameters are valid when Steam responds to us.
    * @since v1.2
    */
  def requestPlayersProfile(steamid: typings.steamid.mod.^): Unit = js.native
  def requestPlayersProfile(steamid: typings.steamid.mod.^, callback: js.Function1[/* profile */ Profile, Unit]): Unit = js.native
  
  def requestRecentGames(steamid: String): Unit = js.native
  /**
    * Request a list of recent games (max. 8).
    * This is the list you see in the client under Watch -> Your Matches.
    * Listen for the `matchList` event to get your response.
    * @param steamid the users steamid
    */
  def requestRecentGames(steamid: typings.steamid.mod.^): Unit = js.native
}
