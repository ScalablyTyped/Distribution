package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Range extends js.Object {
  /** The end position of the range on the reference, 0-based exclusive. */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The reference sequence name, for example `chr1`,
               * `1`, or `chrX`.
               */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /** The start position of the range on the reference, 0-based inclusive. */
  var start: js.UndefOr[java.lang.String] = js.undefined
}

