package typings.fileServicesTypes

import typings.fileServicesTypes.distCommonFsTypesMod.IFileSystemStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWatchApiMod {
  
  trait IWatchEvent extends StObject {
    
    var path: String
    
    var stats: IFileSystemStats | Null
  }
  object IWatchEvent {
    
    inline def apply(path: String): IWatchEvent = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = null)
      __obj.asInstanceOf[IWatchEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWatchEvent] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: IFileSystemStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsNull: Self = StObject.set(x, "stats", null)
    }
  }
  
  @js.native
  trait IWatchService extends StObject {
    
    /**
      * Add a global watch event listener.
      * It will receive watch events for all watched paths.
      */
    def addGlobalListener(listener: WatchEventListener): Unit = js.native
    
    /**
      * Clears all registered global watch event listeners.
      */
    def clearGlobalListeners(): Unit = js.native
    
    /**
      * Remove a global watch event listener.
      */
    def removeGlobalListener(listener: WatchEventListener): Unit = js.native
    
    /**
      * Unwatch all watched paths.
      */
    def unwatchAllPaths(): js.Promise[Unit] = js.native
    
    /**
      * Stop watching `path` (file or directory).
      * if `listener` is provided, it will stop receiving watch events for `path`.
      * if `listener is not provided, path will be unwatched with its listeners cleared.
      */
    def unwatchPath(path: String): js.Promise[Unit] = js.native
    def unwatchPath(path: String, listener: WatchEventListener): js.Promise[Unit] = js.native
    
    /**
      * Start watching `path` (file or directory).
      * if `listener` is provided, it will receive watch events for `path`.
      * Any global listeners will also receive events for path.
      */
    def watchPath(path: String): js.Promise[Unit] = js.native
    def watchPath(path: String, listener: WatchEventListener): js.Promise[Unit] = js.native
  }
  
  type WatchEventListener = js.Function1[/* watchEvent */ IWatchEvent, Unit]
}
