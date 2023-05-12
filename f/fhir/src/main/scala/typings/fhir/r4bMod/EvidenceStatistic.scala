package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceStatistic
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A statistical attribute of the statistic such as a measure of heterogeneity.
    */
  var attributeEstimate: js.UndefOr[js.Array[EvidenceStatisticAttributeEstimate]] = js.undefined
  
  /**
    * Simple strings can be used for descriptive purposes. Exact matching to EvidenceVariable.category.name for the Evidence.variableDefinition[variableRole=measuredVariable].observed=Reference(EvidenceVariable) could facilitate validation within datasets.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A description of the content value of the statistic.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A component of the method to generate the statistic.
    */
  var modelCharacteristic: js.UndefOr[js.Array[EvidenceStatisticModelCharacteristic]] = js.undefined
  
  /**
    * Footnotes and/or explanatory notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When the number affected is the statistic, use Evidence.statistic.quantity and set Evidence.statistic.type.coding.code=C25463 and Evidence.statistic.type.coding.display=Count. When the statistic is a Proportion, use Evidence.statistic.numberAffected and enter an integer as the value. When the statistic is an Event Rate (where individual participants may have 2 or more events), use Evidence.statistic.numberAffected to record the number of participants with events rather than the total number of events.
    */
  var numberAffected: js.UndefOr[Double] = js.undefined
  
  /**
    * When the number of events is the statistic, use Evidence.statistic.quantity and set Evidence.statistic.type.coding.code=C25463 and Evidence.statistic.type.coding.display=Count. When the statistic is an Event Rate (where individual participants may have 2 or more events), use Evidence.statistic.numberOfEvents to record the total number of events rather than the number of participants with events.
    */
  var numberOfEvents: js.UndefOr[Double] = js.undefined
  
  /**
    * Statistic value.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Number of samples in the statistic.
    */
  var sampleSize: js.UndefOr[EvidenceStatisticSampleSize] = js.undefined
  
  /**
    * Type of statistic, eg relative risk.
    */
  var statisticType: js.UndefOr[CodeableConcept] = js.undefined
}
object EvidenceStatistic {
  
  inline def apply(): EvidenceStatistic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceStatistic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceStatistic] (val x: Self) extends AnyVal {
    
    inline def setAttributeEstimate(value: js.Array[EvidenceStatisticAttributeEstimate]): Self = StObject.set(x, "attributeEstimate", value.asInstanceOf[js.Any])
    
    inline def setAttributeEstimateUndefined: Self = StObject.set(x, "attributeEstimate", js.undefined)
    
    inline def setAttributeEstimateVarargs(value: EvidenceStatisticAttributeEstimate*): Self = StObject.set(x, "attributeEstimate", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setModelCharacteristic(value: js.Array[EvidenceStatisticModelCharacteristic]): Self = StObject.set(x, "modelCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setModelCharacteristicUndefined: Self = StObject.set(x, "modelCharacteristic", js.undefined)
    
    inline def setModelCharacteristicVarargs(value: EvidenceStatisticModelCharacteristic*): Self = StObject.set(x, "modelCharacteristic", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setNumberAffected(value: Double): Self = StObject.set(x, "numberAffected", value.asInstanceOf[js.Any])
    
    inline def setNumberAffectedUndefined: Self = StObject.set(x, "numberAffected", js.undefined)
    
    inline def setNumberOfEvents(value: Double): Self = StObject.set(x, "numberOfEvents", value.asInstanceOf[js.Any])
    
    inline def setNumberOfEventsUndefined: Self = StObject.set(x, "numberOfEvents", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSampleSize(value: EvidenceStatisticSampleSize): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setStatisticType(value: CodeableConcept): Self = StObject.set(x, "statisticType", value.asInstanceOf[js.Any])
    
    inline def setStatisticTypeUndefined: Self = StObject.set(x, "statisticType", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
