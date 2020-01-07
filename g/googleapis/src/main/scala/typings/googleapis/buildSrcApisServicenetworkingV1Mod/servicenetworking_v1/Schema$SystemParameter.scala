package typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define a parameter&#39;s name and location. The parameter may be passed as
  * either an HTTP header or a URL query parameter, and if both are passed the
  * behavior is implementation-dependent.
  */
@js.native
trait Schema$SystemParameter extends js.Object {
  /**
    * Define the HTTP header name to use for the parameter. It is case
    * insensitive.
    */
  var httpHeader: js.UndefOr[String] = js.native
  /**
    * Define the name of the parameter, such as &quot;api_key&quot; . It is
    * case sensitive.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Define the URL query parameter name to use for the parameter. It is case
    * sensitive.
    */
  var urlQueryParameter: js.UndefOr[String] = js.native
}

object Schema$SystemParameter {
  @scala.inline
  def apply(httpHeader: String = null, name: String = null, urlQueryParameter: String = null): Schema$SystemParameter = {
    val __obj = js.Dynamic.literal()
    if (httpHeader != null) __obj.updateDynamic("httpHeader")(httpHeader.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (urlQueryParameter != null) __obj.updateDynamic("urlQueryParameter")(urlQueryParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SystemParameter]
  }
}

