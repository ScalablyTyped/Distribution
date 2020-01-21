package typings.emberController.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.emberController.AnonAs
import typings.emberObject.actionHandlerMod.ActionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMixin extends ActionHandler {
  var model: js.Any
  var queryParams: String | (js.Array[String | StringDictionary[AnonAs]])
  var target: js.Object
  def replaceRoute(name: String, args: js.Any*): Unit
  def transitionToRoute(name: String, args: js.Any*): Unit
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typings.emberObject.mixinMod.default[ControllerMixin, typings.emberObject.mod.default]
    ]

