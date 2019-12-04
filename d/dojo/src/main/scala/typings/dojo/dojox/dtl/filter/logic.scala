package typings.dojo.dojox.dtl.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/logic.html
  *
  *
  */
trait logic extends js.Object {
  /**
    * If value is unavailable, use given default
    *
    * @param value
    * @param arg
    */
  def default_(value: js.Any, arg: js.Any): String
  /**
    * If value is null, use given default
    *
    * @param value
    * @param arg
    */
  def default_if_none(value: js.Any, arg: js.Any): String
  /**
    * Returns true if the value is divisible by the argument"
    *
    * @param value
    * @param arg
    */
  def divisibleby(value: js.Any, arg: js.Any): Boolean
  /**
    * arg being a comma-delimited string, value of true/false/none
    * chooses the appropriate item from the string
    *
    * @param value
    * @param arg
    */
  def yesno(value: js.Any, arg: js.Any): js.Any
}

object logic {
  @scala.inline
  def apply(
    default_ : (js.Any, js.Any) => String,
    default_if_none: (js.Any, js.Any) => String,
    divisibleby: (js.Any, js.Any) => Boolean,
    yesno: (js.Any, js.Any) => js.Any
  ): logic = {
    val __obj = js.Dynamic.literal(default_ = js.Any.fromFunction2(default_), default_if_none = js.Any.fromFunction2(default_if_none), divisibleby = js.Any.fromFunction2(divisibleby), yesno = js.Any.fromFunction2(yesno))
  
    __obj.asInstanceOf[logic]
  }
}

