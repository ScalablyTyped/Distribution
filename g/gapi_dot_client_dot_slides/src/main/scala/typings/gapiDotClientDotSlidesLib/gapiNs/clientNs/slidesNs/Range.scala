package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The optional zero-based index of the end of the collection.
    * Required for `FIXED_RANGE` ranges.
    */
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The optional zero-based index of the beginning of the collection.
    * Required for `FIXED_RANGE` and `FROM_START_INDEX` ranges.
    */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** The type of range. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

