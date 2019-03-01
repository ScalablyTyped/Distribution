package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfig extends js.Object {
  /** The name of this instance configuration as it appears in UIs. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique identifier for the instance configuration.  Values
    * are of the form
    * `projects/<project>/instanceConfigs/a-z&#42;`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceConfig {
  @scala.inline
  def apply(displayName: java.lang.String = null, name: java.lang.String = null): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[InstanceConfig]
  }
}

