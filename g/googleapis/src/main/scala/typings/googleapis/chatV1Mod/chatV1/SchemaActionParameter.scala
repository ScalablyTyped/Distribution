package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of string parameters to supply when the action method is invoked. For
  * example, consider three snooze buttons: snooze now, snooze 1 day, snooze
  * next week. You might use action method = snooze(), passing the snooze type
  * and snooze time in the list of string parameters.
  */
trait SchemaActionParameter extends StObject {
  
  /**
    * The name of the parameter for the action script.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the parameter.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaActionParameter {
  
  inline def apply(): SchemaActionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActionParameter]
  }
  
  extension [Self <: SchemaActionParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
