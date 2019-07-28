package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathRule extends js.Object {
  /**
    * The list of path patterns to match. Each must start with / and the only place a &#42; is allowed is at the end following a /. The string fed to the path
    * matcher does not include any text after the first ? or #, and those chars are not allowed here.
    */
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  /** The URL of the BackendService resource if this rule is matched. */
  var service: js.UndefOr[String] = js.undefined
}

object PathRule {
  @scala.inline
  def apply(paths: js.Array[String] = null, service: String = null): PathRule = {
    val __obj = js.Dynamic.literal()
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[PathRule]
  }
}

