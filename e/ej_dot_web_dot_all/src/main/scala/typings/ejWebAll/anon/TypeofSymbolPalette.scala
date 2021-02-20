package typings.ejWebAll.anon

import typings.ejWebAll.ej.datavisualization.SymbolPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofSymbolPalette extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: SymbolPalette = js.native
}
object TypeofSymbolPalette {
  
  @scala.inline
  def apply(Locale: js.Any, fn: SymbolPalette): TypeofSymbolPalette = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSymbolPalette]
  }
  
  @scala.inline
  implicit class TypeofSymbolPaletteMutableBuilder[Self <: TypeofSymbolPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: SymbolPalette): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
