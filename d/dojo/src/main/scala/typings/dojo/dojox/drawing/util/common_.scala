package typings.dojo.dojox.drawing.util

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/common.html
  *
  * A collection of common methods used for DojoX Drawing.
  * This singleton is accessible in most Drawing classes
  * as this.util
  *
  */
@JSName("common")
trait common_ extends js.Object {
  /**
    *
    */
  var objects: js.Object
  /**
    * Converts a namespace (typically a tool or a stencil) into
    * an abbreviation
    *
    * @param type
    */
  def abbr(`type`: js.Any): Double
  /**
    * Return angle based on mouse object
    *
    * @param obj Manager.Mouse event.
    * @param snap               OptionalReturns nearest angle within snap limits
    */
  def angle(obj: Event, snap: Double): js.Any
  /**
    * Attempts to determine in a Mouse Object
    * was passed or indiviual numbers. Returns
    * an object.
    *
    */
  def argsToObj(): js.Any
  /**
    * Helper function to attach attributes to SVG and VML raw nodes.
    *
    * @param elem
    * @param prop
    * @param value
    * @param squelchErrors
    */
  def attr(elem: js.Object, prop: String, value: js.Any, squelchErrors: js.Any): Boolean
  /**
    * Get an object that was registered with util.register
    *
    * @param id
    */
  def byId(id: String): js.Any
  /**
    * Ensures the angle in the Mouse Object is within the
    * min and max limits. If not one of those limits is used.
    * Returns an x,y point for the angle used.
    *
    * @param obj
    * @param min
    * @param max
    */
  def constrainAngle(obj: Event, min: Double, max: Double): Event
  /**
    * Convert the passed number to radians.
    *
    * @param n
    */
  def degToRad(n: Double): Double
  /**
    * Return the length derived from the coordinates
    * in the Mouse object. Different from util.length
    * in that this always returns an absolute value.
    *
    */
  def distance(): js.Any
  /**
    *
    * @param num
    */
  def idSetStart(num: js.Any): Unit
  /**
    * Return the length derived from the coordinates
    * in the Mouse object.
    *
    * @param o
    */
  def length(o: Event): js.Any
  /**
    * Subtract an amount from a line
    * x1,y1,x2,y2 represents the Line. 'amt' represents the amount
    * to subtract from it.
    *
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @param amt
    */
  def lineSub(x1: Double, y1: Double, x2: Double, y2: Double, amt: Double): js.Object
  /**
    *
    * @param o1
    * @param o2
    */
  def mixin(o1: js.Any, o2: js.Any): Unit
  /**
    *
    * @param ang
    */
  def oppAngle(ang: Double): Double
  /**
    * A very helpful method. If you know the center
    * (or starting) point, length and angle, find the
    * x,y point at the end of that line.
    *
    * @param cx
    * @param cy
    * @param radius
    * @param angle
    */
  def pointOnCircle(cx: Double, cy: Double, radius: Double, angle: Double): js.Object
  /**
    * Convert the passed number to degrees.
    *
    * @param n
    */
  def radToDeg(n: Double): Double
  /**
    * Return the radians derived from the coordinates
    * in the Mouse object.
    *
    * @param o
    */
  def radians(o: Event): js.Any
  /**
    * Since util is the only Singleton in Drawing (besides
    * keys) it is used to help connect the Drawing object
    * the Toolbar. Since multiple drawings can be on one
    * page, this function serves a little more use than
    * on first apearance.
    *
    * @param obj
    */
  def register(obj: js.Object): Unit
  /**
    * Given two poits of a line, returns the slope.
    *
    * @param p1
    * @param p2
    */
  def slope(p1: js.Object, p2: js.Object): Double
  /**
    * Snaps a line to the nearest angle
    *
    * @param obj
    * @param ca A decimal number fraction of a half circle..5 would snap to 90 degrees.25  would snap to 45 degrees.125 would snap to 22.5 degrees, etc.
    */
  def snapAngle(obj: Event, ca: Double): js.Any
  /**
    * Creates a unique ID.
    *
    * @param str               OptionalIf provided, kept in a map, incrementedand used in the id. Otherwise 'shape' is used.
    */
  def uid(str: String): String
}

object common_ {
  @scala.inline
  def apply(
    abbr: js.Any => Double,
    angle: (Event, Double) => js.Any,
    argsToObj: () => js.Any,
    attr: (js.Object, String, js.Any, js.Any) => Boolean,
    byId: String => js.Any,
    constrainAngle: (Event, Double, Double) => Event,
    degToRad: Double => Double,
    distance: () => js.Any,
    idSetStart: js.Any => Unit,
    length: Event => js.Any,
    lineSub: (Double, Double, Double, Double, Double) => js.Object,
    mixin: (js.Any, js.Any) => Unit,
    objects: js.Object,
    oppAngle: Double => Double,
    pointOnCircle: (Double, Double, Double, Double) => js.Object,
    radToDeg: Double => Double,
    radians: Event => js.Any,
    register: js.Object => Unit,
    slope: (js.Object, js.Object) => Double,
    snapAngle: (Event, Double) => js.Any,
    uid: String => String
  ): common_ = {
    val __obj = js.Dynamic.literal(abbr = js.Any.fromFunction1(abbr), angle = js.Any.fromFunction2(angle), argsToObj = js.Any.fromFunction0(argsToObj), attr = js.Any.fromFunction4(attr), byId = js.Any.fromFunction1(byId), constrainAngle = js.Any.fromFunction3(constrainAngle), degToRad = js.Any.fromFunction1(degToRad), distance = js.Any.fromFunction0(distance), idSetStart = js.Any.fromFunction1(idSetStart), length = js.Any.fromFunction1(length), lineSub = js.Any.fromFunction5(lineSub), mixin = js.Any.fromFunction2(mixin), objects = objects.asInstanceOf[js.Any], oppAngle = js.Any.fromFunction1(oppAngle), pointOnCircle = js.Any.fromFunction4(pointOnCircle), radToDeg = js.Any.fromFunction1(radToDeg), radians = js.Any.fromFunction1(radians), register = js.Any.fromFunction1(register), slope = js.Any.fromFunction2(slope), snapAngle = js.Any.fromFunction2(snapAngle), uid = js.Any.fromFunction1(uid))
  
    __obj.asInstanceOf[common_]
  }
}

