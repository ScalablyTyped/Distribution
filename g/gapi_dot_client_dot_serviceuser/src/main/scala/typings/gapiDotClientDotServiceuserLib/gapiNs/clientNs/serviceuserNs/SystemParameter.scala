package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemParameter extends js.Object {
  /**
    * Define the HTTP header name to use for the parameter. It is case
    * insensitive.
    */
  var httpHeader: js.UndefOr[java.lang.String] = js.undefined
  /** Define the name of the parameter, such as "api_key" . It is case sensitive. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the URL query parameter name to use for the parameter. It is case
    * sensitive.
    */
  var urlQueryParameter: js.UndefOr[java.lang.String] = js.undefined
}

object SystemParameter {
  @scala.inline
  def apply(
    httpHeader: java.lang.String = null,
    name: java.lang.String = null,
    urlQueryParameter: java.lang.String = null
  ): SystemParameter = {
    val __obj = js.Dynamic.literal()
    if (httpHeader != null) __obj.updateDynamic("httpHeader")(httpHeader)
    if (name != null) __obj.updateDynamic("name")(name)
    if (urlQueryParameter != null) __obj.updateDynamic("urlQueryParameter")(urlQueryParameter)
    __obj.asInstanceOf[SystemParameter]
  }
}

