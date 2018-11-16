package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetInstance extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A URL to the virtual machine instance that handles traffic for this target instance. When creating a target instance, you can provide the
               * fully-qualified URL or a valid partial URL to the desired virtual machine. For example, the following are all valid URLs:
               * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
               * - projects/project/zones/zone/instances/instance
               * - zones/zone/instances/instance
               */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The type of the resource. Always compute#targetInstance for target instances. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported. */
  var natPolicy: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URL of the zone where the target instance resides. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

