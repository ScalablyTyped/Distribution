package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManagedZone extends js.Object {
  /** The time that this resource was created on the server. This is in RFC3339 text format. Output only. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The DNS name of this managed zone, for instance "example.com.". */
  var dnsName: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier for the resource; defined by the server (output only) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dns#managedZone". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a
               * letter or digit, and only contain lowercase letters, digits or dashes.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most
               * users will leave this field unset.
               */
  var nameServerSet: js.UndefOr[java.lang.String] = js.undefined
  /** Delegate your managed_zone to these virtual name servers; defined by the server (output only) */
  var nameServers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

