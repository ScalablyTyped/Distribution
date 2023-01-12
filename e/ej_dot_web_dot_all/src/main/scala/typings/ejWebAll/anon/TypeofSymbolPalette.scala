package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.SymbolPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSymbolPalette extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: SymbolPalette
}
object TypeofSymbolPalette {
  
  inline def apply(Locale: Any, fn: SymbolPalette): TypeofSymbolPalette = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSymbolPalette]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSymbolPalette] (val x: Self) extends AnyVal {
    
    inline def setFn(value: SymbolPalette): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
