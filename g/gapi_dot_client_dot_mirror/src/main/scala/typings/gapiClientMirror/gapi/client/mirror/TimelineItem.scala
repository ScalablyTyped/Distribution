package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineItem extends js.Object {
  /**
    * A list of media attachments associated with this item. As a convenience, you can refer to attachments in your HTML payloads with the attachment or cid
    * scheme. For example:
    * - attachment: <img src="attachment:attachment_index"> where attachment_index is the 0-based index of this array.
    * - cid: <img src="cid:attachment_id"> where attachment_id is the ID of the attachment.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  /** The bundle ID for this item. Services can specify a bundleId to group many items together. They appear under a single top-level item on the device. */
  var bundleId: js.UndefOr[String] = js.native
  /** A canonical URL pointing to the canonical/high quality version of the data represented by the timeline item. */
  var canonicalUrl: js.UndefOr[String] = js.native
  /** The time at which this item was created, formatted according to RFC 3339. */
  var created: js.UndefOr[String] = js.native
  /** The user or group that created this item. */
  var creator: js.UndefOr[Contact] = js.native
  /**
    * The time that should be displayed when this item is viewed in the timeline, formatted according to RFC 3339. This user's timeline is sorted
    * chronologically on display time, so this will also determine where the item is displayed in the timeline. If not set by the service, the display time
    * defaults to the updated time.
    */
  var displayTime: js.UndefOr[String] = js.native
  /** ETag for this item. */
  var etag: js.UndefOr[String] = js.native
  /**
    * HTML content for this item. If both text and html are provided for an item, the html will be rendered in the timeline.
    * Allowed HTML elements - You can use these elements in your timeline cards.
    *
    * - Headers: h1, h2, h3, h4, h5, h6
    * - Images: img
    * - Lists: li, ol, ul
    * - HTML5 semantics: article, aside, details, figure, figcaption, footer, header, nav, section, summary, time
    * - Structural: blockquote, br, div, hr, p, span
    * - Style: b, big, center, em, i, u, s, small, strike, strong, style, sub, sup
    * - Tables: table, tbody, td, tfoot, th, thead, tr
    * Blocked HTML elements: These elements and their contents are removed from HTML payloads.
    *
    * - Document headers: head, title
    * - Embeds: audio, embed, object, source, video
    * - Frames: frame, frameset
    * - Scripting: applet, script
    * Other elements: Any elements that aren't listed are removed, but their contents are preserved.
    */
  var html: js.UndefOr[String] = js.native
  /** The ID of the timeline item. This is unique within a user's timeline. */
  var id: js.UndefOr[String] = js.native
  /**
    * If this item was generated as a reply to another item, this field will be set to the ID of the item being replied to. This can be used to attach a
    * reply to the appropriate conversation or post.
    */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
    * Whether this item is a bundle cover.
    *
    * If an item is marked as a bundle cover, it will be the entry point to the bundle of items that have the same bundleId as that item. It will be shown
    * only on the main timeline — not within the opened bundle.
    *
    * On the main timeline, items that are shown are:
    * - Items that have isBundleCover set to true
    * - Items that do not have a bundleId  In a bundle sub-timeline, items that are shown are:
    * - Items that have the bundleId in question AND isBundleCover set to false
    */
  var isBundleCover: js.UndefOr[Boolean] = js.native
  /** When true, indicates this item is deleted, and only the ID property is set. */
  var isDeleted: js.UndefOr[Boolean] = js.native
  /**
    * When true, indicates this item is pinned, which means it's grouped alongside "active" items like navigation and hangouts, on the opposite side of the
    * home screen from historical (non-pinned) timeline items. You can allow the user to toggle the value of this property with the TOGGLE_PINNED built-in
    * menu item.
    */
  var isPinned: js.UndefOr[Boolean] = js.native
  /** The type of resource. This is always mirror#timelineItem. */
  var kind: js.UndefOr[String] = js.native
  /** The geographic location associated with this item. */
  var location: js.UndefOr[Location] = js.native
  /** A list of menu items that will be presented to the user when this item is selected in the timeline. */
  var menuItems: js.UndefOr[js.Array[MenuItem]] = js.native
  /** Controls how notifications for this item are presented on the device. If this is missing, no notification will be generated. */
  var notification: js.UndefOr[NotificationConfig] = js.native
  /**
    * For pinned items, this determines the order in which the item is displayed in the timeline, with a higher score appearing closer to the clock. Note:
    * setting this field is currently not supported.
    */
  var pinScore: js.UndefOr[Double] = js.native
  /** A list of users or groups that this item has been shared with. */
  var recipients: js.UndefOr[js.Array[Contact]] = js.native
  /** A URL that can be used to retrieve this item. */
  var selfLink: js.UndefOr[String] = js.native
  /** Opaque string you can use to map a timeline item to data in your own service. */
  var sourceItemId: js.UndefOr[String] = js.native
  /**
    * The speakable version of the content of this item. Along with the READ_ALOUD menu item, use this field to provide text that would be clearer when read
    * aloud, or to provide extended information to what is displayed visually on Glass.
    *
    * Glassware should also specify the speakableType field, which will be spoken before this text in cases where the additional context is useful, for
    * example when the user requests that the item be read aloud following a notification.
    */
  var speakableText: js.UndefOr[String] = js.native
  /**
    * A speakable description of the type of this item. This will be announced to the user prior to reading the content of the item in cases where the
    * additional context is useful, for example when the user requests that the item be read aloud following a notification.
    *
    * This should be a short, simple noun phrase such as "Email", "Text message", or "Daily Planet News Update".
    *
    * Glassware are encouraged to populate this field for every timeline item, even if the item does not contain speakableText or text so that the user can
    * learn the type of the item without looking at the screen.
    */
  var speakableType: js.UndefOr[String] = js.native
  /** Text content of this item. */
  var text: js.UndefOr[String] = js.native
  /** The title of this item. */
  var title: js.UndefOr[String] = js.native
  /** The time at which this item was last modified, formatted according to RFC 3339. */
  var updated: js.UndefOr[String] = js.native
}

object TimelineItem {
  @scala.inline
  def apply(): TimelineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineItem]
  }
  @scala.inline
  implicit class TimelineItemOps[Self <: TimelineItem] (val x: Self) extends AnyVal {
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
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[Attachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCanonicalUrl(value: String): Self = this.set("canonicalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalUrl: Self = this.set("canonicalUrl", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCreator(value: Contact): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDisplayTime(value: String): Self = this.set("displayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayTime: Self = this.set("displayTime", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInReplyTo(value: String): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setIsBundleCover(value: Boolean): Self = this.set("isBundleCover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBundleCover: Self = this.set("isBundleCover", js.undefined)
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeleted: Self = this.set("isDeleted", js.undefined)
    @scala.inline
    def setIsPinned(value: Boolean): Self = this.set("isPinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPinned: Self = this.set("isPinned", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMenuItemsVarargs(value: MenuItem*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[MenuItem]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
    @scala.inline
    def setNotification(value: NotificationConfig): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setPinScore(value: Double): Self = this.set("pinScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinScore: Self = this.set("pinScore", js.undefined)
    @scala.inline
    def setRecipientsVarargs(value: Contact*): Self = this.set("recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: js.Array[Contact]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSourceItemId(value: String): Self = this.set("sourceItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceItemId: Self = this.set("sourceItemId", js.undefined)
    @scala.inline
    def setSpeakableText(value: String): Self = this.set("speakableText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakableText: Self = this.set("speakableText", js.undefined)
    @scala.inline
    def setSpeakableType(value: String): Self = this.set("speakableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeakableType: Self = this.set("speakableType", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

