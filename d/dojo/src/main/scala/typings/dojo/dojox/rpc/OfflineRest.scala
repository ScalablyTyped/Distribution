package typings.dojo.dojox.rpc

import typings.dojo.dojo.data.api.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rpc/OfflineRest.html
  *
  * Makes the REST service be able to store changes in local
  * storage so it can be used offline automatically.
  *
  */
trait OfflineRest extends js.Object {
  /**
    *
    */
  var stores: js.Array[_]
  /**
    * Adds a store to the monitored store for local storage
    *
    * @param store Store to add
    * @param baseQuery               OptionalThis is the base query to should be used to load the items forthe store. Generally you want to load all the items that should beavailable when offline.
    */
  def addStore(store: Read, baseQuery: String): Unit
  /**
    *
    */
  def downloadChanges(): Unit
  /**
    *
    */
  def sendChanges(): Unit
  /**
    *
    */
  def sync(): Unit
  /**
    *
    */
  def turnOffAutoSync(): Unit
}

object OfflineRest {
  @scala.inline
  def apply(
    addStore: (Read, String) => Unit,
    downloadChanges: () => Unit,
    sendChanges: () => Unit,
    stores: js.Array[_],
    sync: () => Unit,
    turnOffAutoSync: () => Unit
  ): OfflineRest = {
    val __obj = js.Dynamic.literal(addStore = js.Any.fromFunction2(addStore), downloadChanges = js.Any.fromFunction0(downloadChanges), sendChanges = js.Any.fromFunction0(sendChanges), stores = stores, sync = js.Any.fromFunction0(sync), turnOffAutoSync = js.Any.fromFunction0(turnOffAutoSync))
  
    __obj.asInstanceOf[OfflineRest]
  }
}

