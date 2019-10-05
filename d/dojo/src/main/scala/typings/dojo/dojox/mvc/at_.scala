package typings.dojo.dojox.mvc

import typings.dojo.dojo.Stateful
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/at.html
  *
  * Returns a pointer to data binding target (a dojo/Stateful property), called at handle, which is used for start synchronization with data binding source (another dojo/Stateful property).
  * Typically used in data-dojo-props so that a widget can synchronize its attribute with another dojo/Stateful, like shown in the example.
  *
  * @param target dojo/Stateful to be synchronized.
  * @param targetProp The property name in target to be synchronized.
  */
@JSName("at")
@js.native
trait at_ extends js.Object {
  def apply(target: String, targetProp: String): Unit = js.native
  def apply(target: Stateful, targetProp: String): Unit = js.native
}

