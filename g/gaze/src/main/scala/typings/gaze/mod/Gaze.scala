package typings.gaze.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gaze", "Gaze")
@js.native
class Gaze protected () extends js.Object {
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
