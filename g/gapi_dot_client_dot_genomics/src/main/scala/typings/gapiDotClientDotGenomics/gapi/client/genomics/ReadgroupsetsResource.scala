package typings.gapiDotClientDotGenomics.gapi.client.genomics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGenomics.Anon_Accesstoken
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadgroupsetsResource extends js.Object {
  var coveragebuckets: CoveragebucketsResource
  /**
    * Deletes a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[js.Object]
  /**
    * Exports a read group set to a BAM file in Google Cloud Storage.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Note that currently there may be some differences between exported BAM
    * files and the original BAM file at the time of import. See
    * ImportReadGroupSets
    * for caveats.
    */
  def export(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[Operation]
  /**
    * Gets a read group set by ID.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken): Request[ReadGroupSet]
  /**
    * Creates read group sets by asynchronously importing the provided
    * information.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The caller must have WRITE permissions to the dataset.
    *
    * ## Notes on [BAM](https://samtools.github.io/hts-specs/SAMv1.pdf) import
    *
    * - Tags will be converted to strings - tag types are not preserved
    * - Comments (`@CO`) in the input file header will not be preserved
    * - Original header order of references (`@SQ`) will not be preserved
    * - Any reverse stranded unmapped reads will be reverse complemented, and
    * their qualities (also the "BQ" and "OQ" tags, if any) will be reversed
    * - Unmapped reads will be stripped of positional information (reference name
    * and position)
    */
  def `import`(request: Anon_Accesstoken): Request[Operation]
  /**
    * Updates a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[ReadGroupSet]
  /**
    * Searches for read group sets matching the criteria.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReadGroupSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L135).
    */
  def search(request: Anon_Accesstoken): Request[SearchReadGroupSetsResponse]
}

object ReadgroupsetsResource {
  @scala.inline
  def apply(
    coveragebuckets: CoveragebucketsResource,
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[js.Object],
    export: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[Operation],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtoken => Request[ReadGroupSet],
    `import`: Anon_Accesstoken => Request[Operation],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[ReadGroupSet],
    search: Anon_Accesstoken => Request[SearchReadGroupSetsResponse]
  ): ReadgroupsetsResource = {
    val __obj = js.Dynamic.literal(coveragebuckets = coveragebuckets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[ReadgroupsetsResource]
  }
}

