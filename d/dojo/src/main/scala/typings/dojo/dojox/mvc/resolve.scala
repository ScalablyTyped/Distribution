package typings.dojo.dojox.mvc

import typings.dojo.dojo.Stateful
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/resolve.html
  *
  * Find a dojo/Stateful for the target.
  * If target is not a string, return target itself.
  * If target is "widget:widgetid", returns the widget whose ID is widgetid.
  * If target is "rel:object.path", or target is other string, returns an object under parent (if specified) or under global scope.
  *
  * @param target The data binding to resolve.
  * @param parent       OptionalThe parent data binding. Used when the data binding is defined inside repeat.
  */
@js.native
trait resolve extends js.Object {
  def apply(target: String): Unit = js.native
  def apply(target: String, parent: Stateful): Unit = js.native
  def apply(target: Stateful): Unit = js.native
  def apply(target: Stateful, parent: Stateful): Unit = js.native
}

