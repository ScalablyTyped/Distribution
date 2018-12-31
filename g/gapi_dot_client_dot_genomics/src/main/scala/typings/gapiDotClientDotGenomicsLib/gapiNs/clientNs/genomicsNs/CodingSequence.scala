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

