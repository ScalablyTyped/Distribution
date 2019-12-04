package typings.dojo.dojox.fx.ext_dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.fx.ext_dojo.reverse")
@js.native
object reverse extends js.Object {
  /**
    * Synthetic event fired before a Animation begins playing (synchronous)
    *
    */
  var beforeBegin: js.Object = js.native
  /**
    * A two element array of start and end values, or a _Line instance to be
    * used in the Animation.
    *
    */
  /**
    *
    */
  var curve: js.Object = js.native
  /**
    * The time in milliseconds to wait before starting animation after it
    * has been .play()'ed
    *
    */
  var delay: js.Object = js.native
  /**
    * The time in milliseconds the animation will take to run
    *
    */
  var duration: Double = js.native
  /**
    * A Function to adjust the acceleration (or deceleration) of the progress
    * across a _Line
    *
    */
  var easing: js.Object = js.native
  /**
    * Synthetic event fired at each interval of the Animation
    *
    */
  var onAnimate: js.Object = js.native
  /**
    * Synthetic event fired as a Animation begins playing (useful?)
    *
    */
  var onBegin: js.Object = js.native
  /**
    * Synthetic event fired after the final frame of the Animation
    *
    */
  var onEnd: js.Object = js.native
  /**
    * Synthetic event fired when the Animation is paused
    *
    */
  var onPause: js.Object = js.native
  /**
    * Synthetic event fired any time the Animation is play()'ed
    *
    */
  var onPlay: js.Object = js.native
  /**
    * Synthetic event fires when the Animation is stopped
    *
    */
  var onStop: js.Object = js.native
  /**
    * the time in milliseconds to wait before advancing to next frame
    * (used as a fps timer: 1000/rate = fps)
    *
    */
  var rate: js.Object = js.native
  /**
    * The number of times to loop the animation
    *
    */
  var repeat: js.Object = js.native
  /**
    * Sets the progress of the animation.
    *
    * @param percent A percentage in decimal notation (between and including 0.0 and 1.0).
    * @param andPlay               OptionalIf true, play the animation after setting the progress.
    */
  type gotoPercent = js.Function2[/* percent */ Double, /* andPlay */ Boolean, js.Function]
  /**
    * Pauses a running animation.
    *
    */
  type pause = js.Function0[js.Function]
  /**
    * Start the animation.
    *
    * @param delay               OptionalHow many milliseconds to delay before starting.
    * @param gotoStart               OptionalIf true, starts the animation from the beginning; otherwise,starts it from its current position.
    */
  type play = js.Function2[/* delay */ Double, /* gotoStart */ Boolean, js.Any]
  /**
    * The key method added to an animation to enable reversal.
    *
    * @param keepPaused By default, calling reverse() will play the animation ifit was paused. Pass in true to keep it paused (will haveno effect if reverse is called while animation is playing).
    * @param reverseEase               OptionalA function to use for the reverse easing. This allows forthe possibility of custom eases that are not in the dojo.fxlibrary.
    */
  type reverse = js.Function2[/* keepPaused */ Boolean, /* reverseEase */ js.Function, js.Function]
  /**
    * Returns a string token representation of the status of
    * the animation, one of: "paused", "playing", "stopped"
    *
    */
  type status = js.Function0[String]
  /**
    * Stops a running animation.
    *
    * @param gotoEnd               OptionalIf true, the animation will end.
    */
  type stop = js.Function1[/* gotoEnd */ Boolean, js.Function]
}

