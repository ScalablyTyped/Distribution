package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRequest extends js.Object {
  /** The new app state data that your application is trying to update with. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#updateRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateRequest {
  @scala.inline
  def apply(data: java.lang.String = null, kind: java.lang.String = null): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[UpdateRequest]
  }
}

