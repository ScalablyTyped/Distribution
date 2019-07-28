package typings.formik.distFieldMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfig extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FieldProps[_], ReactNode]) | ReactNode] = js.undefined
  var component: js.UndefOr[String | (ComponentType[FieldProps[_] | Unit])] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[_], ReactNode]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[String | js.Promise[Unit]]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FieldConfig {
  @scala.inline
  def apply(
    name: String,
    children: (js.Function1[/* props */ FieldProps[_], ReactNode]) | ReactNode = null,
    component: String | (ComponentType[FieldProps[_] | Unit]) = null,
    innerRef: /* instance */ js.Any => Unit = null,
    render: /* props */ FieldProps[_] => ReactNode = null,
    `type`: String = null,
    validate: /* value */ js.Any => js.UndefOr[String | js.Promise[Unit]] = null,
    value: js.Any = null
  ): FieldConfig = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FieldConfig]
  }
}

