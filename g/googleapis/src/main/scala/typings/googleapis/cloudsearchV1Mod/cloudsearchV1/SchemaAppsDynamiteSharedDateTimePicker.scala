package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedDateTimePicker extends StObject {
  
  /**
    * The label for the field that displays to the user.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the text input that's used in formInput, and uniquely identifies this input.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Triggered when the user clicks Save or Clear from the date/time picker dialog. This is only triggered if the value changed as a result of the Save/Clear operation.
    */
  var onChangeAction: js.UndefOr[SchemaAppsDynamiteSharedAction] = js.undefined
  
  /**
    * The number representing the time zone offset from UTC, in minutes. If set, the `value_ms_epoch` is displayed in the specified time zone. If not set, it uses the user's time zone setting on the client side.
    */
  var timezoneOffsetDate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The type of the date/time picker.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value to display as the default value before user input or previous user input. It is represented in milliseconds (Epoch time). For `DATE_AND_TIME` type, the full epoch value is used. For `DATE_ONLY` type, only date of the epoch time is used. For `TIME_ONLY` type, only time of the epoch time is used. For example, you can set epoch time to `3 * 60 * 60 * 1000` to represent 3am.
    */
  var valueMsEpoch: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedDateTimePicker {
  
  inline def apply(): SchemaAppsDynamiteSharedDateTimePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedDateTimePicker]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedDateTimePicker](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnChangeAction(value: SchemaAppsDynamiteSharedAction): Self = StObject.set(x, "onChangeAction", value.asInstanceOf[js.Any])
    
    inline def setOnChangeActionUndefined: Self = StObject.set(x, "onChangeAction", js.undefined)
    
    inline def setTimezoneOffsetDate(value: Double): Self = StObject.set(x, "timezoneOffsetDate", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetDateNull: Self = StObject.set(x, "timezoneOffsetDate", null)
    
    inline def setTimezoneOffsetDateUndefined: Self = StObject.set(x, "timezoneOffsetDate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValueMsEpoch(value: String): Self = StObject.set(x, "valueMsEpoch", value.asInstanceOf[js.Any])
    
    inline def setValueMsEpochNull: Self = StObject.set(x, "valueMsEpoch", null)
    
    inline def setValueMsEpochUndefined: Self = StObject.set(x, "valueMsEpoch", js.undefined)
  }
}
