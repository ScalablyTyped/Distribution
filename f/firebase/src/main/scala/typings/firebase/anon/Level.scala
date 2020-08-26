package typings.firebase.anon

import typings.firebase.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  /**
    * Threshhold log level. Only logs at or above this level trigger the `logCallback`
    * passed to `onLog`.
    */
  var level: LogLevel = js.native
}

object Level {
  @scala.inline
  def apply(level: LogLevel): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
  }
  
}

