package typings.atEmberController.atEmberControllerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atEmberController.Anon_As
import typings.atEmberObject.dashPrivateActionDashHandlerMod.ActionHandler
import typings.atEmberObject.dashPrivateActionDashHandlerMod.ActionsHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMixin extends ActionHandler {
  var model: js.Any
  var queryParams: String | (js.Array[String | StringDictionary[Anon_As]])
  var target: js.Object
  def replaceRoute(name: String, args: js.Any*): Unit
  def transitionToRoute(name: String, args: js.Any*): Unit
}

object ControllerMixin {
  @scala.inline
  def apply(
    actions: ActionsHash,
    model: js.Any,
    queryParams: String | (js.Array[String | StringDictionary[Anon_As]]),
    replaceRoute: (String, /* repeated */ js.Any) => Unit,
    send: (String, /* repeated */ js.Any) => Unit,
    target: js.Object,
    transitionToRoute: (String, /* repeated */ js.Any) => Unit
  ): ControllerMixin = {
    val __obj = js.Dynamic.literal(actions = actions, model = model, queryParams = queryParams.asInstanceOf[js.Any], replaceRoute = js.Any.fromFunction2(replaceRoute), send = js.Any.fromFunction2(send), target = target, transitionToRoute = js.Any.fromFunction2(transitionToRoute))
  
    __obj.asInstanceOf[ControllerMixin]
  }
}

