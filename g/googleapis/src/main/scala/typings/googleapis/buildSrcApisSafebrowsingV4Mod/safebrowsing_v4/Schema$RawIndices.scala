package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of raw indices to remove from a local list.
  */
@js.native
trait Schema$RawIndices extends js.Object {
  /**
    * The indices to remove from a lexicographically-sorted local list.
    */
  var indices: js.UndefOr[js.Array[Double]] = js.native
}

object Schema$RawIndices {
  @scala.inline
  def apply(indices: js.Array[Double] = null): Schema$RawIndices = {
    val __obj = js.Dynamic.literal()
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RawIndices]
  }
}

