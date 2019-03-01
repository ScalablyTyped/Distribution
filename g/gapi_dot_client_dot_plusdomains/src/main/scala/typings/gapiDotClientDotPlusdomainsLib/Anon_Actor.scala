package typings
package gapiDotClientDotPlusdomainsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actor extends js.Object {
  /**
    * If this activity's object is itself another activity, such as when a person reshares an activity, this property specifies the original activity's
    * actor.
    */
  var actor: js.UndefOr[Anon_ClientSpecificActorInfoDisplayName] = js.undefined
  /** The media objects attached to this activity. */
  var attachments: js.UndefOr[js.Array[Anon_Content]] = js.undefined
  /** The HTML-formatted content, which is suitable for display. */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the object. When resharing an activity, this is the ID of the activity that is being reshared. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the object. Possible values include, but are not limited to, the following values:
    * - "note" - Textual content.
    * - "activity" - A Google+ activity.
    */
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The content (text) as provided by the author, which is stored without any HTML formatting. When creating or updating an activity, this value must be
    * supplied as plain text in the request.
    */
  var originalContent: js.UndefOr[java.lang.String] = js.undefined
  /** People who +1'd this activity. */
  var plusoners: js.UndefOr[Anon_SelfLink] = js.undefined
  /** Comments in reply to this activity. */
  var replies: js.UndefOr[Anon_SelfLink] = js.undefined
  /** People who reshared this activity. */
  var resharers: js.UndefOr[Anon_SelfLink] = js.undefined
  /** Status of the activity as seen by the viewer. */
  var statusForViewer: js.UndefOr[Anon_CanComment] = js.undefined
  /** The URL that points to the linked resource. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Actor {
  @scala.inline
  def apply(
    actor: Anon_ClientSpecificActorInfoDisplayName = null,
    attachments: js.Array[Anon_Content] = null,
    content: java.lang.String = null,
    id: java.lang.String = null,
    objectType: java.lang.String = null,
    originalContent: java.lang.String = null,
    plusoners: Anon_SelfLink = null,
    replies: Anon_SelfLink = null,
    resharers: Anon_SelfLink = null,
    statusForViewer: Anon_CanComment = null,
    url: java.lang.String = null
  ): Anon_Actor = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (content != null) __obj.updateDynamic("content")(content)
    if (id != null) __obj.updateDynamic("id")(id)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent)
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    if (resharers != null) __obj.updateDynamic("resharers")(resharers)
    if (statusForViewer != null) __obj.updateDynamic("statusForViewer")(statusForViewer)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Actor]
  }
}

