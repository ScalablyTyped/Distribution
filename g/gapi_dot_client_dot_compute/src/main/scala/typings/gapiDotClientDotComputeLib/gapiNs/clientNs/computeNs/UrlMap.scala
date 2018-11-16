package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlMap extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the BackendService resource if none of the hostRules match. */
  var defaultService: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when
               * inserting a UrlMap. An up-to-date fingerprint must be provided in order to update the UrlMap.
               */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** The list of HostRules to use against the URL. */
  var hostRules: js.UndefOr[js.Array[HostRule]] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#urlMaps for url maps. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
               * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
               * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The list of named PathMatchers to use against the URL. */
  var pathMatchers: js.UndefOr[js.Array[PathMatcher]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The list of expected URL mappings. Request to update this UrlMap will succeed only if all of the test cases pass. */
  var tests: js.UndefOr[js.Array[UrlMapTest]] = js.undefined
}

