package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadsResource extends js.Object {
  /**
    * Gets a list of reads for one or more read group sets.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Reads search operates over a genomic coordinate space of reference sequence
    * & position defined over the reference sequences to which the requested
    * read group sets are aligned.
    *
    * If a target positional range is specified, search returns all reads whose
    * alignment to the reference genome overlap the range. A query which
    * specifies only read group set IDs yields all reads in those read group
    * sets, including unmapped reads.
    *
    * All reads returned (including reads on subsequent pages) are ordered by
    * genomic coordinate (by reference sequence, then position). Reads with
    * equivalent genomic coordinates are returned in an unspecified order. This
    * order is consistent, such that two queries for the same content (regardless
    * of page size) yield reads in the same order across their respective streams
    * of paginated responses.
    *
    * Implements
    * [GlobalAllianceApi.searchReads](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/readmethods.avdl#L85).
    */
  def search(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchReadsResponse]
}

object ReadsResource {
  @scala.inline
  def apply(
    search: gapiDotClientDotGenomicsLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[SearchReadsResponse]
  ): ReadsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ReadsResource]
  }
}

