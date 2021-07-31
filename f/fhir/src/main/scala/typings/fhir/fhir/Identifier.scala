package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An identifier intended for computation
  */
trait Identifier
  extends StObject
     with Element {
  
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Organization that issued id (may be just text)
    */
  var assigner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Time period when id is/was valid for use
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The namespace for the identifier value
    */
  var system: js.UndefOr[uri] = js.undefined
  
  /**
    * Description of identifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * usual | official | temp | secondary (If known)
    */
  var use: js.UndefOr[code] = js.undefined
  
  /**
    * The value that is unique
    */
  var value: js.UndefOr[String] = js.undefined
}
object Identifier {
  
  @scala.inline
  def apply(): Identifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigner(value: Reference): Self = StObject.set(x, "assigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignerUndefined: Self = StObject.set(x, "assigner", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setSystem(value: uri): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUse(value: code): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def set_system(value: Element): Self = StObject.set(x, "_system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_systemUndefined: Self = StObject.set(x, "_system", js.undefined)
    
    @scala.inline
    def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
