package typings.gapiClientGenomics.gapi.client.genomics

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
  def apply(meanCoverage: js.UndefOr[Double] = js.undefined, range: Range = null): CoverageBucket = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(meanCoverage)) __obj.updateDynamic("meanCoverage")(meanCoverage.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageBucket]
  }
}

