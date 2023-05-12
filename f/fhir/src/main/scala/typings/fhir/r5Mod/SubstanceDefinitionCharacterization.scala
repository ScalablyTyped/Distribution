package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionCharacterization
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * The description or justification in support of the interpretation of the data file.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The data produced by the analytical instrument or a pictorial representation of that data. Examples: a JCAMP, JDX, or ADX file, or a chromatogram or spectrum analysis.
    */
  var file: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Describes the nature of the chemical entity and explains, for instance, whether this is a base or a salt form.
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The method used to elucidate the characterization of the drug substance. Example: HPLC.
    */
  var technique: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionCharacterization {
  
  inline def apply(): SubstanceDefinitionCharacterization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionCharacterization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionCharacterization] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFile(value: js.Array[Attachment]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFileVarargs(value: Attachment*): Self = StObject.set(x, "file", js.Array(value*))
    
    inline def setForm(value: CodeableConcept): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setTechnique(value: CodeableConcept): Self = StObject.set(x, "technique", value.asInstanceOf[js.Any])
    
    inline def setTechniqueUndefined: Self = StObject.set(x, "technique", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
