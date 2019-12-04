package typings.dojo.dojox.fx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/split.html
  *
  * Experimental and extended Animations beyond Dojo Core / Base functionality.
  * Provides advanced Lines, Animations, and convenience aliases.
  *
  */
@js.native
trait split extends js.Object {
  /**
    * Animate the effects of adding a class to a node
    * Creates an animation that will animate
    * the properties of a node to the properties
    * defined in a standard CSS .class definition.
    * (calculating the differences itself)
    *
    * @param node A String ID or DomNode referce to animate
    * @param cssClass The CSS class name to add to the node
    * @param args               OptionalAdditional optional dojo.animateProperty arguments, such asduration, easing and so on.
    */
  def addClass(node: String, cssClass: String, args: js.Object): js.Any = js.native
  /**
    * Animate the effects of adding a class to a node
    * Creates an animation that will animate
    * the properties of a node to the properties
    * defined in a standard CSS .class definition.
    * (calculating the differences itself)
    *
    * @param node A String ID or DomNode referce to animate
    * @param cssClass The CSS class name to add to the node
    * @param args               OptionalAdditional optional dojo.animateProperty arguments, such asduration, easing and so on.
    */
  def addClass(node: HTMLElement, cssClass: String, args: js.Object): js.Any = js.native
  /**
    * An add-on to dojo.fx that provides the ability to create
    * a complex property animation based on an array of "keyframes".
    * The Timeline is a replacement for the default dojo._Line.
    * Instead of _Line.getValue returning a float between 0-1,
    * _Timeline.getValue returns an object with all properties and
    * their current values.
    * A property does not have to appear in every keyframe.
    * As in the example below, "height" is transitioned from the first
    * keyframe to the third. "width" is transitioned from the first
    * to the second to the third.
    * Each keyframe can accept the following custom properties:
    *
    * step: String:
    * The start, finish or percentage that this keyframe represents.
    * Allowed parameters are:
    * 0%-100%
    * from (same as 0%, used to conform with the Webkit animation spec)
    * to (same as 100%, used to conform with the Webkit animation spec)
    *
    * ease: String:
    * The string name of a dojo.fx.easing ease. Defaults to "linear". Use
    * the suffix name of the ease, like: "quadIn", not: "dojo.fx.quadIn".
    *
    * @param options The parameters passed to the timeline animation. Includes:keys: Array: An array of objects, with style properties and values.duration: Duration of the animation in milliseconds.  Defaults to 1000.
    * @param node The node to manipulate
    */
  def animateTimeline(options: js.Object, node: HTMLElement): Unit = js.native
  /**
    * Animate a node flipping following a specific direction
    * Returns an animation that will flip the
    * node around a central axis:
    *
    * if args.dir is "left" or "right" --> y axis
    *
    * if args.dir is "top" or "bottom" --> x axis
    *
    * This effect is obtained using a border distortion applied to a helper node.
    *
    * The user can specify three background colors for the helper node:
    *
    * darkColor: the darkest color reached during the animation
    * lightColor: the brightest color
    * endColor: the final backgroundColor for the node
    * Other arguments:
    *
    * depth: Float
    * 0 <= depth <= 1 overrides the computed "depth"
    * (0: min distortion, 1: max distortion)
    *
    *
    * whichAnim: String
    * "first"            : the first half animation
    * "last"             : the second one
    * "both" (default) : both
    *
    * axis: String
    * "center" (default)      : the node is flipped around its center
    * "shortside"             : the node is flipped around its "short" (in perspective) side
    * "longside"              : the node is flipped around its "long" (in perspective) side
    * "cube"                  : the node flips around the central axis of the cube
    *
    * shift: Integer:
    *   node translation, perpendicular to the rotation axis
    *
    *
    * @param args
    */
  def flip(args: js.Object): Unit = js.native
  /**
    * An extension to dojox.fx.flip providing a more 3d-like rotation
    * An extension to dojox.fx.flip providing a more 3d-like rotation.
    * Behaves the same as dojox.fx.flip, using the same attributes and
    * other standard dojo.Animation properties.
    *
    * @param args
    */
  def flipCube(args: js.Object): Unit = js.native
  /**
    * An extension to dojox.fx.flip providing a decomposition in rows * cols flipping elements
    * An extension to dojox.fx.flip providing a page flip effect.
    * Behaves the same as dojox.fx.flip, using the same attributes and
    * other standard dojo.Animation properties and
    *
    * cols: Integer columns
    * rows: Integer rows
    * duration: the single flip duration
    *
    * @param args
    */
  def flipGrid(args: js.Object): Unit = js.native
  /**
    * An extension to dojox.fx.flip providing a page flip like animation.
    * An extension to dojox.fx.flip providing a page flip effect.
    * Behaves the same as dojox.fx.flip, using the same attributes and
    * other standard dojo.Animation properties.
    *
    * @param args
    */
  def flipPage(args: js.Object): Unit = js.native
  /**
    * Animate the effects of removing a class from a node
    * Creates an animation that will animate the properties of a
    * node (args.node) to the properties calculated after removing
    * a standard CSS className from a that node.
    *
    * calls dojo.removeClass(args.cssClass) onEnd of animation
    *
    * standard dojo.Animation object rules apply.
    *
    * @param node
    * @param cssClass
    * @param args
    */
  def removeClass(node: js.Any, cssClass: js.Any, args: js.Any): js.Any = js.native
  /**
    * Returns an animation that will smooth-scroll to a node
    * This implementation support either horizontal or vertical scroll, as well as
    * both. In addition, element in iframe can be scrolled to correctly.
    *
    * @param args offset: {x: int, y: int} this will be added to the target positionduration: Duration of the animation in milliseconds.win: a node or window object to scroll
    */
  def smoothScroll(args: js.Object): Unit = js.native
  /**
    * Animate the effects of Toggling a class on a Node
    * creates an animation that will animate the effect of
    * toggling a class on or off of a node.
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    *
    * @param node The domNode (or string of the id) to toggle
    * @param cssClass String of the classname to add to the node
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.
    * @param args               OptionalAdditional dojo.Animation args to pass along.
    */
  def toggleClass(node: String, cssClass: String, condition: Boolean, args: js.Object): js.Any = js.native
  /**
    * Animate the effects of Toggling a class on a Node
    * creates an animation that will animate the effect of
    * toggling a class on or off of a node.
    * Adds a class to node if not present, or removes if present.
    * Pass a boolean condition if you want to explicitly add or remove.
    *
    * @param node The domNode (or string of the id) to toggle
    * @param cssClass String of the classname to add to the node
    * @param condition               OptionalIf passed, true means to add the class, false means to remove.
    * @param args               OptionalAdditional dojo.Animation args to pass along.
    */
  def toggleClass(node: HTMLElement, cssClass: String, condition: Boolean, args: js.Object): js.Any = js.native
}

