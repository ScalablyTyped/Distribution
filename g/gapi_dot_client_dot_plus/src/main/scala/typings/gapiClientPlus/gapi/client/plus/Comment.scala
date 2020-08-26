package typings.gapiClientPlus.gapi.client.plus

import typings.gapiClientPlus.anon.DisplayName
import typings.gapiClientPlus.anon.Id
import typings.gapiClientPlus.anon.ObjectType
import typings.gapiClientPlus.anon.TotalItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /** The person who posted this comment. */
  var actor: js.UndefOr[DisplayName] = js.native
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The ID of this comment. */
  var id: js.UndefOr[String] = js.native
  /** The activity this comment replied to. */
  var inReplyTo: js.UndefOr[js.Array[Id]] = js.native
  /** Identifies this resource as a comment. Value: "plus#comment". */
  var kind: js.UndefOr[String] = js.native
  /** The object of this comment. */
  var `object`: js.UndefOr[ObjectType] = js.native
  /** People who +1'd this comment. */
  var plusoners: js.UndefOr[TotalItems] = js.native
  /** The time at which this comment was initially published. Formatted as an RFC 3339 timestamp. */
  var published: js.UndefOr[String] = js.native
  /** Link to this comment resource. */
  var selfLink: js.UndefOr[String] = js.native
  /** The time at which this comment was last updated. Formatted as an RFC 3339 timestamp. */
  var updated: js.UndefOr[String] = js.native
  /**
    * This comment's verb, indicating what action was performed. Possible values are:
    * - "post" - Publish content to the stream.
    */
  var verb: js.UndefOr[String] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActor(value: DisplayName): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInReplyToVarargs(value: Id*): Self = this.set("inReplyTo", js.Array(value :_*))
    @scala.inline
    def setInReplyTo(value: js.Array[Id]): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setObject(value: ObjectType): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setPlusoners(value: TotalItems): Self = this.set("plusoners", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlusoners: Self = this.set("plusoners", js.undefined)
    @scala.inline
    def setPublished(value: String): Self = this.set("published", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished: Self = this.set("published", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
  
}

