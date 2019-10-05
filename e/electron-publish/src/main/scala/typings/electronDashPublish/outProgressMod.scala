package typings.electronDashPublish

import typings.electronDashPublish.outProgressMod.ProgressBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish/out/progress", JSImport.Namespace)
@js.native
object outProgressMod extends js.Object {
  @js.native
  abstract class ProgressBar protected () extends js.Object {
    /**
      * Initialize a `ProgressBar` with the given `fmt` string and `options` or`total`.
      *
      * Options:
      *   - `curr` current completed index
      *   - `total` total number of ticks to complete
      *   - `width` the displayed width of the progress bar defaulting to total
      *   - `stream` the output stream defaulting to stderr
      *   - `head` head character defaulting to complete character
      *   - `complete` completion character defaulting to "="
      *   - `incomplete` incomplete character defaulting to "-"
      *   - `renderThrottle` minimum time between updates in milliseconds defaulting to 16
      *   - `callback` optional function to call when the progress bar completes
      *   - `clear` will clear the progress bar upon termination
      *
      * Tokens:
      *   - `:bar` the progress bar itself
      *   - `:current` current tick number
      *   - `:total` total ticks
      *   - `:elapsed` time elapsed in seconds
      *   - `:percent` completion percentage
      *   - `:eta` eta in seconds
      *   - `:rate` rate of ticks per second
      */
    def this(format: String) = this()
    def this(format: String, options: js.Any) = this()
    var chars: js.Any = js.native
    var complete: js.Any = js.native
    var current: js.Any = js.native
    var currentAmount: Double = js.native
    val format: js.Any = js.native
    var lastDraw: js.Any = js.native
    var start: js.Any = js.native
    var stream: js.Any = js.native
    var tokens: js.Any = js.native
    var total: Double = js.native
    var width: js.Any = js.native
    /**
      * "interrupt" the progress bar and write a message above it.
      */
    def interrupt(message: String): Unit = js.native
    def render(): Unit = js.native
    def terminate(): Unit = js.native
    /**
      * "tick" the progress bar with optional `len` and optional `tokens`.
      */
    def tick(delta: Double): Unit = js.native
    /**
      * "update" the progress bar to represent an exact percentage.
      * The ratio (between 0 and 1) specified will be multiplied by `total` and
      * floored, representing the closest available "tick." For example, if a
      * progress bar has a length of 3 and `update(0.5)` is called, the progress
      * will be set to 1.
      *
      * A ratio of 0.5 will attempt to set the progress to halfway.
      */
    def update(ratio: Double): Unit = js.native
  }
  
  @js.native
  class ProgressCallback protected () extends js.Object {
    def this(progressBar: ProgressBar) = this()
    var nextUpdate: js.Any = js.native
    val progressBar: js.Any = js.native
    var start: js.Any = js.native
    def update(transferred: Double, total: Double): Unit = js.native
  }
  
}

