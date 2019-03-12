package typings
package formikLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[T] extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ T, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var component: js.UndefOr[java.lang.String | (reactLib.reactMod.ReactNs.ComponentType[T | scala.Unit])] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ T, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[T](
    children: /* props */ T => reactLib.reactMod.ReactNs.ReactNode = null,
    component: java.lang.String | (reactLib.reactMod.ReactNs.ComponentType[T | scala.Unit]) = null,
    render: /* props */ T => reactLib.reactMod.ReactNs.ReactNode = null
  ): SharedRenderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[SharedRenderProps[T]]
  }
}

