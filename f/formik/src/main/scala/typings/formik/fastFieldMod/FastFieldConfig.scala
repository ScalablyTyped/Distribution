package typings.formik.fastFieldMod

import typings.formik.fieldMod.FieldProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldValidator
import typings.formik.typesMod.GenericFieldHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/Field.FieldConfig<any> & {  shouldUpdate :(nextProps : T & formik.formik/dist/types.GenericFieldHTMLAttributes, props : {}): boolean | undefined} */
@js.native
trait FastFieldConfig[T] extends js.Object {
  /**
    * Component to render. Can either be a string e.g. 'select', 'input', or 'textarea', or a component.
    */
  var as: js.UndefOr[
    (ComponentType[FieldInputProps[_] | js.Object]) | String | ForwardRefExoticComponent[_]
  ] = js.native
  /**
    * Children render function <Field name>{props => ...}</Field>)
    */
  var children: js.UndefOr[(js.Function1[/* props */ FieldProps[_, _], ReactNode]) | ReactNode] = js.native
  /**
    * Field component to render. Can either be a string like 'select' or a component.
    */
  var component: js.UndefOr[
    String | (ComponentType[(FieldProps[_, _]) | js.Object]) | ForwardRefExoticComponent[_]
  ] = js.native
  /** Inner ref */
  var innerRef: js.UndefOr[js.Function1[/* instance */ js.Any, Unit]] = js.native
  /**
    * Field name
    */
  var name: String = js.native
  /**
    * Render prop (works like React router's <Route render={props =>} />)
    * @deprecated
    */
  var render: js.UndefOr[js.Function1[/* props */ FieldProps[_, _], ReactNode]] = js.native
  /** Override FastField's default shouldComponentUpdate */
  var shouldUpdate: js.UndefOr[
    js.Function2[/* nextProps */ T with GenericFieldHTMLAttributes, /* props */ js.Object, Boolean]
  ] = js.native
  /** HTML input type */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Validate a single field value independently
    */
  var validate: js.UndefOr[FieldValidator] = js.native
  /** Field value */
  var value: js.UndefOr[js.Any] = js.native
}

object FastFieldConfig {
  @scala.inline
  def apply[T](name: String): FastFieldConfig[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastFieldConfig[T]]
  }
  @scala.inline
  implicit class FastFieldConfigOps[Self <: FastFieldConfig[_], T] (val x: Self with FastFieldConfig[T]) extends AnyVal {
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
    def setAs(value: (ComponentType[FieldInputProps[_] | js.Object]) | String | ForwardRefExoticComponent[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildrenFunction1(value: /* props */ FieldProps[_, _] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* props */ FieldProps[_, _], ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setComponent(value: String | (ComponentType[(FieldProps[_, _]) | js.Object]) | ForwardRefExoticComponent[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setInnerRef(value: /* instance */ js.Any => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setRender(value: /* props */ FieldProps[_, _] => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setShouldUpdate(value: (/* nextProps */ T with GenericFieldHTMLAttributes, /* props */ js.Object) => Boolean): Self = this.set("shouldUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldUpdate: Self = this.set("shouldUpdate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValidate(value: /* value */ js.Any => String | Unit | (js.Promise[String | Unit])): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

