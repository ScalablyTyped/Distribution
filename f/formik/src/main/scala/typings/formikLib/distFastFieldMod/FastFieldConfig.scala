package typings
package formikLib.distFastFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastFieldConfig[T] extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ FastFieldProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[
    java.lang.String | (reactLib.reactMod.ComponentType[FastFieldProps[_] | scala.Unit])
  ] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, scala.Unit]] = js.undefined
  var name: java.lang.String
  var render: js.UndefOr[js.Function1[/* props */ FastFieldProps[_], reactLib.reactMod.ReactNode]] = js.undefined
  var shouldUpdate: js.UndefOr[
    js.Function2[
      /* nextProps */ T with formikLib.distTypesMod.GenericFieldHTMLAttributes with formikLib.Anon_Formik, 
      /* props */ js.Object, 
      scala.Boolean
    ]
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validate: js.UndefOr[
    js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String | js.Promise[scala.Unit]]]
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object FastFieldConfig {
  @scala.inline
  def apply[T](
    name: java.lang.String,
    children: (js.Function1[/* props */ FastFieldProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    component: java.lang.String | (reactLib.reactMod.ComponentType[FastFieldProps[_] | scala.Unit]) = null,
    innerRef: /* instance */ js.Any => scala.Unit = null,
    render: /* props */ FastFieldProps[_] => reactLib.reactMod.ReactNode = null,
    shouldUpdate: (/* nextProps */ T with formikLib.distTypesMod.GenericFieldHTMLAttributes with formikLib.Anon_Formik, /* props */ js.Object) => scala.Boolean = null,
    `type`: java.lang.String = null,
    validate: /* value */ js.Any => js.UndefOr[java.lang.String | js.Promise[scala.Unit]] = null,
    value: js.Any = null
  ): FastFieldConfig[T] = {
    val __obj = js.Dynamic.literal(name = name)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2(shouldUpdate))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FastFieldConfig[T]]
  }
}

