package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/integers.html
  *
  *
  */
trait integers extends js.Object {
  /**
    *
    * @param value
    * @param arg
    */
  def add(value: js.Any, arg: js.Any): Double
  /**
    * Given a whole number, returns the 1-based requested digit of it
    *
    * @param value
    * @param arg
    */
  def get_digit(value: js.Any, arg: js.Any): Double
}

object integers {
  @scala.inline
  def apply(add: (js.Any, js.Any) => Double, get_digit: (js.Any, js.Any) => Double): integers = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get_digit = js.Any.fromFunction2(get_digit))
  
    __obj.asInstanceOf[integers]
  }
}

