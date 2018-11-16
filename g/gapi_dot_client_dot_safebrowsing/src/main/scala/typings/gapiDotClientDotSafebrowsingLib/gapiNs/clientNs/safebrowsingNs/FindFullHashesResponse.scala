package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FindFullHashesResponse extends js.Object {
  /** The full hashes that matched the requested prefixes. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.undefined
  /**
               * The minimum duration the client must wait before issuing any find hashes
               * request. If this field is not set, clients can issue a request as soon as
               * they want.
               */
  var minimumWaitDuration: js.UndefOr[java.lang.String] = js.undefined
  /**
               * For requested entities that did not match the threat list, how long to
               * cache the response.
               */
  var negativeCacheDuration: js.UndefOr[java.lang.String] = js.undefined
}

