package typings.gaze.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gaze", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(patterns: String): Unit = js.native
  def apply(
    patterns: String,
    options: Null,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  def apply(patterns: String, options: Options): Unit = js.native
  def apply(
    patterns: String,
    options: Options,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  def apply(patterns: js.Array[String]): Unit = js.native
  def apply(
    patterns: js.Array[String],
    options: Null,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
  def apply(patterns: js.Array[String], options: Options): Unit = js.native
  def apply(
    patterns: js.Array[String],
    options: Options,
    callback: js.Function2[/* error */ Error | Null, /* watcher */ Gaze, Unit]
  ): Unit = js.native
}

