package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeStorageGuideline
  extends StObject
     with BackboneElement {
  
  var _reference: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes a setting/value on the environment for the adequate storage of the medication and other substances.  Environment settings may involve temperature, humidity, or exposure to light.
    */
  var environmentalSetting: js.UndefOr[js.Array[MedicationKnowledgeStorageGuidelineEnvironmentalSetting]] = js.undefined
  
  /**
    * Additional notes about the storage.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Reference to additional information about the storage guidelines.
    */
  var reference: js.UndefOr[String] = js.undefined
  
  /**
    * Duration that the medication remains stable if the environmentalSetting is respected.
    */
  var stabilityDuration: js.UndefOr[Duration] = js.undefined
}
object MedicationKnowledgeStorageGuideline {
  
  inline def apply(): MedicationKnowledgeStorageGuideline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeStorageGuideline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeStorageGuideline] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentalSetting(value: js.Array[MedicationKnowledgeStorageGuidelineEnvironmentalSetting]): Self = StObject.set(x, "environmentalSetting", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentalSettingUndefined: Self = StObject.set(x, "environmentalSetting", js.undefined)
    
    inline def setEnvironmentalSettingVarargs(value: MedicationKnowledgeStorageGuidelineEnvironmentalSetting*): Self = StObject.set(x, "environmentalSetting", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setStabilityDuration(value: Duration): Self = StObject.set(x, "stabilityDuration", value.asInstanceOf[js.Any])
    
    inline def setStabilityDurationUndefined: Self = StObject.set(x, "stabilityDuration", js.undefined)
    
    inline def set_reference(value: Element): Self = StObject.set(x, "_reference", value.asInstanceOf[js.Any])
    
    inline def set_referenceUndefined: Self = StObject.set(x, "_reference", js.undefined)
  }
}
