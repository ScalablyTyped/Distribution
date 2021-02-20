package typings.formik

import typings.formik.fieldMod.FieldProps
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

object fastFieldMod {
  
  @JSImport("formik/dist/FastField", "FastField")
  @js.native
  val FastField: ComponentType[js.Any] = js.native
  
  type FastFieldAttributes[T] = GenericFieldHTMLAttributes with FastFieldConfig[T] with T
  
  /* Inlined formik.formik/dist/Field.FieldConfig<any> & {  shouldUpdate :(nextProps : T & formik.formik/dist/types.GenericFieldHTMLAttributes, props : {}): boolean | undefined} */
  @js.native
  trait FastFieldConfig[T] extends StObject {
    
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
    implicit class FastFieldConfigMutableBuilder[Self <: FastFieldConfig[_], T] (val x: Self with FastFieldConfig[T]) extends AnyVal {
      
      @scala.inline
      def setAs(value: (ComponentType[FieldInputProps[_] | js.Object]) | String | ForwardRefExoticComponent[_]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: (js.Function1[/* props */ FieldProps[_, _], ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* props */ FieldProps[_, _] => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: String | (ComponentType[(FieldProps[_, _]) | js.Object]) | ForwardRefExoticComponent[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setInnerRef(value: /* instance */ js.Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* props */ FieldProps[_, _] => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setShouldUpdate(value: (/* nextProps */ T with GenericFieldHTMLAttributes, /* props */ js.Object) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
      
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
  
  @js.native
  trait FastFieldProps[V] extends StObject {
    
    var field: FieldInputProps[V] = js.native
    
    var form: FormikProps[V] = js.native
    
    var meta: FieldMetaProps[V] = js.native
  }
  object FastFieldProps {
    
    @scala.inline
    def apply[V](field: FieldInputProps[V], form: FormikProps[V], meta: FieldMetaProps[V]): FastFieldProps[V] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastFieldProps[V]]
    }
    
    @scala.inline
    implicit class FastFieldPropsMutableBuilder[Self <: FastFieldProps[_], V] (val x: Self with FastFieldProps[V]) extends AnyVal {
      
      @scala.inline
      def setField(value: FieldInputProps[V]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForm(value: FormikProps[V]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: FieldMetaProps[V]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
