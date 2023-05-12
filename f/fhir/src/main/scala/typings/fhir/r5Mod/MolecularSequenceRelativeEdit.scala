package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceRelativeEdit
  extends StObject
     with BackboneElement {
  
  var _replacedSequence: js.UndefOr[Element] = js.undefined
  
  var _replacementSequence: js.UndefOr[Element] = js.undefined
  
  /**
    * End position of the edit on the starting sequence. If the coordinate system is 0-based then end is exclusive and does not include the last position. If the coordinate system is 1-base, then end is inclusive and includes the last position.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Allele in the starting sequence. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the starting sequence. When the sequence  type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
    */
  var replacedSequence: js.UndefOr[String] = js.undefined
  
  /**
    * Allele that was observed. Nucleotide(s)/amino acids from start position of sequence to stop position of sequence on the positive (+) strand of the observed sequence. When the sequence type is DNA, it should be the sequence on the positive (+) strand. This will lay in the range between variant.start and variant.end.
    */
  var replacementSequence: js.UndefOr[String] = js.undefined
  
  /**
    * Start position of the edit on the starting sequence. If the coordinate system is either 0-based or 1-based, then start position is inclusive.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object MolecularSequenceRelativeEdit {
  
  inline def apply(): MolecularSequenceRelativeEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MolecularSequenceRelativeEdit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceRelativeEdit] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setReplacedSequence(value: String): Self = StObject.set(x, "replacedSequence", value.asInstanceOf[js.Any])
    
    inline def setReplacedSequenceUndefined: Self = StObject.set(x, "replacedSequence", js.undefined)
    
    inline def setReplacementSequence(value: String): Self = StObject.set(x, "replacementSequence", value.asInstanceOf[js.Any])
    
    inline def setReplacementSequenceUndefined: Self = StObject.set(x, "replacementSequence", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def set_replacedSequence(value: Element): Self = StObject.set(x, "_replacedSequence", value.asInstanceOf[js.Any])
    
    inline def set_replacedSequenceUndefined: Self = StObject.set(x, "_replacedSequence", js.undefined)
    
    inline def set_replacementSequence(value: Element): Self = StObject.set(x, "_replacementSequence", value.asInstanceOf[js.Any])
    
    inline def set_replacementSequenceUndefined: Self = StObject.set(x, "_replacementSequence", js.undefined)
  }
}
