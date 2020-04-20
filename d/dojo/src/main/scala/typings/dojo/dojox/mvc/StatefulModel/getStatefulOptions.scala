package typings.dojo.dojox.mvc.StatefulModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getStatefulOptions.html
  *
  * An object that defines how model object should be created from plain object hierarchy.
  *
  */
trait getStatefulOptions extends js.Object {
  /**
    * Create a stateful array from a plain array.
    *
    * @param a The plain array.
    */
  def getStatefulArray(a: js.Array[_]): js.Any
  /**
    * Create a stateful object from a plain object.
    *
    * @param o The plain object.
    */
  def getStatefulObject(o: js.Object): js.Any
  /**
    * Create a stateful value from a plain value.
    *
    * @param v The plain value.
    */
  def getStatefulValue(v: js.Any): js.Any
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String
}

object getStatefulOptions {
  @scala.inline
  def apply(
    getStatefulArray: js.Array[_] => js.Any,
    getStatefulObject: js.Object => js.Any,
    getStatefulValue: js.Any => js.Any,
    getType: js.Any => String
  ): getStatefulOptions = {
    val __obj = js.Dynamic.literal(getStatefulArray = js.Any.fromFunction1(getStatefulArray), getStatefulObject = js.Any.fromFunction1(getStatefulObject), getStatefulValue = js.Any.fromFunction1(getStatefulValue), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[getStatefulOptions]
  }
}

