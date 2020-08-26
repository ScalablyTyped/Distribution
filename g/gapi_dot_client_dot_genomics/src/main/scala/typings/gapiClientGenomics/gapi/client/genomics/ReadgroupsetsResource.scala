package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.Pp
import typings.gapiClientGenomics.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadgroupsetsResource extends js.Object {
  var coveragebuckets: CoveragebucketsResource = js.native
  /**
    * Deletes a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: Pp): Request[js.Object] = js.native
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
  def export(request: Pp): Request[Operation] = js.native
  /**
    * Gets a read group set by ID.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: Pp): Request[ReadGroupSet] = js.native
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
  def `import`(request: Accesstoken): Request[Operation] = js.native
  /**
    * Updates a read group set.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: PrettyPrint): Request[ReadGroupSet] = js.native
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
  def search(request: Accesstoken): Request[SearchReadGroupSetsResponse] = js.native
}

object ReadgroupsetsResource {
  @scala.inline
  def apply(
    coveragebuckets: CoveragebucketsResource,
    delete: Pp => Request[js.Object],
    export: Pp => Request[Operation],
    get: Pp => Request[ReadGroupSet],
    `import`: Accesstoken => Request[Operation],
    patch: PrettyPrint => Request[ReadGroupSet],
    search: Accesstoken => Request[SearchReadGroupSetsResponse]
  ): ReadgroupsetsResource = {
    val __obj = js.Dynamic.literal(coveragebuckets = coveragebuckets.asInstanceOf[js.Any], delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
    __obj.asInstanceOf[ReadgroupsetsResource]
  }
  @scala.inline
  implicit class ReadgroupsetsResourceOps[Self <: ReadgroupsetsResource] (val x: Self) extends AnyVal {
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
    def setCoveragebuckets(value: CoveragebucketsResource): Self = this.set("coveragebuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: Pp => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setExport(value: Pp => Request[Operation]): Self = this.set("export", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Pp => Request[ReadGroupSet]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setImport(value: Accesstoken => Request[Operation]): Self = this.set("import", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: PrettyPrint => Request[ReadGroupSet]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchReadGroupSetsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

