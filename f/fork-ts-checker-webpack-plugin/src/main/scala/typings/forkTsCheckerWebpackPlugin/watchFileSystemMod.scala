package typings.forkTsCheckerWebpackPlugin

import typings.events.mod.EventEmitter
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.ignore
import typings.std.Map
import typings.std.Set
import typings.webpack.mod.FileSystemInfoEntry
import typings.webpack.mod.WatchOptions
import typings.webpack.mod.Watcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchFileSystemMod {
  
  type Watch = js.Function7[
    /* files */ js.Iterable[String], 
    /* directories */ js.Iterable[String], 
    /* missing */ js.Iterable[String], 
    /* startTime */ Double, 
    /* options */ WatchOptions, 
    /* callback */ js.Function5[
      /* arg0 */ js.UndefOr[js.Error], 
      /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
      /* arg3 */ Set[String], 
      /* arg4 */ Set[String], 
      Unit
    ], 
    /* callbackUndelayed */ js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit], 
    Watcher
  ]
  
  trait WatchFileSystem extends StObject {
    
    @JSName("watch")
    var watch_Original: Watch
    @JSName("watch")
    def watch_ignore(
      files: js.Iterable[String],
      directories: js.Iterable[String],
      missing: js.Iterable[String],
      startTime: Double,
      options: WatchOptions,
      callback: js.Function5[
          /* arg0 */ js.UndefOr[js.Error], 
          /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg3 */ Set[String], 
          /* arg4 */ Set[String], 
          Unit
        ],
      callbackUndelayed: js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]
    ): Watcher
    
    var watcher: js.UndefOr[Watchpack] = js.undefined
    
    var wfs: js.UndefOr[typings.forkTsCheckerWebpackPlugin.anon.Watcher] = js.undefined
  }
  object WatchFileSystem {
    
    inline def apply(
      watch: (/* files */ js.Iterable[String], /* directories */ js.Iterable[String], /* missing */ js.Iterable[String], /* startTime */ Double, /* options */ WatchOptions, /* callback */ js.Function5[
          /* arg0 */ js.UndefOr[js.Error], 
          /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
          /* arg3 */ Set[String], 
          /* arg4 */ Set[String], 
          Unit
        ], /* callbackUndelayed */ js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]) => Watcher
    ): WatchFileSystem = {
      val __obj = js.Dynamic.literal(watch = js.Any.fromFunction7(watch))
      __obj.asInstanceOf[WatchFileSystem]
    }
    
    extension [Self <: WatchFileSystem](x: Self) {
      
      inline def setWatch(
        value: (/* files */ js.Iterable[String], /* directories */ js.Iterable[String], /* missing */ js.Iterable[String], /* startTime */ Double, /* options */ WatchOptions, /* callback */ js.Function5[
              /* arg0 */ js.UndefOr[js.Error], 
              /* arg1 */ Map[String, FileSystemInfoEntry | ignore], 
              /* arg2 */ Map[String, FileSystemInfoEntry | ignore], 
              /* arg3 */ Set[String], 
              /* arg4 */ Set[String], 
              Unit
            ], /* callbackUndelayed */ js.Function2[/* arg0 */ String, /* arg1 */ Double, Unit]) => Watcher
      ): Self = StObject.set(x, "watch", js.Any.fromFunction7(value))
      
      inline def setWatcher(value: Watchpack): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
      
      inline def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
      
      inline def setWfs(value: typings.forkTsCheckerWebpackPlugin.anon.Watcher): Self = StObject.set(x, "wfs", value.asInstanceOf[js.Any])
      
      inline def setWfsUndefined: Self = StObject.set(x, "wfs", js.undefined)
    }
  }
  
  @js.native
  trait Watchpack extends EventEmitter {
    
    def _onChange(item: String, mtime: Double, file: String): Unit = js.native
    def _onChange(item: String, mtime: Double, file: String, `type`: String): Unit = js.native
    
    def _onRemove(item: String, file: String): Unit = js.native
    def _onRemove(item: String, file: String, `type`: String): Unit = js.native
  }
}
