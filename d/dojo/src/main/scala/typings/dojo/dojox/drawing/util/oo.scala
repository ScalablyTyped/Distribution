package typings.dojo.dojox.drawing.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/oo.html
  *
  * Inheritance utilities used in DojoX Drawing
  * Inheritance utilities used in DojoX Drawing.
  * There were designed in a effort to make Drawing as
  * fast as possible - especially in a case where thousands
  * of objects are being loaded. Drawing declare performs
  * about 3 times faster than declare and 2 times
  * faster than Dojox declare. This is not to say Drawing
  * declare is without limitations. It doesn't have the same
  * syntactic sugar and extensibility of the other two. You
  * can't inherit methods. It won't work with Dijit. But it
  * is simple and effective.
  *
  */
trait oo extends js.Object {
  /**
    * Creates a constructor Function from a
    * Function, and collection of methods, and
    * more Functions that are extended.
    * Similar in look and feel to declare as
    * far as order and number of arguments, although
    * constructed a little closer to prototypical
    * inheritance. All arguments passed into the
    * constructor are passed into all sub constructors.
    *
    * Arguments are: Function, [Object|Function....]
    * The first argument is always the base
    * constructor. The last argument is always
    * an object of methods (or empty object) to
    * be mixed in (in the future would like to
    * make that object optional). Remaining
    * arguments are other constructors mixed in
    * using extend() (See below).
    *
    */
  def declare(): js.Any
  /**
    * Extends constructors to inherit from other
    * constructors .
    * Typically not used by itself - it's used as
    * part of declare(). Could be used by itself
    * however, to mix together two or more
    * constructors.
    *
    * Any number of arguments, all must be
    * function constructors. The first is
    * considered the base object and its
    * constructor will fire first.
    *
    */
  def extend(): js.Function
}

object oo {
  @scala.inline
  def apply(declare: () => js.Any, extend: () => js.Function): oo = {
    val __obj = js.Dynamic.literal(declare = js.Any.fromFunction0(declare), extend = js.Any.fromFunction0(extend))
  
    __obj.asInstanceOf[oo]
  }
}

