package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodingSequence extends js.Object {
  /**
    * The end of the coding sequence on this annotation's reference sequence,
    * 0-based exclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start of the coding sequence on this annotation's reference sequence,
    * 0-based inclusive. Note that this position is relative to the reference
    * start, and &#42;not&#42; the containing annotation start.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

object CodingSequence {
  @scala.inline
  def apply(end: java.lang.String = null, start: java.lang.String = null): CodingSequence = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[CodingSequence]
  }
}

