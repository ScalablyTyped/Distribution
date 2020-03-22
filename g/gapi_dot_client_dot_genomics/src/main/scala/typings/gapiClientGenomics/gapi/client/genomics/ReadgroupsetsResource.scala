package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstoken
import typings.gapiClientGenomics.AnonPp
import typings.gapiClientGenomics.AnonPrettyPrint
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
  def delete(request: AnonPp): Request_[js.Object]
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
  def export(request: AnonPp): Request_[Operation]
  /**
    * Gets a read group set by ID.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonPp): Request_[ReadGroupSet]
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
  def `import`(request: AnonAccesstoken): Request_[Operation]
  /**
    * Updates a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonPrettyPrint): Request_[ReadGroupSet]
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
  def search(request: AnonAccesstoken): Request_[SearchReadGroupSetsResponse]
}

object ReadgroupsetsResource {
  @scala.inline
  def apply(
    coveragebuckets: CoveragebucketsResource,
    delete: AnonPp => Request_[js.Object],
    export: AnonPp => Request_[Operation],
    get: AnonPp => Request_[ReadGroupSet],
    `import`: AnonAccesstoken => Request_[Operation],
    patch: AnonPrettyPrint => Request_[ReadGroupSet],
    search: AnonAccesstoken => Request_[SearchReadGroupSetsResponse]
  ): ReadgroupsetsResource = {
    val __obj = js.Dynamic.literal(coveragebuckets = coveragebuckets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[ReadgroupsetsResource]
  }
}

