package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionNameOfficial
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Which authority uses this official name.
    */
  var authority: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Date of official name change.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the official name, for example 'provisional', 'approved'.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionNameOfficial {
  
  inline def apply(): SubstanceDefinitionNameOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionNameOfficial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionNameOfficial] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: CodeableConcept): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
