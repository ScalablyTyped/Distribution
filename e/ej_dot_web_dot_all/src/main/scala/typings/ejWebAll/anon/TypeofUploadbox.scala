package typings.ejWebAll.anon

import typings.ejWebAll.ej.Uploadbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUploadbox extends StObject {
  
  /* static member */
  var Locale: js.Any
  
  /* static member */
  var fn: Uploadbox
}
object TypeofUploadbox {
  
  inline def apply(Locale: js.Any, fn: Uploadbox): TypeofUploadbox = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUploadbox]
  }
  
  extension [Self <: TypeofUploadbox](x: Self) {
    
    inline def setFn(value: Uploadbox): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
