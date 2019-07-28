package typings.formik.distErrorMessageMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessageProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* errorMessage */ String, ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String | ComponentType[js.Object]] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* errorMessage */ String, ReactNode]] = js.undefined
}

object ErrorMessageProps {
  @scala.inline
  def apply(
    name: String,
    children: /* errorMessage */ String => ReactNode = null,
    className: String = null,
    component: String | ComponentType[js.Object] = null,
    render: /* errorMessage */ String => ReactNode = null
  ): ErrorMessageProps = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[ErrorMessageProps]
  }
}

