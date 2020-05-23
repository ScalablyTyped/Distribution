package typings.firebase.anon

import typings.firebase.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  /**
    * Threshhold log level. Only logs at or above this level trigger the `logCallback`
    * passed to `onLog`.
    */
  var level: LogLevel
}

object Level {
  @scala.inline
  def apply(level: LogLevel): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

