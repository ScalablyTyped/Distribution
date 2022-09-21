package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionStructureRepresentation
  extends StObject
     with BackboneElement {
  
  var _representation: js.UndefOr[Element] = js.undefined
  
  /**
    * An attached file with the structural representation or characterization e.g. a molecular structure graphic of the substance, a JCAMP or AnIML file.
    */
  var document: js.UndefOr[Reference] = js.undefined
  
  /**
    * The format of the representation e.g. InChI, SMILES, MOLFILE, CDX, SDF, PDB, mmCIF. The logical content type rather than the physical file format of a document.
    */
  var format: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The structural representation or characterization as a text string in a standard format.
    */
  var representation: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of structural representation (e.g. full, partial).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceDefinitionStructureRepresentation {
  
  inline def apply(): SubstanceDefinitionStructureRepresentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionStructureRepresentation]
  }
  
  extension [Self <: SubstanceDefinitionStructureRepresentation](x: Self) {
    
    inline def setDocument(value: Reference): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
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
