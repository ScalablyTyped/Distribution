package typings.dojo.dojo

import typings.dojo.dojo._base.fx.Animation
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/fx.html
  *
  * Effects library on top of Base animations
  *
  */
trait fx extends js.Object {
  /**
    * Collection of easing functions to use beyond the default
    * dojo._defaultEasing function.
    *
    */
  var easing: js.Object
  /**
    *
    */
  def Toggler(): Unit
  /**
    * Chain a list of dojo/_base/fx.Animations to run in sequence
    * Return a dojo/_base/fx.Animation which will play all passed
    * dojo/_base/fx.Animation instances in sequence, firing its own
    * synthesized events simulating a single animation. (eg:
    * onEnd of this animation means the end of the chain,
    * not the individual animations within)
    *
    * @param animations
    */
  def chain(animations: js.Array[Animation]): js.Any
  /**
    * Combine a list of dojo/_base/fx.Animations to run in parallel
    * Combine an array of dojo/_base/fx.Animations to run in parallel,
    * providing a new dojo/_base/fx.Animation instance encompasing each
    * animation, firing standard animation events.
    *
    * @param animations
    */
  def combine(animations: js.Array[Animation]): js.Any
  /**
    * Slide a node to a new top/left position
    * Returns an animation that will slide "node"
    * defined in args Object from its current position to
    * the position defined by (args.left, args.top).
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on). Special args membersare top and left, which indicate the new position to slide to.
    */
  def slideTo(args: js.Object): js.Any
  /**
    * Expand a node to it's natural height.
    * Returns an animation that will expand the
    * node defined in 'args' object from it's current height to
    * it's natural height (with no scrollbar).
    * Node must have no margin/border/padding.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeIn(args: js.Object): js.Any
  /**
    * Shrink a node to nothing and hide it.
    * Returns an animation that will shrink node defined in "args"
    * from it's current height to 1px, and then hide it.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeOut(args: js.Object): js.Any
}

@JSGlobal("dojo.fx")
@js.native
object fx extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/fx/Toggler.html
    *
    * A simple dojo.Animation toggler API.
    * class constructor for an animation toggler. It accepts a packed
    * set of arguments about what type of animation to use in each
    * direction, duration, etc. All available members are mixed into
    * these animations from the constructor (for example, node,
    * showDuration, hideDuration).
    *
    * @param args
    */
  @js.native
  class Toggler protected () extends js.Object {
    def this(args: js.Any) = this()
    /**
      * Time in milliseconds to run the hide Animation
      *
      */
    var hideDuration: Double = js.native
    /**
      * the node to target for the showing and hiding animations
      *
      */
    var node: HTMLElement = js.native
    /**
      * Time in milliseconds to run the show Animation
      *
      */
    var showDuration: Double = js.native
    /**
      * Toggle the node to hidden
      *
      * @param delay               OptionalAmount of time to stall playing the hide animation
      */
    def hide(): js.Any = js.native
    def hide(delay: Double): js.Any = js.native
    /**
      * The function that returns the dojo.Animation to hide the node
      *
      * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
      */
    def hideFunc(args: js.Object): js.Any = js.native
    /**
      * Toggle the node to showing
      *
      * @param delay               OptionalAmount of time to stall playing the show animation
      */
    def show(): js.Any = js.native
    def show(delay: Double): js.Any = js.native
    /**
      * The function that returns the dojo.Animation to show the node
      *
      * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
      */
    def showFunc(args: js.Object): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/fx/easing.html
    *
    * Collection of easing functions to use beyond the default
    * dojo._defaultEasing function.
    * Easing functions are used to manipulate the iteration through
    * an dojo.Animations _Line. _Line being the properties of an Animation,
    * and the easing function progresses through that Line determining
    * how quickly (or slowly) it should go. Or more accurately: modify
    * the value of the _Line based on the percentage of animation completed.
    *
    * All functions follow a simple naming convention of "ease type" + "when".
    * If the name of the function ends in Out, the easing described appears
    * towards the end of the animation. "In" means during the beginning,
    * and InOut means both ranges of the Animation will applied, both
    * beginning and end.
    *
    * One does not call the easing function directly, it must be passed to
    * the easing property of an animation.
    *
    */
  @js.native
  trait easing extends js.Object {
    /**
      * An easing function that starts away from the target,
      * and quickly accelerates towards the end value.
      *
      * Use caution when the easing will cause values to become
      * negative as some properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def backIn(): Double = js.native
    def backIn(n: Double): Double = js.native
    /**
      * An easing function combining the effects of backIn and backOut
      * An easing function combining the effects of backIn and backOut.
      * Use caution when the easing will cause values to become negative
      * as some properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def backInOut(): Double = js.native
    def backInOut(n: Double): Double = js.native
    /**
      * An easing function that pops past the range briefly, and slowly comes back.
      * An easing function that pops past the range briefly, and slowly comes back.
      *
      * Use caution when the easing will cause values to become negative as some
      * properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def backOut(): Double = js.native
    def backOut(n: Double): Double = js.native
    /**
      * An easing function that 'bounces' near the beginning of an Animation
      *
      * @param n               Optional
      */
    def bounceIn(): Double = js.native
    def bounceIn(n: Double): Double = js.native
    /**
      * An easing function that 'bounces' at the beginning and end of the Animation
      *
      * @param n               Optional
      */
    def bounceInOut(): Double = js.native
    def bounceInOut(n: Double): Double = js.native
    /**
      * An easing function that 'bounces' near the end of an Animation
      *
      * @param n               Optional
      */
    def bounceOut(): Double = js.native
    def bounceOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def circIn(): Double = js.native
    def circIn(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def circInOut(): Double = js.native
    def circInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def circOut(): js.Any = js.native
    def circOut(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def cubicIn(): js.Any = js.native
    def cubicIn(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def cubicInOut(): Double = js.native
    def cubicInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def cubicOut(): Double = js.native
    def cubicOut(n: Double): Double = js.native
    /**
      * An easing function the elastically snaps from the start value
      * An easing function the elastically snaps from the start value
      *
      * Use caution when the elasticity will cause values to become negative
      * as some properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def elasticIn(): Double = js.native
    def elasticIn(n: Double): Double = js.native
    /**
      * An easing function that elasticly snaps around the value, near
      * the beginning and end of the Animation.
      * An easing function that elasticly snaps around the value, near
      * the beginning and end of the Animation.
      *
      * Use caution when the elasticity will cause values to become
      * negative as some properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def elasticInOut(): Double = js.native
    def elasticInOut(n: Double): Double = js.native
    /**
      * An easing function that elasticly snaps around the target value,
      * near the end of the Animation
      * An easing function that elasticly snaps around the target value,
      * near the end of the Animation
      *
      * Use caution when the elasticity will cause values to become
      * negative as some properties cannot be set to negative values.
      *
      * @param n               Optional
      */
    def elasticOut(): Double = js.native
    def elasticOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def expoIn(): js.Any = js.native
    def expoIn(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def expoInOut(): Double = js.native
    def expoInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def expoOut(): Double = js.native
    def expoOut(n: Double): Double = js.native
    /**
      * A linear easing function
      *
      * @param n               Optional
      */
    def linear(): Double = js.native
    def linear(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quadIn(): js.Any = js.native
    def quadIn(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def quadInOut(): Double = js.native
    def quadInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quadOut(): Double = js.native
    def quadOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quartIn(): js.Any = js.native
    def quartIn(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def quartInOut(): Double = js.native
    def quartInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quartOut(): Double = js.native
    def quartOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quintIn(): js.Any = js.native
    def quintIn(n: Double): js.Any = js.native
    /**
      *
      * @param n               Optional
      */
    def quintInOut(): Double = js.native
    def quintInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def quintOut(): Double = js.native
    def quintOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def sineIn(): Double = js.native
    def sineIn(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def sineInOut(): Double = js.native
    def sineInOut(n: Double): Double = js.native
    /**
      *
      * @param n               Optional
      */
    def sineOut(): js.Any = js.native
    def sineOut(n: Double): js.Any = js.native
  }
  
}

