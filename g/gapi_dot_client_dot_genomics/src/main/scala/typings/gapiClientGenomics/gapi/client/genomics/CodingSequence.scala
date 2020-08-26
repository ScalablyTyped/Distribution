package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodingSequence extends js.Object {
  /**
    * The end of the coding sequence on this annotation's reference sequence,
    * 0-based exclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var end: js.UndefOr[String] = js.native
  /**
    * The start of the coding sequence on this annotation's reference sequence,
    * 0-based inclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var start: js.UndefOr[String] = js.native
}

object CodingSequence {
  @scala.inline
  def apply(): CodingSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodingSequence]
  }
  @scala.inline
  implicit class CodingSequenceOps[Self <: CodingSequence] (val x: Self) extends AnyVal {
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
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

