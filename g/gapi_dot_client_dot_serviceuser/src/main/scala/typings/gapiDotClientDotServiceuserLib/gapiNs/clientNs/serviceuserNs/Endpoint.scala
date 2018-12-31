package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  /**
    * DEPRECATED: This field is no longer supported. Instead of using aliases,
    * please specify multiple google.api.Endpoint for each of the intented
    * alias.
    *
    * Additional names that this endpoint will be hosted on.
    */
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Allowing
    * [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
    * cross-domain traffic, would allow the backends served from this endpoint to
    * receive and respond to HTTP OPTIONS requests. The response will be used by
    * the browser to determine whether the subsequent cross-origin request is
    * allowed to proceed.
    */
  var allowCors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The list of APIs served by this endpoint.
    *
    * If no APIs are specified this translates to "all APIs" exported by the
    * service, as defined in the top-level service configuration.
    */
  var apis: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of features enabled on this endpoint. */
  var features: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The canonical name of this endpoint. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The specification of an Internet routable address of API frontend that will
    * handle requests to this [API Endpoint](https://cloud.google.com/apis/design/glossary).
    * It should be either a valid IPv4 address or a fully-qualified domain name.
    * For example, "8.8.8.8" or "myservice.appspot.com".
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

