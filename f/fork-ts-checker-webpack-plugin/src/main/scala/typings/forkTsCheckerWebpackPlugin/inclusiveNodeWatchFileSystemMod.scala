package typings.forkTsCheckerWebpackPlugin

import typings.chokidar.mod.FSWatcher
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStateMod.ForkTsCheckerWebpackPluginState
import typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatchFileSystem
import typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.Watchpack
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inclusiveNodeWatchFileSystemMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/watch/InclusiveNodeWatchFileSystem", "InclusiveNodeWatchFileSystem")
  @js.native
  class InclusiveNodeWatchFileSystem protected ()
    extends StObject
       with WatchFileSystem {
    def this(watchFileSystem: WatchFileSystem, pluginState: ForkTsCheckerWebpackPluginState) = this()
    
    val changedFiles: Set[String] = js.native
    
    val dirsWatchers: Map[String, js.UndefOr[FSWatcher]] = js.native
    
    var paused: js.Any = js.native
    
    var pluginState: js.Any = js.native
    
    val removedFiles: Set[String] = js.native
    
    var watchFileSystem: js.Any = js.native
    
    @JSName("watcher")
    def watcher_MInclusiveNodeWatchFileSystem: Watchpack = js.native
  }
}
