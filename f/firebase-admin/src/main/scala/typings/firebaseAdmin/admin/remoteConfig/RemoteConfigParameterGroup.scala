package typings.firebaseAdmin.admin.remoteConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteConfigParameterGroup extends js.Object {
  /**
    * A description for the group. Its length must be less than or equal to 256 characters.
    * A description may contain any Unicode characters.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Map of parameter keys to their optional default values and optional conditional values for
    * parameters that belong to this group. A parameter only appears once per
    * Remote Config template. An ungrouped parameter appears at the top level, whereas a
    * parameter organized within a group appears within its group's map of parameters.
    */
  var parameters: StringDictionary[RemoteConfigParameter]
}

object RemoteConfigParameterGroup {
  @scala.inline
  def apply(parameters: StringDictionary[RemoteConfigParameter], description: String = null): RemoteConfigParameterGroup = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameterGroup]
  }
}

