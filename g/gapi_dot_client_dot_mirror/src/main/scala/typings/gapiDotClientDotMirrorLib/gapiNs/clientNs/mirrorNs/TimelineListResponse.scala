package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineListResponse extends js.Object {
  /** Items in the timeline. */
  var items: js.UndefOr[js.Array[TimelineItem]] = js.undefined
  /** The type of resource. This is always mirror#timeline. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The next page token. Provide this as the pageToken parameter in the request to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

