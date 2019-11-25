package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[String] = js.undefined
  /**
    * The reference sequence name, for example `chr1`,
    * `1`, or `chrX`.
    */
  var referenceName: js.UndefOr[String] = js.undefined
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[String] = js.undefined
}

object Range {
  @scala.inline
  def apply(end: String = null, referenceName: String = null, start: String = null): Range = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

