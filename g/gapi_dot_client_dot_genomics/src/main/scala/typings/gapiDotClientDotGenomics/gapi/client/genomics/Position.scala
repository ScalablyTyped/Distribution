package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  /** The 0-based offset from the start of the forward strand for that reference. */
  var position: js.UndefOr[String] = js.undefined
  /** The name of the reference in whatever reference set is being used. */
  var referenceName: js.UndefOr[String] = js.undefined
  /**
    * Whether this position is on the reverse strand, as opposed to the forward
    * strand.
    */
  var reverseStrand: js.UndefOr[Boolean] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    position: String = null,
    referenceName: String = null,
    reverseStrand: js.UndefOr[Boolean] = js.undefined
  ): Position = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseStrand)) __obj.updateDynamic("reverseStrand")(reverseStrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

