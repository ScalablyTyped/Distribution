package typings.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ### System parameter configuration  A system parameter is a special kind of
  * parameter defined by the API system, not by an individual API. It is
  * typically mapped to an HTTP header and/or a URL query parameter. This
  * configuration specifies which methods change the names of the system
  * parameters.
  */
@js.native
trait Schema$SystemParameters extends js.Object {
  /**
    * Define system parameters.  The parameters defined here will override the
    * default parameters implemented by the system. If this field is missing
    * from the service config, default system parameters will be used. Default
    * system parameters and names is implementation-dependent.  Example: define
    * api key for all methods      system_parameters       rules:         -
    * selector: &quot;*&quot;           parameters:             - name: api_key
    * url_query_parameter: api_key   Example: define 2 api key names for a
    * specific method.      system_parameters       rules:         - selector:
    * &quot;/ListShelves&quot;           parameters:             - name:
    * api_key               http_header: Api-Key1             - name: api_key
    * http_header: Api-Key2  **NOTE:** All service configuration rules follow
    * &quot;last one wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[Schema$SystemParameterRule]] = js.native
}

object Schema$SystemParameters {
  @scala.inline
  def apply(rules: js.Array[Schema$SystemParameterRule] = null): Schema$SystemParameters = {
    val __obj = js.Dynamic.literal()
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SystemParameters]
  }
}

