package typings.formik.distFastFieldMod

import typings.formik.Anon_Formik
import typings.formik.distTypesMod.GenericFieldHTMLAttributes
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldConfig[T] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ FastFieldProps[_], ReactNode]) | ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String | (ComponentType[FastFieldProps[_] | Unit])] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* props */ FastFieldProps[_], ReactNode]] = js.undefined
  var shouldUpdate: js.UndefOr[
    js.Function2[
      /* nextProps */ T with GenericFieldHTMLAttributes with Anon_Formik, 
      /* props */ js.Object, 
      Boolean
    ]
  ] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[js.Function1[/* value */ js.Any, js.UndefOr[String | js.Promise[Unit]]]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FastFieldConfig {
  @scala.inline
  def apply[T](
    name: String,
    children: (js.Function1[/* props */ FastFieldProps[_], ReactNode]) | ReactNode = null,
    className: String = null,
    component: String | (ComponentType[FastFieldProps[_] | Unit]) = null,
    innerRef: /* instance */ js.Any => Unit = null,
    render: /* props */ FastFieldProps[_] => ReactNode = null,
    shouldUpdate: (/* nextProps */ T with GenericFieldHTMLAttributes with Anon_Formik, /* props */ js.Object) => Boolean = null,
    `type`: String = null,
    validate: /* value */ js.Any => js.UndefOr[String | js.Promise[Unit]] = null,
    value: js.Any = null
  ): FastFieldConfig[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2(shouldUpdate))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldConfig[T]]
  }
}

