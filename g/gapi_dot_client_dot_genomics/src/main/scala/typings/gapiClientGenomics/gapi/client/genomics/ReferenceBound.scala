package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceBound extends js.Object {
  /** The name of the reference associated with this reference bound. */
  var referenceName: js.UndefOr[String] = js.undefined
  /**
    * An upper bound (inclusive) on the starting coordinate of any
    * variant in the reference sequence.
    */
  var upperBound: js.UndefOr[String] = js.undefined
}

object ReferenceBound {
  @scala.inline
  def apply(referenceName: String = null, upperBound: String = null): ReferenceBound = {
    val __obj = js.Dynamic.literal()
    if (referenceName != null) __obj.updateDynamic("referenceName")(referenceName.asInstanceOf[js.Any])
    if (upperBound != null) __obj.updateDynamic("upperBound")(upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceBound]
  }
}

