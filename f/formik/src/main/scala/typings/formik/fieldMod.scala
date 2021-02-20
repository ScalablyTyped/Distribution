package typings.formik

import typings.formik.anon.Name
import typings.formik.typesMod.FieldHelperProps
import typings.formik.typesMod.FieldInputProps
import typings.formik.typesMod.FieldMetaProps
import typings.formik.typesMod.FieldValidator
import typings.formik.typesMod.FormikProps
import typings.formik.typesMod.GenericFieldHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("formik/dist/Field", "Field")
  @js.native
  def Field(hasValidateNameRenderChildrenAsComponentProps: FieldAttributes[_]): js.Any = js.native
  
  @JSImport("formik/dist/Field", "useField")
  @js.native
  def useField[Val](propsOrFieldName: String): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  @JSImport("formik/dist/Field", "useField")
  @js.native
  def useField[Val](propsOrFieldName: FieldHookConfig[Val]): js.Tuple3[FieldInputProps[Val], FieldMetaProps[Val], FieldHelperProps[Val]] = js.native
  
  type FieldAttributes[T] = GenericFieldHTMLAttributes with FieldConfig[T] with T with Name
  
  @js.native
  trait FieldConfig[V] extends StObject {
    
    /**
      * Component to render. Can either be a string e.g. 'select', 'input', or 'textarea', or a component.
      */
    var as: js.UndefOr[
        (ComponentType[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[_]
      ] = js.native
    
    /**
      * Children render function <Field name>{props => ...}</Field>)
      */
    var children: js.UndefOr[(js.Function1[/* props */ FieldProps[V, _], ReactNode]) | ReactNode] = js.native
    
    /**
      * Field component to render. Can either be a string like 'select' or a component.
      */
    var component: js.UndefOr[
        String | (ComponentType[(FieldProps[V, _]) | js.Object]) | ForwardRefExoticComponent[_]
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
    var render: js.UndefOr[js.Function1[/* props */ FieldProps[V, _], ReactNode]] = js.native
    
    /** HTML input type */
    var `type`: js.UndefOr[String] = js.native
    
    /**
      * Validate a single field value independently
      */
    var validate: js.UndefOr[FieldValidator] = js.native
    
    /** Field value */
    var value: js.UndefOr[js.Any] = js.native
  }
  object FieldConfig {
    
    @scala.inline
    def apply[V](name: String): FieldConfig[V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldConfig[V]]
    }
    
    @scala.inline
    implicit class FieldConfigMutableBuilder[Self <: FieldConfig[_], V] (val x: Self with FieldConfig[V]) extends AnyVal {
      
      @scala.inline
      def setAs(value: (ComponentType[FieldInputProps[V] | js.Object]) | String | ForwardRefExoticComponent[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ FieldProps[V, _], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ FieldProps[V, _] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: String | (ComponentType[(FieldProps[V, _]) | js.Object]) | ForwardRefExoticComponent[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setInnerRef(value: /* instance */ js.Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* props */ FieldProps[V, _] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(value: /* value */ js.Any => String | Unit | (js.Promise[String | Unit])): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FieldHookConfig[T] = GenericFieldHTMLAttributes with FieldConfig[T]
  
  @js.native
  trait FieldProps[V, FormValues] extends StObject {
    
    var field: FieldInputProps[V] = js.native
    
    var form: FormikProps[FormValues] = js.native
    
    var meta: FieldMetaProps[V] = js.native
  }
  object FieldProps {
    
    @scala.inline
    def apply[V, FormValues](field: FieldInputProps[V], form: FormikProps[FormValues], meta: FieldMetaProps[V]): FieldProps[V, FormValues] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldProps[V, FormValues]]
    }
    
    @scala.inline
    implicit class FieldPropsMutableBuilder[Self <: FieldProps[_, _], V, FormValues] (val x: Self with (FieldProps[V, FormValues])) extends AnyVal {
      
      @scala.inline
      def setField(value: FieldInputProps[V]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: FormikProps[FormValues]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: FieldMetaProps[V]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
