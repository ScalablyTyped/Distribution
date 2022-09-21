package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstancePolymerRepeatRepeatUnitStructuralRepresentation
  extends StObject
     with BackboneElement {
  
  var _representation: js.UndefOr[Element] = js.undefined
  
  /**
    * An attached file with the structural representation.
    */
  var attachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF.
    */
  var format: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The structural representation as text string in a standard format e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF.
    */
  var representation: js.UndefOr[String] = js.undefined
  
  /**
    * The type of structure (e.g. Full, Partial, Representative).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstancePolymerRepeatRepeatUnitStructuralRepresentation {
  
  inline def apply(): SubstancePolymerRepeatRepeatUnitStructuralRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstancePolymerRepeatRepeatUnitStructuralRepresentation]
  }
  
  extension [Self <: SubstancePolymerRepeatRepeatUnitStructuralRepresentation](x: Self) {
    
    inline def setAttachment(value: Attachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setFormat(value: CodeableConcept): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setRepresentation(value: String): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    inline def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_representation(value: Element): Self = StObject.set(x, "_representation", value.asInstanceOf[js.Any])
    
    inline def set_representationUndefined: Self = StObject.set(x, "_representation", js.undefined)
  }
}
