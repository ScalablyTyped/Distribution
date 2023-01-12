package typings.forms

import org.scalablytyped.runtime.StringDictionary
import typings.forms.mod.FormBound
import typings.forms.mod.FormData
import typings.forms.mod.FormFields
import typings.forms.mod.FormHandleCallback
import typings.node.httpMod.IncomingMessage
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Empty[Fields /* <: FormFields */, Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */] extends StObject {
    
    var empty: js.UndefOr[FormHandleCallback[Fields, Data]] = js.undefined
    
    var error: js.UndefOr[FormHandleCallback[Fields, Data]] = js.undefined
    
    var success: js.UndefOr[FormHandleCallback[Fields, Data]] = js.undefined
  }
  object Empty {
    
    inline def apply[Fields /* <: FormFields */, Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */](): Empty[Fields, Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Empty[Fields, Data]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Empty[?, ?], Fields /* <: FormFields */, Data /* <: IncomingMessage | (Partial[FormData[Fields]] & StringDictionary[Any]) */] (val x: Self & (Empty[Fields, Data])) extends AnyVal {
      
      inline def setEmpty(
        value: /* form */ FormBound[
              Fields, 
              /* import warning: importer.ImportType#apply Failed type conversion: Data extends node.http.IncomingMessage ? forms.forms.FormData<Fields> : Data */ js.Any
            ] => Unit
      ): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setError(
        value: /* form */ FormBound[
              Fields, 
              /* import warning: importer.ImportType#apply Failed type conversion: Data extends node.http.IncomingMessage ? forms.forms.FormData<Fields> : Data */ js.Any
            ] => Unit
      ): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccess(
        value: /* form */ FormBound[
              Fields, 
              /* import warning: importer.ImportType#apply Failed type conversion: Data extends node.http.IncomingMessage ? forms.forms.FormData<Fields> : Data */ js.Any
            ] => Unit
      ): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait Field extends StObject {
    
    var field: js.UndefOr[js.Array[String]] = js.undefined
    
    var label: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Field {
    
    inline def apply(): Field = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      inline def setField(value: js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value*))
    }
  }
  
  trait ValidatePastFirstError extends StObject {
    
    /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
    var validatePastFirstError: js.UndefOr[Boolean] = js.undefined
  }
  object ValidatePastFirstError {
    
    inline def apply(): ValidatePastFirstError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatePastFirstError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidatePastFirstError] (val x: Self) extends AnyVal {
      
      inline def setValidatePastFirstError(value: Boolean): Self = StObject.set(x, "validatePastFirstError", value.asInstanceOf[js.Any])
      
      inline def setValidatePastFirstErrorUndefined: Self = StObject.set(x, "validatePastFirstError", js.undefined)
    }
  }
  
  /* Inlined forms.forms.WidgetParameters & {  rows :number | undefined,   cols :number | undefined} */
  trait WidgetParametersrowsnumbe extends StObject {
    
    /** Custom classes to add to the rendered widget. */
    var classes: js.UndefOr[js.Array[String]] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
    var labelClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    /** A string representing the widget type, e.g. 'text' or 'checkbox' */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object WidgetParametersrowsnumbe {
    
    inline def apply(): WidgetParametersrowsnumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetParametersrowsnumbe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidgetParametersrowsnumbe] (val x: Self) extends AnyVal {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setLabelClasses(value: js.Array[String]): Self = StObject.set(x, "labelClasses", value.asInstanceOf[js.Any])
      
      inline def setLabelClassesUndefined: Self = StObject.set(x, "labelClasses", js.undefined)
      
      inline def setLabelClassesVarargs(value: String*): Self = StObject.set(x, "labelClasses", js.Array(value*))
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
