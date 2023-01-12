package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RemoteStore - An interface to remotely stored data, basically providing a
  * wrapper around the Datastore that is more reliable for the rest of the
  * system.
  *
  * RemoteStore is responsible for maintaining the connection to the server.
  * - maintaining a list of active listens.
  * - reconnecting when the connection is dropped.
  * - resuming all the active listens on reconnect.
  *
  * RemoteStore handles all incoming events from the Datastore.
  * - listening to the watch stream and repackaging the events as RemoteEvents
  * - notifying SyncEngine of any changes to the active listens.
  *
  * RemoteStore takes writes from other components and handles them reliably.
  * - pulling pending mutations from LocalStore and sending them to Datastore.
  * - retrying mutations that failed because of network problems.
  * - acking mutations to the SyncEngine once they are accepted or rejected.
  */
trait RemoteStore extends StObject {
  
  /**
    * SyncEngine to notify of watch and write events. This must be set
    * immediately after construction.
    */
  var remoteSyncer: RemoteSyncer
}
object RemoteStore {
  
  inline def apply(remoteSyncer: RemoteSyncer): RemoteStore = {
    val __obj = js.Dynamic.literal(remoteSyncer = remoteSyncer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteStore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteStore] (val x: Self) extends AnyVal {
    
    inline def setRemoteSyncer(value: RemoteSyncer): Self = StObject.set(x, "remoteSyncer", value.asInstanceOf[js.Any])
  }
}
