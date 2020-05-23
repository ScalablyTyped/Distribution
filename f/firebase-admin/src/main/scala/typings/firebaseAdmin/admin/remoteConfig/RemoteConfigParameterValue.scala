package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type representing a Remote Config parameter value.
  * A `RemoteConfigParameterValue` could be either an `ExplicitParameterValue` or 
  * an `InAppDefaultValue`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseAdmin.admin.remoteConfig.ExplicitParameterValue
  - typings.firebaseAdmin.admin.remoteConfig.InAppDefaultValue
*/
trait RemoteConfigParameterValue extends js.Object

object RemoteConfigParameterValue {
  @scala.inline
  def ExplicitParameterValue(value: String): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
  @scala.inline
  def InAppDefaultValue(useInAppDefault: Boolean): RemoteConfigParameterValue = {
    val __obj = js.Dynamic.literal(useInAppDefault = useInAppDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteConfigParameterValue]
  }
}

