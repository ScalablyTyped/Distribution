package typings.gapiDotClientDotServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemParameterRule extends js.Object {
  /**
    * Define parameters. Multiple names may be defined for a parameter.
    * For a given method call, only one of them should be used. If multiple
    * names are used the behavior is implementation-dependent.
    * If none of the specified names are present the behavior is
    * parameter-dependent.
    */
  var parameters: js.UndefOr[js.Array[SystemParameter]] = js.undefined
  /**
    * Selects the methods to which this rule applies. Use '&#42;' to indicate all
    * methods in all APIs.
    *
    * Refer to selector for syntax details.
    */
  var selector: js.UndefOr[String] = js.undefined
}

object SystemParameterRule {
  @scala.inline
  def apply(parameters: js.Array[SystemParameter] = null, selector: String = null): SystemParameterRule = {
    val __obj = js.Dynamic.literal()
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemParameterRule]
  }
}

