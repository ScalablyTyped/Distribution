package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTemplate extends js.Object {
  /** [Output Only] The creation timestamp for this instance template in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] A unique identifier for this instance template. The server defines this identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The resource type, which is always compute#instanceTemplate for instance templates. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The instance properties for this instance template. */
  var properties: js.UndefOr[InstanceProperties] = js.undefined
  /** [Output Only] The URL for this instance template. The server defines this URL. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
}

object InstanceTemplate {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    properties: InstanceProperties = null,
    selfLink: java.lang.String = null
  ): InstanceTemplate = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[InstanceTemplate]
  }
}

