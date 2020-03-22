package typings.emberController.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.emberController.AnonAs
import typings.emberObject.actionHandlerMod.ActionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerMixin extends ActionHandler {
  var model: js.Any = js.native
  var queryParams: String | (js.Array[String | StringDictionary[AnonAs]]) = js.native
  var target: js.Object = js.native
  def replaceRoute(name: String, args: js.Any*): Unit = js.native
  def transitionToRoute(args: js.Any*): Unit = js.native
  def transitionToRoute(name: String, args: js.Any*): Unit = js.native
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typings.emberObject.mixinMod.default[ControllerMixin, typings.emberObject.mod.default]
    ]

