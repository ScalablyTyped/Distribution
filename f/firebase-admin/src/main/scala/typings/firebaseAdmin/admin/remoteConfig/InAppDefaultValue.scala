package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an in-app-default value.
  */
trait InAppDefaultValue extends RemoteConfigParameterValue {
  /**
    * If `true`, the parameter is omitted from the parameter values returned to a client.
    */
  var useInAppDefault: Boolean
}

object InAppDefaultValue {
  @scala.inline
  def apply(useInAppDefault: Boolean): InAppDefaultValue = {
    val __obj = js.Dynamic.literal(useInAppDefault = useInAppDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[InAppDefaultValue]
  }
}

