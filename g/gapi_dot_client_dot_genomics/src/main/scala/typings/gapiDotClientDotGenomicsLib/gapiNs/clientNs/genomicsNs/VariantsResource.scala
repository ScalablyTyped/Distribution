package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantsResource extends js.Object {
  /**
    * Creates a new variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Variant]
  /**
    * Deletes a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadType
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets a variant by ID.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadType
  ): gapiDotClientLib.gapiNs.clientNs.Request[Variant]
  /**
    * Creates variant data by asynchronously importing the provided information.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The variants for import will be merged with any existing variant that
    * matches its reference sequence, start, end, reference bases, and
    * alternative bases. If no such variant exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant, and Variant info fields are merged
    * as specified in
    * infoMergeConfig.
    * As a special case, for single-sample VCF files, QUAL and FILTER fields will
    * be moved to the call level; these are sometimes interpreted in a
    * call-specific context.
    * Imported VCF headers are appended to the metadata already in a variant set.
    */
  def `import`(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Merges the given variants with existing variants.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Each variant will be
    * merged with an existing variant that matches its reference sequence,
    * start, end, reference bases, and alternative bases. If no such variant
    * exists, a new one will be created.
    *
    * When variants are merged, the call information from the new variant
    * is added to the existing variant. Variant info fields are merged as
    * specified in the
    * infoMergeConfig
    * field of the MergeVariantsRequest.
    *
    * Please exercise caution when using this method!  It is easy to introduce
    * mistakes in existing variants and difficult to back out of them.  For
    * example,
    * suppose you were trying to merge a new variant with an existing one and
    * both
    * variants contain calls that belong to callsets with the same callset ID.
    *
    * // Existing variant - irrelevant fields trimmed for clarity
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 0,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * // New variant with conflicting call information
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * The resulting merged variant would overwrite the existing calls with those
    * from the new variant:
    *
    * {
    * "variantSetId": "10473108253681171589",
    * "referenceName": "1",
    * "start": "10582",
    * "referenceBases": "G",
    * "alternateBases": [
    * "A"
    * ],
    * "calls": [
    * {
    * "callSetId": "10473108253681171589-0",
    * "callSetName": "CALLSET0",
    * "genotype": [
    * 1,
    * 1
    * ],
    * }
    * ]
    * }
    *
    * This may be the desired outcome, but it is up to the user to determine if
    * if that is indeed the case.
    */
  def merge(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Updates a variant.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics. Returns the modified variant without
    * its calls.
    */
  def patch(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMask
  ): gapiDotClientLib.gapiNs.clientNs.Request[Variant]
  /**
    * Gets a list of variants matching the criteria.
    *
    * For the definitions of variants and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariants](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L126).
    */
  def search(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchVariantsResponse]
}

object VariantsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotGenomicsLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Variant],
    delete: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadType => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadType => gapiDotClientLib.gapiNs.clientNs.Request[Variant],
    `import`: gapiDotClientDotGenomicsLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    merge: gapiDotClientDotGenomicsLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    patch: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMask => gapiDotClientLib.gapiNs.clientNs.Request[Variant],
    search: gapiDotClientDotGenomicsLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[SearchVariantsResponse]
  ): VariantsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), merge = js.Any.fromFunction1(merge), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[VariantsResource]
  }
}

