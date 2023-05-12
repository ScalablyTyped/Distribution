package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.Dictionary
import typings.fullcalendarCore.internalCommonMod.GenericRefiners
import typings.fullcalendarCore.internalCommonMod.RefinedOptionsFromRefiners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra[Refiners /* <: GenericRefiners */] extends StObject {
  
  var extra: Dictionary
  
  var refined: RefinedOptionsFromRefiners[Refiners]
}
object Extra {
  
  inline def apply[Refiners /* <: GenericRefiners */](extra: Dictionary, refined: RefinedOptionsFromRefiners[Refiners]): Extra[Refiners] = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], refined = refined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra[Refiners]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extra[?], Refiners /* <: GenericRefiners */] (val x: Self & Extra[Refiners]) extends AnyVal {
    
    inline def setExtra(value: Dictionary): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setRefined(value: RefinedOptionsFromRefiners[Refiners]): Self = StObject.set(x, "refined", value.asInstanceOf[js.Any])
  }
}
