package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments extends js.Object {
  var actor: js.UndefOr[Verification] = js.native
  var attachments: js.UndefOr[js.Array[Embed]] = js.native
  var content: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var objectType: js.UndefOr[String] = js.native
  var originalContent: js.UndefOr[String] = js.native
  var plusoners: js.UndefOr[SelfLink] = js.native
  var replies: js.UndefOr[SelfLink] = js.native
  var resharers: js.UndefOr[SelfLink] = js.native
  var statusForViewer: js.UndefOr[CanComment] = js.native
  var url: js.UndefOr[String] = js.native
}

object Attachments {
  @scala.inline
  def apply(
    actor: Verification = null,
    attachments: js.Array[Embed] = null,
    content: String = null,
    id: String = null,
    objectType: String = null,
    originalContent: String = null,
    plusoners: SelfLink = null,
    replies: SelfLink = null,
    resharers: SelfLink = null,
    statusForViewer: CanComment = null,
    url: String = null
  ): Attachments = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    if (plusoners != null) __obj.updateDynamic("plusoners")(plusoners.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (resharers != null) __obj.updateDynamic("resharers")(resharers.asInstanceOf[js.Any])
    if (statusForViewer != null) __obj.updateDynamic("statusForViewer")(statusForViewer.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
}

