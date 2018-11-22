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

