package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemParameters extends js.Object {
  /**
    * Define system parameters.
    *
    * The parameters defined here will override the default parameters
    * implemented by the system. If this field is missing from the service
    * config, default system parameters will be used. Default system parameters
    * and names is implementation-dependent.
    *
    * Example: define api key for all methods
    *
    * system_parameters
    * rules:
    * - selector: "&#42;"
    * parameters:
    * - name: api_key
    * url_query_parameter: api_key
    *
    *
    * Example: define 2 api key names for a specific method.
    *
    * system_parameters
    * rules:
    * - selector: "/ListShelves"
    * parameters:
    * - name: api_key
    * http_header: Api-Key1
    * - name: api_key
    * http_header: Api-Key2
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SystemParameterRule]] = js.undefined
}

object SystemParameters {
  @scala.inline
  def apply(rules: js.Array[SystemParameterRule] = null): SystemParameters = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemParameters]
  }
}

