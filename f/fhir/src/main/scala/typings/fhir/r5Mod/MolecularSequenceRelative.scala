package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceRelative
  extends StObject
     with BackboneElement {
  
  /**
    * These are different ways of identifying nucleotides or amino acids within a sequence. Different databases and file types may use different systems. For detail definitions, see https://loinc.org/92822-6/ for more detail.
    */
  var coordinateSystem: CodeableConcept
  
  /**
    * Changes in sequence from the starting sequence.
    */
  var edit: js.UndefOr[js.Array[MolecularSequenceRelativeEdit]] = js.undefined
  
  /**
    * Indicates the order in which the sequence should be considered when putting multiple 'relative' elements together.
    */
  var ordinalPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the nucleotide range in the composed sequence when multiple 'relative' elements are used together.
    */
  var sequenceRange: js.UndefOr[Range] = js.undefined
  
  /**
    * A sequence that is used as a starting sequence to describe variants that are present in a sequence analyzed.
    */
  var startingSequence: js.UndefOr[MolecularSequenceRelativeStartingSequence] = js.undefined
}
object MolecularSequenceRelative {
  
  inline def apply(coordinateSystem: CodeableConcept): MolecularSequenceRelative = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MolecularSequenceRelative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceRelative] (val x: Self) extends AnyVal {
    
    inline def setCoordinateSystem(value: CodeableConcept): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: js.Array[MolecularSequenceRelativeEdit]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditVarargs(value: MolecularSequenceRelativeEdit*): Self = StObject.set(x, "edit", js.Array(value*))
    
    inline def setOrdinalPosition(value: Double): Self = StObject.set(x, "ordinalPosition", value.asInstanceOf[js.Any])
    
    inline def setOrdinalPositionUndefined: Self = StObject.set(x, "ordinalPosition", js.undefined)
    
    inline def setSequenceRange(value: Range): Self = StObject.set(x, "sequenceRange", value.asInstanceOf[js.Any])
    
    inline def setSequenceRangeUndefined: Self = StObject.set(x, "sequenceRange", js.undefined)
    
    inline def setStartingSequence(value: MolecularSequenceRelativeStartingSequence): Self = StObject.set(x, "startingSequence", value.asInstanceOf[js.Any])
    
    inline def setStartingSequenceUndefined: Self = StObject.set(x, "startingSequence", js.undefined)
  }
}
