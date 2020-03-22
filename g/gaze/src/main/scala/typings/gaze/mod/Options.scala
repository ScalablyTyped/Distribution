package typings.gaze.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  @scala.inline
  def apply(
    cwd: String = null,
    debounceDelay: Int | Double = null,
    interval: Int | Double = null,
    mode: Mode = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (debounceDelay != null) __obj.updateDynamic("debounceDelay")(debounceDelay.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

