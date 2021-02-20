package typings.forms

import typings.forms.mod.Form
import typings.forms.mod.FormHandleCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var method: String = js.native
    
    var url: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: String, method: String, url: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Empty extends StObject {
    
    var empty: js.UndefOr[FormHandleCallback] = js.native
    
    var error: js.UndefOr[FormHandleCallback] = js.native
    
    var other: js.UndefOr[FormHandleCallback] = js.native
    
    var success: js.UndefOr[FormHandleCallback] = js.native
  }
  object Empty {
    
    @scala.inline
    def apply(): Empty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Empty]
    }
    
    @scala.inline
    implicit class EmptyMutableBuilder[Self <: Empty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmpty(value: /* form */ Form => Unit): Self = StObject.set(x, "empty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setError(value: /* form */ Form => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setOther(value: /* form */ Form => Unit): Self = StObject.set(x, "other", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* form */ Form => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  @js.native
  trait Field extends StObject {
    
    var field: js.UndefOr[js.Array[String]] = js.native
    
    var label: js.UndefOr[js.Array[String]] = js.native
  }
  object Field {
    
    @scala.inline
    def apply(): Field = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: js.Array[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLabelVarargs(value: String*): Self = StObject.set(x, "label", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ValidatePastFirstError extends StObject {
    
    /** If false, the first validation error will halt form validation, otherwise all fields will be validated. */
    var validatePastFirstError: js.UndefOr[Boolean] = js.native
  }
  object ValidatePastFirstError {
    
    @scala.inline
    def apply(): ValidatePastFirstError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatePastFirstError]
    }
    
    @scala.inline
    implicit class ValidatePastFirstErrorMutableBuilder[Self <: ValidatePastFirstError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValidatePastFirstError(value: Boolean): Self = StObject.set(x, "validatePastFirstError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatePastFirstErrorUndefined: Self = StObject.set(x, "validatePastFirstError", js.undefined)
    }
  }
  
  /* Inlined forms.forms.WidgetParameters & {  rows :number | undefined,   cols :number | undefined} */
  @js.native
  trait WidgetParametersrowsnumbe extends StObject {
    
    /** Custom classes to add to the rendered widget. */
    var classes: js.UndefOr[js.Array[String]] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    /** Custom classes to add to the choices label when applicable (multipleRadio and multipleCheckbox) */
    var labelClasses: js.UndefOr[js.Array[String]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    /** A string representing the widget type, e.g. 'text' or 'checkbox' */
    var `type`: js.UndefOr[String] = js.native
  }
  object WidgetParametersrowsnumbe {
    
    @scala.inline
    def apply(): WidgetParametersrowsnumbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetParametersrowsnumbe]
    }
    
    @scala.inline
    implicit class WidgetParametersrowsnumbeMutableBuilder[Self <: WidgetParametersrowsnumbe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setLabelClasses(value: js.Array[String]): Self = StObject.set(x, "labelClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelClassesUndefined: Self = StObject.set(x, "labelClasses", js.undefined)
      
      @scala.inline
      def setLabelClassesVarargs(value: String*): Self = StObject.set(x, "labelClasses", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
