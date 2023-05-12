package typings.fhir.r5Mod

import typings.fhir.fhirStrings.antisense
import typings.fhir.fhirStrings.crick
import typings.fhir.fhirStrings.sense
import typings.fhir.fhirStrings.watson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceRelativeStartingSequence
  extends StObject
     with BackboneElement {
  
  var _orientation: js.UndefOr[Element] = js.undefined
  
  var _sequenceString: js.UndefOr[Element] = js.undefined
  
  var _strand: js.UndefOr[Element] = js.undefined
  
  /**
    * Structural unit composed of a nucleic acid molecule which controls its own replication through the interaction of specific proteins at one or more origins of replication ([SO:0000340](http://www.sequenceontology.org/browser/current_svn/term/SO:0000340)).
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The genome assembly used for starting sequence, e.g. GRCh38.
    */
  var genomeAssembly: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A relative reference to a DNA strand based on gene orientation. The strand that contains the open reading frame of the gene is the "sense" strand, and the opposite complementary strand is the "antisense" strand.
    */
  var orientation: js.UndefOr[sense | antisense] = js.undefined
  
  /**
    * A starting sequence may be represented in one of three ways:
    *   1.  CodeableConcept, using NCBI, LRG or other appropriate code systems
    *   1.  a simple string of IUPAC codes
    *   1.  a reference to another MolecularSequence resource.
    */
  var sequenceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A starting sequence may be represented in one of three ways:
    *   1.  CodeableConcept, using NCBI, LRG or other appropriate code systems
    *   1.  a simple string of IUPAC codes
    *   1.  a reference to another MolecularSequence resource.
    */
  var sequenceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A starting sequence may be represented in one of three ways:
    *   1.  CodeableConcept, using NCBI, LRG or other appropriate code systems
    *   1.  a simple string of IUPAC codes
    *   1.  a reference to another MolecularSequence resource.
    */
  var sequenceString: js.UndefOr[String] = js.undefined
  
  /**
    * An absolute reference to a strand. The Watson strand is the strand whose 5'-end is on the short arm of the chromosome, and the Crick strand as the one whose 5'-end is on the long arm.
    */
  var strand: js.UndefOr[watson | crick] = js.undefined
  
  /**
    * End position of the window on the starting sequence. This value should honor the rules of the  coordinateSystem.
    */
  var windowEnd: js.UndefOr[Double] = js.undefined
  
  /**
    * Start position of the window on the starting sequence. This value should honor the rules of the coordinateSystem.
    */
  var windowStart: js.UndefOr[Double] = js.undefined
}
object MolecularSequenceRelativeStartingSequence {
  
  inline def apply(): MolecularSequenceRelativeStartingSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceRelativeStartingSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceRelativeStartingSequence] (val x: Self) extends AnyVal {
    
    inline def setChromosome(value: CodeableConcept): Self = StObject.set(x, "chromosome", value.asInstanceOf[js.Any])
    
    inline def setChromosomeUndefined: Self = StObject.set(x, "chromosome", js.undefined)
    
    inline def setGenomeAssembly(value: CodeableConcept): Self = StObject.set(x, "genomeAssembly", value.asInstanceOf[js.Any])
    
    inline def setGenomeAssemblyUndefined: Self = StObject.set(x, "genomeAssembly", js.undefined)
    
    inline def setOrientation(value: sense | antisense): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSequenceCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "sequenceCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setSequenceCodeableConceptUndefined: Self = StObject.set(x, "sequenceCodeableConcept", js.undefined)
    
    inline def setSequenceReference(value: Reference): Self = StObject.set(x, "sequenceReference", value.asInstanceOf[js.Any])
    
    inline def setSequenceReferenceUndefined: Self = StObject.set(x, "sequenceReference", js.undefined)
    
    inline def setSequenceString(value: String): Self = StObject.set(x, "sequenceString", value.asInstanceOf[js.Any])
    
    inline def setSequenceStringUndefined: Self = StObject.set(x, "sequenceString", js.undefined)
    
    inline def setStrand(value: watson | crick): Self = StObject.set(x, "strand", value.asInstanceOf[js.Any])
    
    inline def setStrandUndefined: Self = StObject.set(x, "strand", js.undefined)
    
    inline def setWindowEnd(value: Double): Self = StObject.set(x, "windowEnd", value.asInstanceOf[js.Any])
    
    inline def setWindowEndUndefined: Self = StObject.set(x, "windowEnd", js.undefined)
    
    inline def setWindowStart(value: Double): Self = StObject.set(x, "windowStart", value.asInstanceOf[js.Any])
    
    inline def setWindowStartUndefined: Self = StObject.set(x, "windowStart", js.undefined)
    
    inline def set_orientation(value: Element): Self = StObject.set(x, "_orientation", value.asInstanceOf[js.Any])
    
    inline def set_orientationUndefined: Self = StObject.set(x, "_orientation", js.undefined)
    
    inline def set_sequenceString(value: Element): Self = StObject.set(x, "_sequenceString", value.asInstanceOf[js.Any])
    
    inline def set_sequenceStringUndefined: Self = StObject.set(x, "_sequenceString", js.undefined)
    
    inline def set_strand(value: Element): Self = StObject.set(x, "_strand", value.asInstanceOf[js.Any])
    
    inline def set_strandUndefined: Self = StObject.set(x, "_strand", js.undefined)
  }
}
