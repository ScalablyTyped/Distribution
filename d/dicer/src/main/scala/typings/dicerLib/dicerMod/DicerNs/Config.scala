package typings
package dicerLib.dicerMod.DicerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * This is the boundary used to detect the beginning of a new part.
    */
  var boundary: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, preamble header parsing will be performed first.
    */
  var headerFirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The maximum number of header key=>value pairs to parse Default: 2000 (same as node's http).
    */
  var maxHeaderPairs: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    boundary: java.lang.String = null,
    headerFirst: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeaderPairs: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (!js.isUndefined(headerFirst)) __obj.updateDynamic("headerFirst")(headerFirst)
    if (maxHeaderPairs != null) __obj.updateDynamic("maxHeaderPairs")(maxHeaderPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

