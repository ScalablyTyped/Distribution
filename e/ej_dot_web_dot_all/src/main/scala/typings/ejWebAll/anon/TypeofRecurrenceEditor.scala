package typings.ejWebAll.anon

import typings.ejWebAll.ej.RecurrenceEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRecurrenceEditor extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: RecurrenceEditor
}
object TypeofRecurrenceEditor {
  
  inline def apply(Locale: js.Any, fn: RecurrenceEditor): TypeofRecurrenceEditor = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRecurrenceEditor]
  }
  
  extension [Self <: TypeofRecurrenceEditor](x: Self) {
    
    inline def setFn(value: RecurrenceEditor): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
