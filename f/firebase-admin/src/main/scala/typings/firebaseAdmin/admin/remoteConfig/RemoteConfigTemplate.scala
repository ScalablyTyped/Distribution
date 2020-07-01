package typings.firebaseAdmin.admin.remoteConfig

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a Remote Config template.
  */
trait RemoteConfigTemplate extends js.Object {
  /**
    * A list of conditions in descending order by priority.
    */
  var conditions: js.Array[RemoteConfigCondition]
  /**
    * ETag of the current Remote Config template (readonly).
    */
  val etag: String
  /**
    * Map of parameter group names to their parameter group objects.
    * A group's name is mutable but must be unique among groups in the Remote Config template.
    * The name is limited to 256 characters and intended to be human-readable. Any Unicode
    * characters are allowed.
    */
  var parameterGroups: StringDictionary[RemoteConfigParameterGroup]
  /**
    * Map of parameter keys to their optional default values and optional conditional values.
    */
  var parameters: StringDictionary[RemoteConfigParameter]
  /**
    * Version information for the current Remote Config template.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object RemoteConfigTemplate {
  @scala.inline
  def apply(
    conditions: js.Array[RemoteConfigCondition],
    etag: String,
    parameterGroups: StringDictionary[RemoteConfigParameterGroup],
    parameters: StringDictionary[RemoteConfigParameter],
    version: Version = null
  ): RemoteConfigTemplate = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], parameterGroups = parameterGroups.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigTemplate]
  }
}

