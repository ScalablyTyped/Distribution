package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.anon.PartialWatchFileSystemOpt
import typings.node.eventsMod.EventEmitter
import typings.std.Iterable
import typings.std.Map
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object watchFileSystemMod {
  
  @js.native
  trait WatchFileSystem extends StObject {
    
    def watch(files: Iterable[String], dirs: Iterable[String], missing: Iterable[String]): Watcher = js.native
    def watch(files: Iterable[String], dirs: Iterable[String], missing: Iterable[String], startTime: Double): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: Unit,
      callback: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: Unit,
      callback: js.Function,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: Unit,
      callback: Unit,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: PartialWatchFileSystemOpt
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: PartialWatchFileSystemOpt,
      callback: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: PartialWatchFileSystemOpt,
      callback: js.Function,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Double,
      options: PartialWatchFileSystemOpt,
      callback: Unit,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: Unit,
      callback: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: Unit,
      callback: js.Function,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: Unit,
      callback: Unit,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: PartialWatchFileSystemOpt
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: PartialWatchFileSystemOpt,
      callback: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: PartialWatchFileSystemOpt,
      callback: js.Function,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    def watch(
      files: Iterable[String],
      dirs: Iterable[String],
      missing: Iterable[String],
      startTime: Unit,
      options: PartialWatchFileSystemOpt,
      callback: Unit,
      callbackUndelayed: js.Function
    ): Watcher = js.native
    
    var watcher: Watchpack = js.native
    
    var wfs: js.UndefOr[typings.forkTsCheckerWebpackPlugin.anon.Watcher] = js.native
  }
  
  trait WatchFileSystemOptions extends StObject {
    
    var aggregateTimeout: Double
    
    var followSymlinks: Boolean
    
    var ignored: String | RegExp | (js.Array[String | RegExp])
    
    var poll: Boolean
  }
  object WatchFileSystemOptions {
    
    @scala.inline
    def apply(
      aggregateTimeout: Double,
      followSymlinks: Boolean,
      ignored: String | RegExp | (js.Array[String | RegExp]),
      poll: Boolean
    ): WatchFileSystemOptions = {
      val __obj = js.Dynamic.literal(aggregateTimeout = aggregateTimeout.asInstanceOf[js.Any], followSymlinks = followSymlinks.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], poll = poll.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchFileSystemOptions]
    }
    
    @scala.inline
    implicit class WatchFileSystemOptionsMutableBuilder[Self <: WatchFileSystemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregateTimeout(value: Double): Self = StObject.set(x, "aggregateTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnored(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignored", js.Array(value :_*))
      
      @scala.inline
      def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV4
    - typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV5
  */
  trait Watcher extends StObject
  object Watcher {
    
    @scala.inline
    def WatcherV4(
      close: () => Unit,
      getContextTimestamps: () => Map[String, Double],
      getFileTimestamps: () => Map[String, Double],
      pause: () => Unit
    ): typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV4 = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimestamps = js.Any.fromFunction0(getContextTimestamps), getFileTimestamps = js.Any.fromFunction0(getFileTimestamps), pause = js.Any.fromFunction0(pause))
      __obj.asInstanceOf[typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV4]
    }
    
    @scala.inline
    def WatcherV5(
      close: () => Unit,
      getContextTimeInfoEntries: () => Map[String, Double],
      getFileTimeInfoEntries: () => Map[String, Double],
      pause: () => Unit
    ): typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV5 = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimeInfoEntries = js.Any.fromFunction0(getContextTimeInfoEntries), getFileTimeInfoEntries = js.Any.fromFunction0(getFileTimeInfoEntries), pause = js.Any.fromFunction0(pause))
      __obj.asInstanceOf[typings.forkTsCheckerWebpackPlugin.watchFileSystemMod.WatcherV5]
    }
  }
  
  trait WatcherV4
    extends StObject
       with Watcher {
    
    def close(): Unit
    
    def getContextTimestamps(): Map[String, Double]
    
    def getFileTimestamps(): Map[String, Double]
    
    def pause(): Unit
  }
  object WatcherV4 {
    
    @scala.inline
    def apply(
      close: () => Unit,
      getContextTimestamps: () => Map[String, Double],
      getFileTimestamps: () => Map[String, Double],
      pause: () => Unit
    ): WatcherV4 = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimestamps = js.Any.fromFunction0(getContextTimestamps), getFileTimestamps = js.Any.fromFunction0(getFileTimestamps), pause = js.Any.fromFunction0(pause))
      __obj.asInstanceOf[WatcherV4]
    }
    
    @scala.inline
    implicit class WatcherV4MutableBuilder[Self <: WatcherV4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContextTimestamps(value: () => Map[String, Double]): Self = StObject.set(x, "getContextTimestamps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileTimestamps(value: () => Map[String, Double]): Self = StObject.set(x, "getFileTimestamps", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    }
  }
  
  trait WatcherV5
    extends StObject
       with Watcher {
    
    def close(): Unit
    
    def getContextTimeInfoEntries(): Map[String, Double]
    
    def getFileTimeInfoEntries(): Map[String, Double]
    
    def pause(): Unit
  }
  object WatcherV5 {
    
    @scala.inline
    def apply(
      close: () => Unit,
      getContextTimeInfoEntries: () => Map[String, Double],
      getFileTimeInfoEntries: () => Map[String, Double],
      pause: () => Unit
    ): WatcherV5 = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getContextTimeInfoEntries = js.Any.fromFunction0(getContextTimeInfoEntries), getFileTimeInfoEntries = js.Any.fromFunction0(getFileTimeInfoEntries), pause = js.Any.fromFunction0(pause))
      __obj.asInstanceOf[WatcherV5]
    }
    
    @scala.inline
    implicit class WatcherV5MutableBuilder[Self <: WatcherV5] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContextTimeInfoEntries(value: () => Map[String, Double]): Self = StObject.set(x, "getContextTimeInfoEntries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileTimeInfoEntries(value: () => Map[String, Double]): Self = StObject.set(x, "getFileTimeInfoEntries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
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
