package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageBucket extends js.Object {
  /**
    * The average number of reads which are aligned to each individual
    * reference base in this bucket.
    */
  var meanCoverage: js.UndefOr[Double] = js.native
  /** The genomic coordinate range spanned by this bucket. */
  var range: js.UndefOr[Range] = js.native
}

object CoverageBucket {
  @scala.inline
  def apply(): CoverageBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageBucket]
  }
  @scala.inline
  implicit class CoverageBucketOps[Self <: CoverageBucket] (val x: Self) extends AnyVal {
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
    def setMeanCoverage(value: Double): Self = this.set("meanCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeanCoverage: Self = this.set("meanCoverage", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

