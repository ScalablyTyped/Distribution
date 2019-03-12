package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoveragebucketsResource extends js.Object {
  /**
    * Lists fixed width coverage buckets for a read group set, each of which
    * correspond to a range of a reference sequence. Each bucket summarizes
    * coverage information across its corresponding genomic range.
    *
    * For the definitions of read group sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Coverage is defined as the number of reads which are aligned to a given
    * base in the reference sequence. Coverage buckets are available at several
    * precomputed bucket widths, enabling retrieval of various coverage 'zoom
    * levels'. The caller must have READ permissions for the target read group
    * set.
    */
  def list(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackEnd): gapiDotClientLib.gapiNs.clientNs.Request[ListCoverageBucketsResponse]
}

object CoveragebucketsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackEnd => gapiDotClientLib.gapiNs.clientNs.Request[ListCoverageBucketsResponse]
  ): CoveragebucketsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CoveragebucketsResource]
  }
}

