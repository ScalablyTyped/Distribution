package typings.dojo.dojox.fx

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/style.html
  *
  * dojox.fx CSS Class Animations
  * a set of functions to animate properties based on
  * normalized CSS class definitions.
  *
  */
@js.native
trait style extends js.Object {
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

