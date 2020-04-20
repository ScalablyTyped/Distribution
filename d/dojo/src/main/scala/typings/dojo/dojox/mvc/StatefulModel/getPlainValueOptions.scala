package typings.dojo.dojox.mvc.StatefulModel

import typings.dojo.dojox.mvc.StatefulArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/StatefulModel.getPlainValueOptions.html
  *
  * An object that defines how plain value should be created from model object.
  *
  */
trait getPlainValueOptions extends js.Object {
  /**
    *
    * @param a
    */
  def getPlainArray(a: StatefulArray): js.Any
  /**
    *
    * @param o
    */
  def getPlainObject(o: typings.dojo.dojox.mvc.StatefulModel): js.Object
  /**
    *
    * @param v
    */
  def getPlainValue(v: js.Any): js.Any
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  def getType(v: js.Any): String
}

object getPlainValueOptions {
  @scala.inline
  def apply(
    getPlainArray: StatefulArray => js.Any,
    getPlainObject: typings.dojo.dojox.mvc.StatefulModel => js.Object,
    getPlainValue: js.Any => js.Any,
    getType: js.Any => String
  ): getPlainValueOptions = {
    val __obj = js.Dynamic.literal(getPlainArray = js.Any.fromFunction1(getPlainArray), getPlainObject = js.Any.fromFunction1(getPlainObject), getPlainValue = js.Any.fromFunction1(getPlainValue), getType = js.Any.fromFunction1(getType))
    __obj.asInstanceOf[getPlainValueOptions]
  }
}

