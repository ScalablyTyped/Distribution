package typings.fileServicesNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchServiceMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IWatchService * / any */ @JSImport("@file-services/node/dist/watch-service", "NodeWatchService")
  @js.native
  /**
    * Construct a new Node file system watch service
    */
  open class NodeWatchService () extends StObject {
    def this(options: INodeWatchServiceOptions) = this()
    
    def addGlobalListener(
      listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchEventListener */ Any
    ): Unit = js.native
    
    def clearGlobalListeners(): Unit = js.native
    
    /* private */ var emitEvent: Any = js.native
    
    /* private */ var ensureFsWatcher: Any = js.native
    
    /** path to actual FSWatcher instance opened for it */
    /* private */ var fsWatchers: Any = js.native
    
    /** user's subsribed global listeners */
    /* private */ var globalListeners: Any = js.native
    
    /* private */ var onDirectoryEvent: Any = js.native
    
    /**
      * Debounces watch events while retaining whether one of
      * them was a 'rename' event
      */
    /* private */ var onPathEvent: Any = js.native
    
    /* private */ var onWatchError: Any = js.native
    
    /** resolved options (default + user) */
    /* private */ var options: Any = js.native
    
    /** path to its pending event (debounced watch event) */
    /* private */ var pendingEvents: Any = js.native
    
    def removeGlobalListener(
      listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchEventListener */ Any
    ): Unit = js.native
    
    /* private */ var statSafe: Any = js.native
    
    def unwatchAllPaths(): js.Promise[Unit] = js.native
    
    def unwatchPath(path: String): js.Promise[Unit] = js.native
    def unwatchPath(
      path: String,
      listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchEventListener */ Any
    ): js.Promise[Unit] = js.native
    
    def watchPath(path: String): js.Promise[Unit] = js.native
    def watchPath(
      path: String,
      listener: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatchEventListener */ Any
    ): js.Promise[Unit] = js.native
    
    /** all watched paths (including files inside watched directories) */
    /* private */ var watchedPaths: Any = js.native
  }
  
  trait INodeWatchServiceOptions extends StObject {
    
    /**
      * How much time (in ms) to wait for next native watch event before
      * emitting a service watch event
      *
      * @default 200
      */
    var debounceWait: js.UndefOr[Double] = js.undefined
    
    /**
      * Should fs watchers be persistent and keep the process open
      * (until someone calls `unwatchAllPaths()`)
      *
      * @default true
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object INodeWatchServiceOptions {
    
    inline def apply(): INodeWatchServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INodeWatchServiceOptions]
    }
    
    extension [Self <: INodeWatchServiceOptions](x: Self) {
      
      inline def setDebounceWait(value: Double): Self = StObject.set(x, "debounceWait", value.asInstanceOf[js.Any])
      
      inline def setDebounceWaitUndefined: Self = StObject.set(x, "debounceWait", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
