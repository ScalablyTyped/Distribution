package typings.formik.fieldArrayMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name :string,   validateOnChange :boolean | undefined} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
@js.native
trait FieldArrayConfig extends js.Object {
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.native
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[String | (ComponentType[FieldArrayRenderProps | Unit])] = js.native
  /** Really the path to the array field to be updated */
  var name: String = js.native
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    */
  var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.native
  /** Should field array validate the form AFTER array updates/changes? */
  var validateOnChange: js.UndefOr[Boolean] = js.native
}

object FieldArrayConfig {
  @scala.inline
  def apply(name: String): FieldArrayConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayConfig]
  }
  @scala.inline
  implicit class FieldArrayConfigOps[Self <: FieldArrayConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: /* props */ FieldArrayRenderProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponent(value: String | (ComponentType[FieldArrayRenderProps | Unit])): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setRender(value: /* props */ FieldArrayRenderProps => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
  }
  
}

