package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermAsset
  extends StObject
     with BackboneElement {
  
  var _condition: js.UndefOr[Element] = js.undefined
  
  var _linkId: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * Response to assets.
    */
  var answer: js.UndefOr[js.Array[ContractTermOfferAnswer]] = js.undefined
  
  /**
    * Description of the quality and completeness of the asset that imay be a factor in its valuation.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * Circumstance of the asset.
    */
  var context: js.UndefOr[js.Array[ContractTermAssetContext]] = js.undefined
  
  /**
    * Id [identifier??] of the clause or question text about the asset in the referenced form or QuestionnaireResponse.
    */
  var linkId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Asset relevant contractual time period.
    */
  var period: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * Type of Asset availability for use or ownership.
    */
  var periodType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Specifies the applicability of the term to an asset resource instance, and instances it refers to orinstances that refer to it, and/or are owned by the offeree.
    */
  var relationship: js.UndefOr[Coding] = js.undefined
  
  /**
    * Differentiates the kind of the asset .
    */
  var scope: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Security labels that protects the asset.
    */
  var securityLabelNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * May be a subtype or part of an offered asset.
    */
  var subtype: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Clause or question text (Prose Object) concerning the asset in a linked form, such as a QuestionnaireResponse used in the formation of the contract.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Target entity type about which the term may be concerned.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Associated entities.
    */
  var typeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Time period of asset use.
    */
  var usePeriod: js.UndefOr[js.Array[Period]] = js.undefined
  
  /**
    * Contract Valued Item List.
    */
  var valuedItem: js.UndefOr[js.Array[ContractTermAssetValuedItem]] = js.undefined
}
object ContractTermAsset {
  
  inline def apply(): ContractTermAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractTermAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContractTermAsset] (val x: Self) extends AnyVal {
    
    inline def setAnswer(value: js.Array[ContractTermOfferAnswer]): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
    
    inline def setAnswerVarargs(value: ContractTermOfferAnswer*): Self = StObject.set(x, "answer", js.Array(value*))
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setContext(value: js.Array[ContractTermAssetContext]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: ContractTermAssetContext*): Self = StObject.set(x, "context", js.Array(value*))
    
    inline def setLinkId(value: js.Array[String]): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
    
    inline def setLinkIdVarargs(value: String*): Self = StObject.set(x, "linkId", js.Array(value*))
    
    inline def setPeriod(value: js.Array[Period]): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "periodType", value.asInstanceOf[js.Any])
    
    inline def setPeriodTypeUndefined: Self = StObject.set(x, "periodType", js.undefined)
    
    inline def setPeriodTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "periodType", js.Array(value*))
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPeriodVarargs(value: Period*): Self = StObject.set(x, "period", js.Array(value*))
    
    inline def setRelationship(value: Coding): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setScope(value: CodeableConcept): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSecurityLabelNumber(value: js.Array[Double]): Self = StObject.set(x, "securityLabelNumber", value.asInstanceOf[js.Any])
    
    inline def setSecurityLabelNumberUndefined: Self = StObject.set(x, "securityLabelNumber", js.undefined)
    
    inline def setSecurityLabelNumberVarargs(value: Double*): Self = StObject.set(x, "securityLabelNumber", js.Array(value*))
    
    inline def setSubtype(value: js.Array[CodeableConcept]): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setSubtypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "subtype", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeReference(value: js.Array[Reference]): Self = StObject.set(x, "typeReference", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceUndefined: Self = StObject.set(x, "typeReference", js.undefined)
    
    inline def setTypeReferenceVarargs(value: Reference*): Self = StObject.set(x, "typeReference", js.Array(value*))
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setUsePeriod(value: js.Array[Period]): Self = StObject.set(x, "usePeriod", value.asInstanceOf[js.Any])
    
    inline def setUsePeriodUndefined: Self = StObject.set(x, "usePeriod", js.undefined)
    
    inline def setUsePeriodVarargs(value: Period*): Self = StObject.set(x, "usePeriod", js.Array(value*))
    
    inline def setValuedItem(value: js.Array[ContractTermAssetValuedItem]): Self = StObject.set(x, "valuedItem", value.asInstanceOf[js.Any])
    
    inline def setValuedItemUndefined: Self = StObject.set(x, "valuedItem", js.undefined)
    
    inline def setValuedItemVarargs(value: ContractTermAssetValuedItem*): Self = StObject.set(x, "valuedItem", js.Array(value*))
    
    inline def set_condition(value: Element): Self = StObject.set(x, "_condition", value.asInstanceOf[js.Any])
    
    inline def set_conditionUndefined: Self = StObject.set(x, "_condition", js.undefined)
    
    inline def set_linkId(value: js.Array[Element]): Self = StObject.set(x, "_linkId", value.asInstanceOf[js.Any])
    
    inline def set_linkIdUndefined: Self = StObject.set(x, "_linkId", js.undefined)
    
    inline def set_linkIdVarargs(value: Element*): Self = StObject.set(x, "_linkId", js.Array(value*))
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
