package typings.giustoInkRouter.mod

import typings.giustoInkRouter.anon.Key
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var component: ComponentType[_]
  var exact: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Key] = js.undefined
  var path: String
}

object RouteProps {
  @scala.inline
  def apply(
    component: ComponentType[_],
    path: String,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Key = null
  ): RouteProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
}

