package typings.formik.fieldArrayMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name  :string,   validateOnChange ? :boolean} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
trait FieldArrayConfig extends js.Object {
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.undefined
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[String | (ComponentType[FieldArrayRenderProps | Unit])] = js.undefined
  /** Really the path to the array field to be updated */
  var name: String
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    */
  var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.undefined
  /** Should field array validate the form AFTER array updates/changes? */
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
}

object FieldArrayConfig {
  @scala.inline
  def apply(
    name: String,
    children: /* props */ FieldArrayRenderProps => ReactNode = null,
    component: String | (ComponentType[FieldArrayRenderProps | Unit]) = null,
    render: /* props */ FieldArrayRenderProps => ReactNode = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined
  ): FieldArrayConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayConfig]
  }
}

