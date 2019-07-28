package typings.gapiDotClientDotPlusdomains.gapiNs.clientNs.plusdomainsNs

import typings.gapiDotClientDotPlusdomains.Anon_ClientSpecificActorInfoDisplayName
import typings.gapiDotClientDotPlusdomains.Anon_ContentObjectType
import typings.gapiDotClientDotPlusdomains.Anon_Id
import typings.gapiDotClientDotPlusdomains.Anon_TotalItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[Anon_ClientSpecificActorInfoDisplayName] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID of this comment. */
  var id: js.UndefOr[String] = js.undefined
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[String] = js.undefined
  /** The object of this comment. */
  var `object`: js.UndefOr[Anon_ContentObjectType] = js.undefined
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[Anon_TotalItems] = js.undefined
  /** The time at which this comment was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.undefined
  /** Link to this comment resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The time at which this comment was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.undefined
  /**
    * This comment's verb, indicating what action was performed. Possible values are:
    * - "post" - Publish content to the stream.
    */
  var verb: js.UndefOr[String] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    actor: Anon_ClientSpecificActorInfoDisplayName = null,
    etag: String = null,
    id: String = null,
    inReplyTo: js.Array[Anon_Id] = null,
    kind: String = null,
    `object`: Anon_ContentObjectType = null,
    plusoners: Anon_TotalItems = null,
    published: String = null,
    selfLink: String = null,
    updated: String = null,
    verb: String = null
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

