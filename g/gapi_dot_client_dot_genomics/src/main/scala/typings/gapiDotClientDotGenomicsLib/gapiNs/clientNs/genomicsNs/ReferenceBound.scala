package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceBound extends js.Object {
  /** The name of the reference associated with this reference bound. */
  var referenceName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An upper bound (inclusive) on the starting coordinate of any
    * variant in the reference sequence.
    */
  var upperBound: js.UndefOr[java.lang.String] = js.undefined
}

object ReferenceBound {
  @scala.inline
  def apply(referenceName: java.lang.String = null, upperBound: java.lang.String = null): ReferenceBound = {
    val __obj = js.Dynamic.literal()
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName)
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound)
    __obj.asInstanceOf[ReferenceBound]
  }
}

