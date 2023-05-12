package typings.fhir.r5Mod

import typings.fhir.fhirStrings.aa
import typings.fhir.fhirStrings.dna
import typings.fhir.fhirStrings.rna
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequence
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _literal: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The method for sequencing, for example, chip information.
    */
  var device: js.UndefOr[Reference] = js.undefined
  
  /**
    * The actual focus of a molecular sequence when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, child, or sibling. For example, in trio testing, the subject would be the child (proband) and the focus would be the parent.
    */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Sequence that was observed as file content. Can be an actual file contents, or referenced by a URL to an external system.
    */
  var formatted: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * A unique identifier for this particular sequence instance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Sequence that was observed.
    */
  var literal: js.UndefOr[String] = js.undefined
  
  /**
    * The organization or lab that should be responsible for this result.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * A sequence defined relative to another sequence.
    */
  var relative: js.UndefOr[js.Array[MolecularSequenceRelative]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MolecularSequence: typings.fhir.fhirStrings.MolecularSequence
  
  /**
    * Specimen used for sequencing.
    */
  var specimen: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates the subject this sequence is associated too.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Amino Acid Sequence/ DNA Sequence / RNA Sequence.
    */
  var `type`: js.UndefOr[aa | dna | rna] = js.undefined
}
object MolecularSequence {
  
  inline def apply(): MolecularSequence = {
    val __obj = js.Dynamic.literal(resourceType = "MolecularSequence")
    __obj.asInstanceOf[MolecularSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequence] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setFocus(value: js.Array[Reference]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFocusVarargs(value: Reference*): Self = StObject.set(x, "focus", js.Array(value*))
    
    inline def setFormatted(value: js.Array[Attachment]): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setFormattedVarargs(value: Attachment*): Self = StObject.set(x, "formatted", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setRelative(value: js.Array[MolecularSequenceRelative]): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setRelativeVarargs(value: MolecularSequenceRelative*): Self = StObject.set(x, "relative", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MolecularSequence): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: Reference): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: aa | dna | rna): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_literal(value: Element): Self = StObject.set(x, "_literal", value.asInstanceOf[js.Any])
    
    inline def set_literalUndefined: Self = StObject.set(x, "_literal", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
