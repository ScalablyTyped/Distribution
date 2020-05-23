package typings.ejWebAll.ej

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget_ extends WidgetBase {
  var model: js.Any = js.native
  def destroyAll(elements: Element): Unit = js.native
  def register(pluginName: String, className: String, prototype: js.Any): Unit = js.native
}

