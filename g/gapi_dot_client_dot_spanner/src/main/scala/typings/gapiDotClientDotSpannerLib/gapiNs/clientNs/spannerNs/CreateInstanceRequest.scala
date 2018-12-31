package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceRequest extends js.Object {
  /**
    * Required. The instance to create.  The name may be omitted, but if
    * specified must be `<parent>/instances/<instance_id>`.
    */
  var instance: js.UndefOr[Instance] = js.undefined
  /**
    * Required. The ID of the instance to create.  Valid identifiers are of the
    * form `a-z&#42;[a-z0-9]` and must be between 6 and 30 characters in
    * length.
    */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
}

