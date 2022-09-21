package typings.fhir.r3Mod

import typings.fhir.fhirStrings.deny
import typings.fhir.fhirStrings.permit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentExcept
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Note that this is the direct action (not the grounds for the action covered in the purpose element). At present, the only action in the understood and tested scope of this resource is 'read'.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.undefined
  
  /**
    * Multiple types are or'ed together. The intention of the contentType element is that the codes refer to profiles or document types defined in a standard or an implementation guide somewhere.
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Typical use of this is a Document code with class = CDA.
    */
  var code: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The resources controlled by this exception, if specific resources are referenced.
    */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.undefined
  
  /**
    * This has a different sense to the Consent.period - that is when the consent agreement holds. This is the time period of the data that is controlled by the agreement.
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The timeframe in this exception is valid.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * E.g. if the purpose is 'research', then the operational context must be research, in order for the consent to apply. Not all of the security labels make sense for use in this element (may define a narrower value set?).
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * If the consent specifies a security label of "R" then it applies to all resources that are labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of security labels, subsumption logic applies. Not all of the security labels make sense for use in this element (may define a narrower value set?).
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Action  to take - permit or deny - when the exception conditions are met.
    */
  var `type`: deny | permit
}
object ConsentExcept {
  
  inline def apply(`type`: deny | permit): ConsentExcept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExcept]
  }
  
  extension [Self <: ConsentExcept](x: Self) {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[ConsentExceptActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ConsentExceptActor*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setClass(value: js.Array[Coding]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClassVarargs(value: Coding*): Self = StObject.set(x, "class", js.Array(value*))
    
    inline def setCode(value: js.Array[Coding]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: Coding*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setData(value: js.Array[ConsentExceptData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentExceptData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setType(value: deny | permit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
