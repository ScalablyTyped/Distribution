package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HostRule extends js.Object {
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The list of host patterns to match. They must be valid hostnames, except &#42; will match any string of ([a-z0-9-.]&#42;). In that case, &#42; must be the first
               * character and must be followed in the pattern by either - or ..
               */
  var hosts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion. */
  var pathMatcher: js.UndefOr[java.lang.String] = js.undefined
}

