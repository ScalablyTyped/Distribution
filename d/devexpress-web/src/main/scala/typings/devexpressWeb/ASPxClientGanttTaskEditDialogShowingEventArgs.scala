package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains data for the TaskEditDialogShowing event.
  */
trait ASPxClientGanttTaskEditDialogShowingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Specifies hidden fields in the edit dialog.
    */
  var hiddenFields: js.Array[String]
  
  /**
    * Specifies the task key.
    */
  var key: Any
  
  /**
    * Specifies read-only fields in the edit dialog.
    */
  var readOnlyFields: js.Array[String]
  
  /**
    * Specifies the task values.
    */
  var values: Any
}
object ASPxClientGanttTaskEditDialogShowingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    hiddenFields: js.Array[String],
    key: Any,
    readOnlyFields: js.Array[String],
    values: Any
  ): ASPxClientGanttTaskEditDialogShowingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], hiddenFields = hiddenFields.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readOnlyFields = readOnlyFields.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGanttTaskEditDialogShowingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientGanttTaskEditDialogShowingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHiddenFields(value: js.Array[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
    
    inline def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value*))
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyFields(value: js.Array[String]): Self = StObject.set(x, "readOnlyFields", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyFieldsVarargs(value: String*): Self = StObject.set(x, "readOnlyFields", js.Array(value*))
    
    inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
