package typings
package formikLib.distErrorMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageProps extends js.Object {
  var children: js.UndefOr[
    js.Function1[/* errorMessage */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  var name: java.lang.String
  var render: js.UndefOr[
    js.Function1[/* errorMessage */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
}

object ErrorMessageProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    children: /* errorMessage */ java.lang.String => reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    component: java.lang.String | reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    render: /* errorMessage */ java.lang.String => reactLib.reactMod.ReactNs.ReactNode = null
  ): ErrorMessageProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[ErrorMessageProps]
  }
}

