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

