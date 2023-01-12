package typings.gaze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(patterns: String): Unit = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(
    patterns: String,
    options: Null,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    patterns: String,
    options: Unit,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(patterns: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    patterns: String,
    options: Options,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(patterns: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(
    patterns: js.Array[String],
    options: Null,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    patterns: js.Array[String],
    options: Unit,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(patterns: js.Array[String], options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    patterns: js.Array[String],
    options: Options,
    callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("gaze", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gaze", "Gaze")
  @js.native
  open class Gaze protected () extends StObject {
    def this(patterns: String) = this()
    def this(patterns: js.Array[String]) = this()
    def this(patterns: String, options: Options) = this()
    def this(patterns: js.Array[String], options: Options) = this()
    def this(
      patterns: String,
      options: Null,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: String,
      options: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: String,
      options: Options,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: Null,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: Unit,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
    ) = this()
    def this(
      patterns: js.Array[String],
      options: Options,
      callback: js.Function2[/* error */ js.Error | Null, /* watcher */ Gaze, Unit]
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
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
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
    
    inline def auto: typings.gaze.gazeStrings.auto = "auto".asInstanceOf[typings.gaze.gazeStrings.auto]
    
    inline def poll: typings.gaze.gazeStrings.poll = "poll".asInstanceOf[typings.gaze.gazeStrings.poll]
    
    inline def watch: typings.gaze.gazeStrings.watch = "watch".asInstanceOf[typings.gaze.gazeStrings.watch]
  }
  
  trait Options extends StObject {
    
    /**
      * The current working directory to base file patterns from. Default is `process.cwd()`.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Delay for events called in succession for the same file/event in milliseconds.
      */
    var debounceDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Interval to pass to fs.watchFile.
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Force the watch mode. Either 'auto' (default),
      * 'watch' (force native events), or 'poll' (force stat polling).
      */
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebounceDelay(value: Double): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
      
      inline def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
