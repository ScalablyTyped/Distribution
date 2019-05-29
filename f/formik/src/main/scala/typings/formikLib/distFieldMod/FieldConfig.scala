package typings
package formikLib.distFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfig extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ FieldProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode
  ] = js.undefined
  var component: js.UndefOr[java.lang.String | (reactLib.reactMod.ComponentType[FieldProps[_] | scala.Unit])] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, scala.Unit]] = js.undefined
  var name: java.lang.String
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[_], reactLib.reactMod.ReactNode]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[
    js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String | js.Promise[scala.Unit]]]
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FieldConfig {
  @scala.inline
  def apply(
    name: java.lang.String,
    children: (js.Function1[/* props */ FieldProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode = null,
    component: java.lang.String | (reactLib.reactMod.ComponentType[FieldProps[_] | scala.Unit]) = null,
    innerRef: /* instance */ js.Any => scala.Unit = null,
    render: /* props */ FieldProps[_] => reactLib.reactMod.ReactNode = null,
    `type`: java.lang.String = null,
    validate: /* value */ js.Any => js.UndefOr[java.lang.String | js.Promise[scala.Unit]] = null,
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

