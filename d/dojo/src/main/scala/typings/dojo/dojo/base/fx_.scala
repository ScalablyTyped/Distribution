package typings.dojo.dojo.base

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/fx.html
  *
  * This module defines the base dojo/_base/fx implementation.
  *
  */
@js.native
trait fx_ extends js.Object {
  /**
    * A simpler interface to animateProperty(), also returns
    * an instance of Animation but begins the animation
    * immediately, unlike nearly every other Dojo animation API.
    * Simpler (but somewhat less powerful) version
    * of animateProperty.  It uses defaults for many basic properties
    * and allows for positional parameters to be used in place of the
    * packed "property bag" which is used for other Dojo animation
    * methods.
    *
    * The Animation object returned will be already playing, so
    * calling play() on it again is (usually) a no-op.
    *
    * @param node a DOM node or the id of a node to animate CSS properties on
    * @param properties
    * @param duration               OptionalThe number of milliseconds over which the animationshould run. Defaults to the global animation default duration(350ms).
    * @param easing               OptionalAn easing function over which to calculate accelerationand deceleration of the animation through its duration.A default easing algorithm is provided, but you mayplug in any you wish. A large selection of easing algorithmsare available in dojo/fx/easing.
    * @param onEnd               OptionalA function to be called when the animation finishesrunning.
    * @param delay               OptionalThe number of milliseconds to delay beginning theanimation by. The default is 0.
    */
  def anim(node: String, properties: js.Object): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double, easing: js.Function): js.Any = js.native
  def anim(node: String, properties: js.Object, duration: Double, easing: js.Function, onEnd: js.Function): js.Any = js.native
  def anim(
    node: String,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function,
    delay: Double
  ): js.Any = js.native
  /**
    * A simpler interface to animateProperty(), also returns
    * an instance of Animation but begins the animation
    * immediately, unlike nearly every other Dojo animation API.
    * Simpler (but somewhat less powerful) version
    * of animateProperty.  It uses defaults for many basic properties
    * and allows for positional parameters to be used in place of the
    * packed "property bag" which is used for other Dojo animation
    * methods.
    *
    * The Animation object returned will be already playing, so
    * calling play() on it again is (usually) a no-op.
    *
    * @param node a DOM node or the id of a node to animate CSS properties on
    * @param properties
    * @param duration               OptionalThe number of milliseconds over which the animationshould run. Defaults to the global animation default duration(350ms).
    * @param easing               OptionalAn easing function over which to calculate accelerationand deceleration of the animation through its duration.A default easing algorithm is provided, but you mayplug in any you wish. A large selection of easing algorithmsare available in dojo/fx/easing.
    * @param onEnd               OptionalA function to be called when the animation finishesrunning.
    * @param delay               OptionalThe number of milliseconds to delay beginning theanimation by. The default is 0.
    */
  def anim(node: HTMLElement, properties: js.Object): js.Any = js.native
  def anim(node: HTMLElement, properties: js.Object, duration: Double): js.Any = js.native
  def anim(node: HTMLElement, properties: js.Object, duration: Double, easing: js.Function): js.Any = js.native
  def anim(
    node: HTMLElement,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function
  ): js.Any = js.native
  def anim(
    node: HTMLElement,
    properties: js.Object,
    duration: Double,
    easing: js.Function,
    onEnd: js.Function,
    delay: Double
  ): js.Any = js.native
  /**
    * Returns an animation that will transition the properties of
    * node defined in args depending how they are defined in
    * args.properties
    * Foundation of most dojo/_base/fx
    * animations. It takes an object of "properties" corresponding to
    * style properties, and animates them in parallel over a set
    * duration.
    *
    * @param args An object with the following properties:properties (Object, optional): A hash map of style properties to Objects describing the transition,such as the properties of _Line with an additional 'units' propertynode (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def animateProperty(): js.Any = js.native
  def animateProperty(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that will fade node defined in 'args' from
    * its current opacity to fully opaque.
    *
    * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def fadeIn(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that will fade node defined in 'args'
    * from its current opacity to fully transparent.
    *
    * @param args An object with the following properties:node (DOMNode|String): The node referenced in the animationduration (Integer, optional): Duration of the animation in milliseconds.easing (Function, optional): An easing function.
    */
  def fadeOut(args: js.Object): js.Any = js.native
}

