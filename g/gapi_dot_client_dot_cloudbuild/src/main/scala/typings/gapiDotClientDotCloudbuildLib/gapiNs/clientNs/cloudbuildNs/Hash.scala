package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  /** The type of hash that was performed. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The hash value. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Hash {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: java.lang.String = null): Hash = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Hash]
  }
}

