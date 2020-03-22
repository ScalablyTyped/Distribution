package typings.formik.typesMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedRenderProps[T] extends js.Object {
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.undefined
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[String | (ComponentType[T | Unit])] = js.undefined
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    */
  var render: js.UndefOr[js.Function1[/* props */ T, ReactNode]] = js.undefined
}

object SharedRenderProps {
  @scala.inline
  def apply[T](
    children: /* props */ T => ReactNode = null,
    component: String | (ComponentType[T | Unit]) = null,
    render: /* props */ T => ReactNode = null
  ): SharedRenderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[SharedRenderProps[T]]
  }
}

