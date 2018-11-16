package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Position extends js.Object {
  /** The 0-based offset from the start of the forward strand for that reference. */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the reference in whatever reference set is being used. */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether this position is on the reverse strand, as opposed to the forward
               * strand.
               */
  var reverseStrand: js.UndefOr[scala.Boolean] = js.undefined
}

