package typings.formik

import typings.formik.distFieldMod.FieldConfig
import typings.formik.distTypesMod.FieldInputProps
import typings.formik.distTypesMod.FieldMetaProps
import typings.formik.distTypesMod.FormikProps
import typings.formik.distTypesMod.GenericFieldHTMLAttributes
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFastFieldMod {
  
  @JSImport("formik/dist/FastField", "FastField")
  @js.native
  val FastField: ComponentType[Any] = js.native
  
  type FastFieldAttributes[T] = GenericFieldHTMLAttributes & FastFieldConfig[T] & T
  
  trait FastFieldConfig[T]
    extends StObject
       with FieldConfig[Any] {
    
    /** Override FastField's default shouldComponentUpdate */
    var shouldUpdate: js.UndefOr[
        js.Function2[/* nextProps */ T & GenericFieldHTMLAttributes, /* props */ js.Object, Boolean]
      ] = js.undefined
  }
  object FastFieldConfig {
    
    inline def apply[T](name: String): FastFieldConfig[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastFieldConfig[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastFieldConfig[?], T] (val x: Self & FastFieldConfig[T]) extends AnyVal {
      
      inline def setShouldUpdate(value: (/* nextProps */ T & GenericFieldHTMLAttributes, /* props */ js.Object) => Boolean): Self = StObject.set(x, "shouldUpdate", js.Any.fromFunction2(value))
      
      inline def setShouldUpdateUndefined: Self = StObject.set(x, "shouldUpdate", js.undefined)
    }
  }
  
  trait FastFieldProps[V] extends StObject {
    
    var field: FieldInputProps[V]
    
    var form: FormikProps[V]
    
    var meta: FieldMetaProps[V]
  }
  object FastFieldProps {
    
    inline def apply[V](field: FieldInputProps[V], form: FormikProps[V], meta: FieldMetaProps[V]): FastFieldProps[V] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastFieldProps[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FastFieldProps[?], V] (val x: Self & FastFieldProps[V]) extends AnyVal {
      
      inline def setField(value: FieldInputProps[V]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setForm(value: FormikProps[V]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: FieldMetaProps[V]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
