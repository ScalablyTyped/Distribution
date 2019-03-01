package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_ClientSpecificActorInfoDisplayName] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this comment. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[gapiDotClientDotPlusdomainsLib.Anon_Id]] = js.undefined
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The object of this comment. */
  var `object`: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_ContentObjectType] = js.undefined
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[gapiDotClientDotPlusdomainsLib.Anon_TotalItems] = js.undefined
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

object Comment {
  @scala.inline
  def apply(
    actor: gapiDotClientDotPlusdomainsLib.Anon_ClientSpecificActorInfoDisplayName = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    inReplyTo: js.Array[gapiDotClientDotPlusdomainsLib.Anon_Id] = null,
    kind: java.lang.String = null,
    `object`: gapiDotClientDotPlusdomainsLib.Anon_ContentObjectType = null,
    plusoners: gapiDotClientDotPlusdomainsLib.Anon_TotalItems = null,
    published: java.lang.String = null,
    selfLink: java.lang.String = null,
    updated: java.lang.String = null,
    verb: java.lang.String = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners)
    if (published != null) __obj.updateDynamic("published")(published)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (verb != null) __obj.updateDynamic("verb")(verb)
    __obj.asInstanceOf[Comment]
  }
}

