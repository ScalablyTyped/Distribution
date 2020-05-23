package typings.findProjectRoot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * markers that it will search for
    */
  var markers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * total number of levels the algorithm can traverse
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(markers: js.Array[String] = null, maxDepth: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

