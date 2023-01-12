package typings.fhir.r4Mod

import typings.fhir.fhirStrings.deny
import typings.fhir.fhirStrings.permit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentProvision
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Note that this is the direct action (not the grounds for the action covered in the purpose element). At present, the only action in the understood and tested scope of this resource is 'read'.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who or what is controlled by this rule. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var actor: js.UndefOr[js.Array[ConsentProvisionActor]] = js.undefined
  
  /**
    * Multiple types are or'ed together. The intention of the contentType element is that the codes refer to profiles or document types defined in a standard or an implementation guide somewhere.
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Typical use of this is a Document code with class = CDA.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The resources controlled by this rule if specific resources are referenced.
    */
  var data: js.UndefOr[js.Array[ConsentProvisionData]] = js.undefined
  
  /**
    * This has a different sense to the Consent.period - that is when the consent agreement holds. This is the time period of the data that is controlled by the agreement.
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The timeframe in this rule is valid.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Rules which provide exceptions to the base rule or subrules.
    */
  var provision: js.UndefOr[js.Array[ConsentProvision]] = js.undefined
  
  /**
    * When the purpose of use tag is on the data, access request purpose of use shall not conflict.
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * If the consent specifies a security label of "R" then it applies to all resources that are labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of security labels, subsumption logic applies. When the purpose of use tag is on the data, access request purpose of use shall not conflict.
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Action  to take - permit or deny - when the rule conditions are met.  Not permitted in root rule, required in all nested rules.
    */
  var `type`: js.UndefOr[deny | permit] = js.undefined
}
object ConsentProvision {
  
  inline def apply(): ConsentProvision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsentProvision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentProvision] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActionVarargs(value: CodeableConcept*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setActor(value: js.Array[ConsentProvisionActor]): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setActorVarargs(value: ConsentProvisionActor*): Self = StObject.set(x, "actor", js.Array(value*))
    
    inline def setClass(value: js.Array[Coding]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setClassVarargs(value: Coding*): Self = StObject.set(x, "class", js.Array(value*))
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setData(value: js.Array[ConsentProvisionData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentProvisionData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProvision(value: js.Array[ConsentProvision]): Self = StObject.set(x, "provision", value.asInstanceOf[js.Any])
    
    inline def setProvisionUndefined: Self = StObject.set(x, "provision", js.undefined)
    
    inline def setProvisionVarargs(value: ConsentProvision*): Self = StObject.set(x, "provision", js.Array(value*))
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
    
    inline def setType(value: deny | permit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
