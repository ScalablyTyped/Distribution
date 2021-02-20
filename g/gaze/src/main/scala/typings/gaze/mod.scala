package typings.gaze

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(patterns: String): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: String,
    options: Null,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(patterns: String, options: Options): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: String,
    options: Options,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String]): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: js.Array[String],
    options: Null,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[String], options: Options): Unit = js.native
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  def apply(
    patterns: js.Array[String],
    options: Options,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  
  @JSImport("gaze", "Gaze")
  @js.native
  class Gaze protected () extends StObject {
    def this(patterns: String) = this()
    def this(patterns: js.Array[String]) = this()
    def this(patterns: String, options: Options) = this()
    def this(patterns: js.Array[String], options: Options) = this()
    def this(
      patterns: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: String,
      options: Null,
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: String,
      options: Options,
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: Null,
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: Options,
      callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    
    /**
      * Adds file(s) patterns to be watched.
      */
    def add(patterns: String): Unit = js.native
    def add(patterns: js.Array[String]): Unit = js.native
    
    /**
      * Unwatch all files and reset the watch instance.
      */
    def close(): Unit = js.native
    
    /**
      * Wrapper for EventEmitter.emit. `added`|`changed`|`renamed`|`deleted` events will also trigger the `all` event.
      */
    def emit(
      event: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Boolean = js.native
    
    /**
      * Returns the currently watched files with relative paths.
      */
    def relative(dir: String, unixify: Boolean): js.Array[String] = js.native
    
    /**
      * Removes a file or directory from being watched. Does not recurse directories.
      */
    def remove(filepath: String): Unit = js.native
    
    /**
      * Returns the currently watched files.
      */
    def watched(): js.Array[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gaze.gazeStrings.auto
    - typings.gaze.gazeStrings.watch
    - typings.gaze.gazeStrings.poll
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def auto: typings.gaze.gazeStrings.auto = "auto".asInstanceOf[typings.gaze.gazeStrings.auto]
    
    @scala.inline
    def poll: typings.gaze.gazeStrings.poll = "poll".asInstanceOf[typings.gaze.gazeStrings.poll]
    
    @scala.inline
    def watch: typings.gaze.gazeStrings.watch = "watch".asInstanceOf[typings.gaze.gazeStrings.watch]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The current working directory to base file patterns from. Default is `process.cwd()`.
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Delay for events called in succession for the same file/event in milliseconds.
      */
    var debounceDelay: js.UndefOr[Double] = js.native
    
    /**
      * Interval to pass to fs.watchFile.
      */
    var interval: js.UndefOr[Double] = js.native
    
    /**
      * Force the watch mode. Either 'auto' (default),
      * 'watch' (force native events), or 'poll' (force stat polling).
      */
    var mode: js.UndefOr[Mode] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDebounceDelay(value: Double): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
