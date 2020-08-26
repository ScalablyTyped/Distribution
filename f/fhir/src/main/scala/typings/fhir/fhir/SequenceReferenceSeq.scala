package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sequence used as reference
  */
@js.native
trait SequenceReferenceSeq extends BackboneElement {
  /**
    * Contains extended information for property 'genomeBuild'.
    */
  var _genomeBuild: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referenceSeqString'.
    */
  var _referenceSeqString: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'strand'.
    */
  var _strand: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'windowEnd'.
    */
  var _windowEnd: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'windowStart'.
    */
  var _windowStart: js.UndefOr[Element] = js.native
  /**
    * Chromosome containing genetic finding
    */
  var chromosome: js.UndefOr[CodeableConcept] = js.native
  /**
    * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
    */
  var genomeBuild: js.UndefOr[String] = js.native
  /**
    * Reference identifier
    */
  var referenceSeqId: js.UndefOr[CodeableConcept] = js.native
  /**
    * A Pointer to another Sequence entity as reference sequence
    */
  var referenceSeqPointer: js.UndefOr[Reference] = js.native
  /**
    * A string to represent reference sequence
    */
  var referenceSeqString: js.UndefOr[String] = js.native
  /**
    * Directionality of DNA ( +1/-1)
    */
  var strand: js.UndefOr[integer] = js.native
  /**
    * End position of the window on the reference sequence
    */
  var windowEnd: integer = js.native
  /**
    * Start position of the window on the  reference sequence
    */
  var windowStart: integer = js.native
}

object SequenceReferenceSeq {
  @scala.inline
  def apply(windowEnd: integer, windowStart: integer): SequenceReferenceSeq = {
    val __obj = js.Dynamic.literal(windowEnd = windowEnd.asInstanceOf[js.Any], windowStart = windowStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceReferenceSeq]
  }
  @scala.inline
  implicit class SequenceReferenceSeqOps[Self <: SequenceReferenceSeq] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindowEnd(value: integer): Self = this.set("windowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowStart(value: integer): Self = this.set("windowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def set_genomeBuild(value: Element): Self = this.set("_genomeBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_genomeBuild: Self = this.set("_genomeBuild", js.undefined)
    @scala.inline
    def set_referenceSeqString(value: Element): Self = this.set("_referenceSeqString", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_referenceSeqString: Self = this.set("_referenceSeqString", js.undefined)
    @scala.inline
    def set_strand(value: Element): Self = this.set("_strand", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_strand: Self = this.set("_strand", js.undefined)
    @scala.inline
    def set_windowEnd(value: Element): Self = this.set("_windowEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_windowEnd: Self = this.set("_windowEnd", js.undefined)
    @scala.inline
    def set_windowStart(value: Element): Self = this.set("_windowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_windowStart: Self = this.set("_windowStart", js.undefined)
    @scala.inline
    def setChromosome(value: CodeableConcept): Self = this.set("chromosome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromosome: Self = this.set("chromosome", js.undefined)
    @scala.inline
    def setGenomeBuild(value: String): Self = this.set("genomeBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenomeBuild: Self = this.set("genomeBuild", js.undefined)
    @scala.inline
    def setReferenceSeqId(value: CodeableConcept): Self = this.set("referenceSeqId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSeqId: Self = this.set("referenceSeqId", js.undefined)
    @scala.inline
    def setReferenceSeqPointer(value: Reference): Self = this.set("referenceSeqPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSeqPointer: Self = this.set("referenceSeqPointer", js.undefined)
    @scala.inline
    def setReferenceSeqString(value: String): Self = this.set("referenceSeqString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSeqString: Self = this.set("referenceSeqString", js.undefined)
    @scala.inline
    def setStrand(value: integer): Self = this.set("strand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrand: Self = this.set("strand", js.undefined)
  }
  
}

