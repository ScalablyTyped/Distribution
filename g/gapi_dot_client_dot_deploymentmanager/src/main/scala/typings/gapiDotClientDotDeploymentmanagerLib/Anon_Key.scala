package typings
package gapiDotClientDotDeploymentmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  /**
    * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for
    * a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and
    * a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled
    * for IP forwarding).
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A warning data value corresponding to the key. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Key]
  }
}

