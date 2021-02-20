package typings.ejWebAll.anon

import typings.ejWebAll.ej.Autocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAutocomplete extends StObject {
  
  /* static member */
  var Locale: js.Any = js.native
  
  /* static member */
  var fn: Autocomplete = js.native
}
object TypeofAutocomplete {
  
  @scala.inline
  def apply(Locale: js.Any, fn: Autocomplete): TypeofAutocomplete = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAutocomplete]
  }
  
  @scala.inline
  implicit class TypeofAutocompleteMutableBuilder[Self <: TypeofAutocomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFn(value: Autocomplete): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
