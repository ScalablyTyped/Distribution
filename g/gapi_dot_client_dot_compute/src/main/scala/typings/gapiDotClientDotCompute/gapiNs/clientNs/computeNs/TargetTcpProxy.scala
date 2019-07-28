package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTcpProxy extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** URL to the BackendService resource. */
  var service: js.UndefOr[String] = js.undefined
}

object TargetTcpProxy {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    proxyHeader: String = null,
    selfLink: String = null,
    service: String = null
  ): TargetTcpProxy = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (proxyHeader != null) __obj.updateDynamic("proxyHeader")(proxyHeader)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[TargetTcpProxy]
  }
}

