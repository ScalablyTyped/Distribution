package typings.electronPublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProgressMod {
  
  /* note: abstract class */ @JSImport("electron-publish/out/progress", "ProgressBar")
  @js.native
  open class ProgressBar protected () extends StObject {
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
    def this(format: String, options: Any) = this()
    
    /* private */ var chars: Any = js.native
    
    /* private */ var complete: Any = js.native
    
    /* private */ var current: Any = js.native
    
    def currentAmount_=(value: Double): Unit = js.native
    
    /* private */ val format: Any = js.native
    
    /**
      * "interrupt" the progress bar and write a message above it.
      */
    def interrupt(message: String): Unit = js.native
    
    /* private */ var lastDraw: Any = js.native
    
    def render(): Unit = js.native
    
    /* private */ var start: Any = js.native
    
    /* private */ val stream: Any = js.native
    
    def terminate(): Unit = js.native
    
    /**
      * "tick" the progress bar with optional `len` and optional `tokens`.
      */
    def tick(delta: Double): Unit = js.native
    
    /* private */ var tokens: Any = js.native
    
    var total: Double = js.native
    
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
    
    /* private */ val width: Any = js.native
  }
  
  @JSImport("electron-publish/out/progress", "ProgressCallback")
  @js.native
  open class ProgressCallback protected () extends StObject {
    def this(progressBar: ProgressBar) = this()
    
    /* private */ var nextUpdate: Any = js.native
    
    /* private */ val progressBar: Any = js.native
    
    /* private */ var start: Any = js.native
    
    def update(transferred: Double, total: Double): Unit = js.native
  }
}
