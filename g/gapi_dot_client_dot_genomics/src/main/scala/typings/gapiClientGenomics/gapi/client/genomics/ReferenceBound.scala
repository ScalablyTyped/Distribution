package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceBound extends js.Object {
  /** The name of the reference associated with this reference bound. */
  var referenceName: js.UndefOr[String] = js.native
  /**
    * An upper bound (inclusive) on the starting coordinate of any
    * variant in the reference sequence.
    */
  var upperBound: js.UndefOr[String] = js.native
}

object ReferenceBound {
  @scala.inline
  def apply(): ReferenceBound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceBound]
  }
  @scala.inline
  implicit class ReferenceBoundOps[Self <: ReferenceBound] (val x: Self) extends AnyVal {
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
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceName: Self = this.set("referenceName", js.undefined)
    @scala.inline
    def setUpperBound(value: String): Self = this.set("upperBound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperBound: Self = this.set("upperBound", js.undefined)
  }
  
}

