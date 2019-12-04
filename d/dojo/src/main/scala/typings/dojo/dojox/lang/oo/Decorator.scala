package typings.dojo.dojox.lang.oo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/oo/Decorator.html
  *
  * The base class for all decorators.
  * This object holds an original function or another decorator
  * object, and implements a special mixin algorithm to be used
  * by dojox.lang.oo.mixin.
  *
  * @param value a payload to be processed by the decorator.
  * @param decorator a function to handle the custom assignment, or an object with exec()method. The signature is:decorator(/String/ name, /Function/ newValue, /Function/ oldValue).
  */
@js.native
trait Decorator extends js.Object {
  def apply(value: js.Object): Unit = js.native
  def apply(value: js.Object, decorator: js.Function): Unit = js.native
  def apply(value: js.Object, decorator: js.Object): Unit = js.native
}

@JSGlobal("dojox.lang.oo.Decorator")
@js.native
object Decorator extends js.Object {
  /**
    * a function to handle the custom assignment, or an object with exec()
    * method. The signature is:
    * decorator(/String/ name, /Function/ newValue, /Function/ oldValue).
    *
    */
  var decorator: js.Function = js.native
  /**
    * a payload to be processed by the decorator.
    *
    */
  var value: js.Object = js.native
}

