package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInputs extends StObject {
  
  /**
    * Date input values. Not supported by Chat apps.
    */
  var dateInput: js.UndefOr[SchemaDateInput] = js.undefined
  
  /**
    * Date and time input values. Not supported by Chat apps.
    */
  var dateTimeInput: js.UndefOr[SchemaDateTimeInput] = js.undefined
  
  /**
    * Input parameter for regular widgets. For single-valued widgets, it is a single value list. For multi-valued widgets, such as checkbox, all the values are presented.
    */
  var stringInputs: js.UndefOr[SchemaStringInputs] = js.undefined
  
  /**
    * Time input values. Not supported by Chat apps.
    */
  var timeInput: js.UndefOr[SchemaTimeInput] = js.undefined
}
object SchemaInputs {
  
  inline def apply(): SchemaInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInputs]
  }
  
  extension [Self <: SchemaInputs](x: Self) {
    
    inline def setDateInput(value: SchemaDateInput): Self = StObject.set(x, "dateInput", value.asInstanceOf[js.Any])
    
    inline def setDateInputUndefined: Self = StObject.set(x, "dateInput", js.undefined)
    
    inline def setDateTimeInput(value: SchemaDateTimeInput): Self = StObject.set(x, "dateTimeInput", value.asInstanceOf[js.Any])
    
    inline def setDateTimeInputUndefined: Self = StObject.set(x, "dateTimeInput", js.undefined)
    
    inline def setStringInputs(value: SchemaStringInputs): Self = StObject.set(x, "stringInputs", value.asInstanceOf[js.Any])
    
    inline def setStringInputsUndefined: Self = StObject.set(x, "stringInputs", js.undefined)
    
    inline def setTimeInput(value: SchemaTimeInput): Self = StObject.set(x, "timeInput", value.asInstanceOf[js.Any])
    
    inline def setTimeInputUndefined: Self = StObject.set(x, "timeInput", js.undefined)
  }
}
