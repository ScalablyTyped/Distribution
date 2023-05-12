package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentProvision
  extends StObject
     with BackboneElement {
  
  /**
    * Note that this is the direct action (not the grounds for the action covered in the purpose element). At present, the only action in the understood and tested scope of this resource is 'read'.
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Who or what is controlled by this provision. Use group to identify a set of actors by some property they share (e.g. 'admitting officers').
    */
  var actor: js.UndefOr[js.Array[ConsentProvisionActor]] = js.undefined
  
  /**
    * If this code is found in an instance, then the provision applies.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The resources controlled by this provision if specific resources are referenced.
    */
  var data: js.UndefOr[js.Array[ConsentProvisionData]] = js.undefined
  
  /**
    * This has a different sense to the Consent.period - that is when the consent agreement holds. This is the time period of the data that is controlled by the agreement.
    */
  var dataPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Multiple types are or'ed together. The intention of the documentType element is that the codes refer to document types defined in a standard somewhere.
    */
  var documentType: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Constraining the expression type for a specific implementation via profile is recommended
    */
  var expression: js.UndefOr[Expression] = js.undefined
  
  /**
    * This is the bound effective time of the consent and should be in the base provision in the Consent resource.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Provisions which provide exceptions to the base provision or subprovisions.
    */
  var provision: js.UndefOr[js.Array[ConsentProvision]] = js.undefined
  
  /**
    * When the purpose of use tag is on the data, access request purpose of use shall not conflict.
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * Multiple types are or'ed together. The intention of the resourceType element is that the codes refer to profiles or document types defined in a standard or an implementation guide somewhere.
    */
  var resourceType: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * If the consent specifies a security label of "R" then it applies to all resources that are labeled "R" or lower. E.g. for Confidentiality, it's a high water mark. For other kinds of security labels, subsumption logic applies. When the purpose of use tag is on the data, access request purpose of use shall not conflict.
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.undefined
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
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setData(value: js.Array[ConsentProvisionData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataPeriod(value: Period): Self = StObject.set(x, "dataPeriod", value.asInstanceOf[js.Any])
    
    inline def setDataPeriodUndefined: Self = StObject.set(x, "dataPeriod", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ConsentProvisionData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDocumentType(value: js.Array[Coding]): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypeUndefined: Self = StObject.set(x, "documentType", js.undefined)
    
    inline def setDocumentTypeVarargs(value: Coding*): Self = StObject.set(x, "documentType", js.Array(value*))
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setProvision(value: js.Array[ConsentProvision]): Self = StObject.set(x, "provision", value.asInstanceOf[js.Any])
    
    inline def setProvisionUndefined: Self = StObject.set(x, "provision", js.undefined)
    
    inline def setProvisionVarargs(value: ConsentProvision*): Self = StObject.set(x, "provision", js.Array(value*))
    
    inline def setPurpose(value: js.Array[Coding]): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setPurposeVarargs(value: Coding*): Self = StObject.set(x, "purpose", js.Array(value*))
    
    inline def setResourceType(value: js.Array[Coding]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setResourceTypeVarargs(value: Coding*): Self = StObject.set(x, "resourceType", js.Array(value*))
    
    inline def setSecurityLabel(value: js.Array[Coding]): Self = StObject.set(x, "securityLabel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelUndefined: Self = StObject.set(x, "securityLabel", js.undefined)
    
    inline def setSecurityLabelVarargs(value: Coding*): Self = StObject.set(x, "securityLabel", js.Array(value*))
  }
}
