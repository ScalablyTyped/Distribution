package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceProtein
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _disulfideLinkage: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * The disulphide bond between two cysteine residues either on the same subunit or on two different subunits shall be described. The position of the disulfide bonds in the SubstanceProtein shall be listed in increasing order of subunit number and position within subunit followed by the abbreviation of the amino acids involved. The disulfide linkage positions shall actually contain the amino acid Cysteine at the respective positions.
    */
  var disulfideLinkage: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Number of linear sequences of amino acids linked through peptide bonds. The number of subunits constituting the SubstanceProtein shall be described. It is possible that the number of subunits can be variable.
    */
  var numberOfSubunits: js.UndefOr[Double] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceProtein: typings.fhir.fhirStrings.SubstanceProtein
  
  /**
    * The SubstanceProtein descriptive elements will only be used when a complete or partial amino acid sequence is available or derivable from a nucleic acid sequence.
    */
  var sequenceType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This subclause refers to the description of each subunit constituting the SubstanceProtein. A subunit is a linear sequence of amino acids linked through peptide bonds. The Subunit information shall be provided when the finished SubstanceProtein is a complex of multiple sequences; subunits are not used to delineate domains within a single sequence. Subunits are listed in order of decreasing length; sequences of the same length will be ordered by decreasing molecular weight; subunits that have identical sequences will be repeated multiple times.
    */
  var subunit: js.UndefOr[js.Array[SubstanceProteinSubunit]] = js.undefined
}
object SubstanceProtein {
  
  inline def apply(): SubstanceProtein = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceProtein")
    __obj.asInstanceOf[SubstanceProtein]
  }
  
  extension [Self <: SubstanceProtein](x: Self) {
    
    inline def setDisulfideLinkage(value: js.Array[String]): Self = StObject.set(x, "disulfideLinkage", value.asInstanceOf[js.Any])
    
    inline def setDisulfideLinkageUndefined: Self = StObject.set(x, "disulfideLinkage", js.undefined)
    
    inline def setDisulfideLinkageVarargs(value: String*): Self = StObject.set(x, "disulfideLinkage", js.Array(value*))
    
    inline def setNumberOfSubunits(value: Double): Self = StObject.set(x, "numberOfSubunits", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSubunitsUndefined: Self = StObject.set(x, "numberOfSubunits", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstanceProtein): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSequenceType(value: CodeableConcept): Self = StObject.set(x, "sequenceType", value.asInstanceOf[js.Any])
    
    inline def setSequenceTypeUndefined: Self = StObject.set(x, "sequenceType", js.undefined)
    
    inline def setSubunit(value: js.Array[SubstanceProteinSubunit]): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunitUndefined: Self = StObject.set(x, "subunit", js.undefined)
    
    inline def setSubunitVarargs(value: SubstanceProteinSubunit*): Self = StObject.set(x, "subunit", js.Array(value*))
    
    inline def set_disulfideLinkage(value: js.Array[Element]): Self = StObject.set(x, "_disulfideLinkage", value.asInstanceOf[js.Any])
    
    inline def set_disulfideLinkageUndefined: Self = StObject.set(x, "_disulfideLinkage", js.undefined)
    
    inline def set_disulfideLinkageVarargs(value: Element*): Self = StObject.set(x, "_disulfideLinkage", js.Array(value*))
  }
}
