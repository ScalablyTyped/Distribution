package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageBucket extends js.Object {
  /**
    * The average number of reads which are aligned to each individual
    * reference base in this bucket.
    */
  var meanCoverage: js.UndefOr[Double] = js.undefined
  /** The genomic coordinate range spanned by this bucket. */
  var range: js.UndefOr[Range] = js.undefined
}

object CoverageBucket {
  @scala.inline
  def apply(meanCoverage: Int | Double = null, range: Range = null): CoverageBucket = {
    val __obj = js.Dynamic.literal()
    if (meanCoverage != null) __obj.updateDynamic("meanCoverage")(meanCoverage.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageBucket]
  }
}

