package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParameterName extends js.Object {
  /** Schema ID for the request schema. */
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  /** parameter name. */
  var parameterName: js.UndefOr[String] = js.undefined
}

object Anon_ParameterName {
  @scala.inline
  def apply($ref: String = null, parameterName: String = null): Anon_ParameterName = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName)
    __obj.asInstanceOf[Anon_ParameterName]
  }
}

