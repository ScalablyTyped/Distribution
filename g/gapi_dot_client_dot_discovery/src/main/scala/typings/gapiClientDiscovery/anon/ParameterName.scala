package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterName extends js.Object {
  /** Schema ID for the request schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  /** parameter name. */
  var parameterName: js.UndefOr[String] = js.undefined
}

object ParameterName {
  @scala.inline
  def apply($ref: String = null, parameterName: String = null): ParameterName = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterName]
  }
}

