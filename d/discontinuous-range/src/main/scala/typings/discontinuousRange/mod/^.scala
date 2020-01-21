package typings.discontinuousRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("discontinuous-range", JSImport.Namespace)
@js.native
class ^ protected () extends DiscontinuousRange {
  /**
    * Creates a discontinuous range at rangeStart, and ending at
    * rangeEnd. If rangeEnd is not specified, a range containing
    * only rangeStart is created.
    * @param rangeStart The start of the range to create.
    * @param rangeEnd   The end of the range to create. Defaults to rangeStart.
    */
  def this(rangeStart: Double) = this()
  def this(rangeStart: Double, rangeEnd: Double) = this()
}

