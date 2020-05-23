package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClientPlus.anon.DisplayName
import typings.gapiClientPlus.anon.Id
import typings.gapiClientPlus.anon.ObjectType
import typings.gapiClientPlus.anon.TotalItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[DisplayName] = js.undefined
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID of this comment. */
  var id: js.UndefOr[String] = js.undefined
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[Id]] = js.undefined
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[String] = js.undefined
  /** The object of this comment. */
  var `object`: js.UndefOr[ObjectType] = js.undefined
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[TotalItems] = js.undefined
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
    actor: DisplayName = null,
    etag: String = null,
    id: String = null,
    inReplyTo: js.Array[Id] = null,
    kind: String = null,
    `object`: ObjectType = null,
    plusoners: TotalItems = null,
    published: String = null,
    selfLink: String = null,
    updated: String = null,
    verb: String = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (verb != null) __obj.updateDynamic("verb")(verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

