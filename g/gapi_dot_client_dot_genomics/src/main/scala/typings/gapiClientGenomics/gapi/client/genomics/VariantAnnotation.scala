package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantAnnotation extends js.Object {
  /**
    * The alternate allele for this variant. If multiple alternate alleles
    * exist at this location, create a separate variant for each one, as they
    * may represent distinct conditions.
    */
  var alternateBases: js.UndefOr[String] = js.native
  /**
    * Describes the clinical significance of a variant.
    * It is adapted from the ClinVar controlled vocabulary for clinical
    * significance described at:
    * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
    */
  var clinicalSignificance: js.UndefOr[String] = js.native
  /**
    * The set of conditions associated with this variant.
    * A condition describes the way a variant influences human health.
    */
  var conditions: js.UndefOr[js.Array[ClinicalCondition]] = js.native
  /** Effect of the variant on the coding sequence. */
  var effect: js.UndefOr[String] = js.native
  /**
    * Google annotation ID of the gene affected by this variant. This should
    * be provided when the variant is created.
    */
  var geneId: js.UndefOr[String] = js.native
  /**
    * Google annotation IDs of the transcripts affected by this variant. These
    * should be provided when the variant is created.
    */
  var transcriptIds: js.UndefOr[js.Array[String]] = js.native
  /** Type has been adapted from ClinVar's list of variant types. */
  var `type`: js.UndefOr[String] = js.native
}

object VariantAnnotation {
  @scala.inline
  def apply(): VariantAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantAnnotation]
  }
  @scala.inline
  implicit class VariantAnnotationOps[Self <: VariantAnnotation] (val x: Self) extends AnyVal {
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
    def setAlternateBases(value: String): Self = this.set("alternateBases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateBases: Self = this.set("alternateBases", js.undefined)
    @scala.inline
    def setClinicalSignificance(value: String): Self = this.set("clinicalSignificance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClinicalSignificance: Self = this.set("clinicalSignificance", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: ClinicalCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[ClinicalCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setGeneId(value: String): Self = this.set("geneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneId: Self = this.set("geneId", js.undefined)
    @scala.inline
    def setTranscriptIdsVarargs(value: String*): Self = this.set("transcriptIds", js.Array(value :_*))
    @scala.inline
    def setTranscriptIds(value: js.Array[String]): Self = this.set("transcriptIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranscriptIds: Self = this.set("transcriptIds", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

