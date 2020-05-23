package typings.firebaseAdmin.admin.remoteConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing an explicit parameter value.
  */
trait ExplicitParameterValue extends RemoteConfigParameterValue {
  /**
    * The `string` value that the parameter is set to.
    */
  var value: String
}

object ExplicitParameterValue {
  @scala.inline
  def apply(value: String): ExplicitParameterValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParameterValue]
  }
}

