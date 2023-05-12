package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceProteinSubunit
  extends StObject
     with BackboneElement {
  
  var _cTerminalModification: js.UndefOr[Element] = js.undefined
  
  var _nTerminalModification: js.UndefOr[Element] = js.undefined
  
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * The modification at the C-terminal shall be specified.
    */
  var cTerminalModification: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
    */
  var cTerminalModificationId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Length of linear sequences of amino acids contained in the subunit.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the fragment modified at the N-terminal of the SubstanceProtein shall be specified.
    */
  var nTerminalModification: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for molecular fragment modification based on the ISO 11238 Substance ID.
    */
  var nTerminalModificationId: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids that are not represented with a single letter code an X should be used within the sequence. The modified amino acids will be distinguished by their position in the sequence.
    */
  var sequence: js.UndefOr[String] = js.undefined
  
  /**
    * The sequence information shall be provided enumerating the amino acids from N- to C-terminal end using standard single-letter amino acid codes. Uppercase shall be used for L-amino acids and lowercase for D-amino acids. Transcribed SubstanceProteins will always be described using the translated sequence; for synthetic peptide containing amino acids that are not represented with a single letter code an X should be used within the sequence. The modified amino acids will be distinguished by their position in the sequence.
    */
  var sequenceAttachment: js.UndefOr[Attachment] = js.undefined
  
  /**
    * Index of primary sequences of amino acids linked through peptide bonds in order of decreasing length. Sequences of the same length will be ordered by molecular weight. Subunits that have identical sequences will be repeated and have sequential subscripts.
    */
  var subunit: js.UndefOr[Double] = js.undefined
}
object SubstanceProteinSubunit {
  
  inline def apply(): SubstanceProteinSubunit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceProteinSubunit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceProteinSubunit] (val x: Self) extends AnyVal {
    
    inline def setCTerminalModification(value: String): Self = StObject.set(x, "cTerminalModification", value.asInstanceOf[js.Any])
    
    inline def setCTerminalModificationId(value: Identifier): Self = StObject.set(x, "cTerminalModificationId", value.asInstanceOf[js.Any])
    
    inline def setCTerminalModificationIdUndefined: Self = StObject.set(x, "cTerminalModificationId", js.undefined)
    
    inline def setCTerminalModificationUndefined: Self = StObject.set(x, "cTerminalModification", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setNTerminalModification(value: String): Self = StObject.set(x, "nTerminalModification", value.asInstanceOf[js.Any])
    
    inline def setNTerminalModificationId(value: Identifier): Self = StObject.set(x, "nTerminalModificationId", value.asInstanceOf[js.Any])
    
    inline def setNTerminalModificationIdUndefined: Self = StObject.set(x, "nTerminalModificationId", js.undefined)
    
    inline def setNTerminalModificationUndefined: Self = StObject.set(x, "nTerminalModification", js.undefined)
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceAttachment(value: Attachment): Self = StObject.set(x, "sequenceAttachment", value.asInstanceOf[js.Any])
    
    inline def setSequenceAttachmentUndefined: Self = StObject.set(x, "sequenceAttachment", js.undefined)
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSubunit(value: Double): Self = StObject.set(x, "subunit", value.asInstanceOf[js.Any])
    
    inline def setSubunitUndefined: Self = StObject.set(x, "subunit", js.undefined)
    
    inline def set_cTerminalModification(value: Element): Self = StObject.set(x, "_cTerminalModification", value.asInstanceOf[js.Any])
    
    inline def set_cTerminalModificationUndefined: Self = StObject.set(x, "_cTerminalModification", js.undefined)
    
    inline def set_nTerminalModification(value: Element): Self = StObject.set(x, "_nTerminalModification", value.asInstanceOf[js.Any])
    
    inline def set_nTerminalModificationUndefined: Self = StObject.set(x, "_nTerminalModification", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
