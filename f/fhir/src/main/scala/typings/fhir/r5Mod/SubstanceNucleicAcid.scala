package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceNucleicAcid
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _areaOfHybridisation: js.UndefOr[Element] = js.undefined
  
  /**
    * The area of hybridisation shall be described if applicable for double stranded RNA or DNA. The number associated with the subunit followed by the number associated to the residue shall be specified in increasing order. The underscore “” shall be used as separator as follows: “Subunitnumber Residue”.
    */
  var areaOfHybridisation: js.UndefOr[String] = js.undefined
  
  /**
    * The number of linear sequences of nucleotides linked through phosphodiester bonds shall be described. Subunits would be strands of nucleic acids that are tightly associated typically through Watson-Crick base pairing. NOTE: If not specified in the reference source, the assumption is that there is 1 subunit.
    */
  var numberOfSubunits: js.UndefOr[Double] = js.undefined
  
  /**
    * (TBC).
    */
  var oligoNucleotideType: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SubstanceNucleicAcid: typings.fhir.fhirStrings.SubstanceNucleicAcid
  
  /**
    * The type of the sequence shall be specified based on a controlled vocabulary.
    */
  var sequenceType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Subunits are listed in order of decreasing length; sequences of the same length will be ordered by molecular weight; subunits that have identical sequences will be repeated multiple times.
    */
  var subunit: js.UndefOr[js.Array[SubstanceNucleicAcidSubunit]] = js.undefined
}
object SubstanceNucleicAcid {
  
  inline def apply(): SubstanceNucleicAcid = {
    val __obj = js.Dynamic.literal(resourceType = "SubstanceNucleicAcid")
    __obj.asInstanceOf[SubstanceNucleicAcid]
  }
  
  extension [Self <: SubstanceNucleicAcid](x: Self) {
    
    inline def setAreaOfHybridisation(value: String): Self = StObject.set(x, "areaOfHybridisation", value.asInstanceOf[js.Any])
    
    inline def setAreaOfHybridisationUndefined: Self = StObject.set(x, "areaOfHybridisation", js.undefined)
    
    inline def setNumberOfSubunits(value: Double): Self = StObject.set(x, "numberOfSubunits", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSubunitsUndefined: Self = StObject.set(x, "numberOfSubunits", js.undefined)
    
    inline def setOligoNucleotideType(value: CodeableConcept): Self = StObject.set(x, "oligoNucleotideType", value.asInstanceOf[js.Any])
    
    inline def setOligoNucleotideTypeUndefined: Self = StObject.set(x, "oligoNucleotideType", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SubstanceNucleicAcid): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSequenceType(value: CodeableConcept): Self = StObject.set(x, "sequenceType", value.asInstanceOf[js.Any])
    
    inline def setSequenceTypeUndefined: Self = StObject.set(x, "sequenceType", js.undefined)
    
    inline def setSubunit(value: js.Array[SubstanceNucleicAcidSubunit]): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunitUndefined: Self = StObject.set(x, "subunit", js.undefined)
    
    inline def setSubunitVarargs(value: SubstanceNucleicAcidSubunit*): Self = StObject.set(x, "subunit", js.Array(value*))
    
    inline def set_areaOfHybridisation(value: Element): Self = StObject.set(x, "_areaOfHybridisation", value.asInstanceOf[js.Any])
    
    inline def set_areaOfHybridisationUndefined: Self = StObject.set(x, "_areaOfHybridisation", js.undefined)
  }
}
