package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantAnnotation extends js.Object {
  /**
    * The alternate allele for this variant. If multiple alternate alleles
    * exist at this location, create a separate variant for each one, as they
    * may represent distinct conditions.
    */
  var alternateBases: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Describes the clinical significance of a variant.
    * It is adapted from the ClinVar controlled vocabulary for clinical
    * significance described at:
    * http://www.ncbi.nlm.nih.gov/clinvar/docs/clinsig/
    */
  var clinicalSignificance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The set of conditions associated with this variant.
    * A condition describes the way a variant influences human health.
    */
  var conditions: js.UndefOr[js.Array[ClinicalCondition]] = js.undefined
  /** Effect of the variant on the coding sequence. */
  var effect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google annotation ID of the gene affected by this variant. This should
    * be provided when the variant is created.
    */
  var geneId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google annotation IDs of the transcripts affected by this variant. These
    * should be provided when the variant is created.
    */
  var transcriptIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Type has been adapted from ClinVar's list of variant types. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object VariantAnnotation {
  @scala.inline
  def apply(
    alternateBases: java.lang.String = null,
    clinicalSignificance: java.lang.String = null,
    conditions: js.Array[ClinicalCondition] = null,
    effect: java.lang.String = null,
    geneId: java.lang.String = null,
    transcriptIds: js.Array[java.lang.String] = null,
    `type`: java.lang.String = null
  ): VariantAnnotation = {
    val __obj = js.Dynamic.literal()
    if (alternateBases != null) __obj.updateDynamic("alternateBases")(alternateBases)
    if (clinicalSignificance != null) __obj.updateDynamic("clinicalSignificance")(clinicalSignificance)
    if (conditions != null) __obj.updateDynamic("conditions")(conditions)
    if (effect != null) __obj.updateDynamic("effect")(effect)
    if (geneId != null) __obj.updateDynamic("geneId")(geneId)
    if (transcriptIds != null) __obj.updateDynamic("transcriptIds")(transcriptIds)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[VariantAnnotation]
  }
}

