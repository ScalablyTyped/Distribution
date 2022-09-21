package typings.fhir.mod

import typings.fhir.fhirStrings.official
import typings.fhir.fhirStrings.secondary
import typings.fhir.fhirStrings.temp
import typings.fhir.fhirStrings.usual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with Element {
  
  var _system: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Organization that issued/manages the identifier.
    */
  var assigner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time period during which identifier is/was valid for use.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * There are many sequences of identifiers.  To perform matching, we need to know what sequence we're dealing with. The system identifies a particular sequence or set of unique identifiers.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * Allows users to make use of identifiers when the identifier system is not known.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Allows the appropriate identifier for a particular context of use to be selected from among a set of identifiers.
    */
  var use: js.UndefOr[usual | official | temp | secondary] = js.undefined
  
  /**
    * The portion of the identifier typically displayed to the user and which is unique within the context of the system.
    */
  var value: js.UndefOr[String] = js.undefined
}
object Identifier {
  
  inline def apply(): Identifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identifier]
  }
  
  extension [Self <: Identifier](x: Self) {
    
    inline def setAssigner(value: Reference): Self = StObject.set(x, "assigner", value.asInstanceOf[js.Any])
    
    inline def setAssignerUndefined: Self = StObject.set(x, "assigner", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: usual | official | temp | secondary): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    inline def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
