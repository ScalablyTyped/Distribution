package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceConfig extends js.Object {
  /** The name of this instance configuration as it appears in UIs. */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the instance configuration.  Values
    * are of the form
    * `projects/<project>/instanceConfigs/a-z&#42;`
    */
  var name: js.UndefOr[String] = js.undefined
}

object InstanceConfig {
  @scala.inline
  def apply(displayName: String = null, name: String = null): InstanceConfig = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceConfig]
  }
}

