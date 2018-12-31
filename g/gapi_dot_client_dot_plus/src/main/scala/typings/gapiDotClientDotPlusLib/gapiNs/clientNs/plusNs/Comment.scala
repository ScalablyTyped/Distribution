package typings
package gapiDotClientDotPlusLib.gapiNs.clientNs.plusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[gapiDotClientDotPlusLib.Anon_DisplayNameUrl] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this comment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[gapiDotClientDotPlusLib.Anon_UrlId]] = js.undefined
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The object of this comment. */
  var `object`: js.UndefOr[gapiDotClientDotPlusLib.Anon_ObjectType] = js.undefined
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[gapiDotClientDotPlusLib.Anon_TotalItems] = js.undefined
  /** The time at which this comment was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[java.lang.String] = js.undefined
  /** Link to this comment resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which this comment was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This comment's verb, indicating what action was performed. Possible values are:
    * - "post" - Publish content to the stream.
    */
  var verb: js.UndefOr[java.lang.String] = js.undefined
}

