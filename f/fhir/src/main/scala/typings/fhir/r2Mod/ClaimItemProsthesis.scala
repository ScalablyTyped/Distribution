package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimItemProsthesis
  extends StObject
     with BackboneElement {
  
  var _initial: js.UndefOr[Element] = js.undefined
  
  var _priorDate: js.UndefOr[Element] = js.undefined
  
  /**
    * May impact on adjudication.
    */
  var initial: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May impact on adjudication.
    */
  var priorDate: js.UndefOr[String] = js.undefined
  
  /**
    * May impact on adjudication.
    */
  var priorMaterial: js.UndefOr[Coding] = js.undefined
}
object ClaimItemProsthesis {
  
  inline def apply(): ClaimItemProsthesis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimItemProsthesis]
  }
  
  extension [Self <: ClaimItemProsthesis](x: Self) {
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setPriorDate(value: String): Self = StObject.set(x, "priorDate", value.asInstanceOf[js.Any])
    
    inline def setPriorDateUndefined: Self = StObject.set(x, "priorDate", js.undefined)
    
    inline def setPriorMaterial(value: Coding): Self = StObject.set(x, "priorMaterial", value.asInstanceOf[js.Any])
    
    inline def setPriorMaterialUndefined: Self = StObject.set(x, "priorMaterial", js.undefined)
    
    inline def set_initial(value: Element): Self = StObject.set(x, "_initial", value.asInstanceOf[js.Any])
    
    inline def set_initialUndefined: Self = StObject.set(x, "_initial", js.undefined)
    
    inline def set_priorDate(value: Element): Self = StObject.set(x, "_priorDate", value.asInstanceOf[js.Any])
    
    inline def set_priorDateUndefined: Self = StObject.set(x, "_priorDate", js.undefined)
  }
}
