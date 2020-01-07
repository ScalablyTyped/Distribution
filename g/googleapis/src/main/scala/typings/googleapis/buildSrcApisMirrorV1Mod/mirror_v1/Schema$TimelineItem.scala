package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each item in the user&#39;s timeline is represented as a TimelineItem JSON
  * structure, described below.
  */
@js.native
trait Schema$TimelineItem extends js.Object {
  /**
    * A list of media attachments associated with this item. As a convenience,
    * you can refer to attachments in your HTML payloads with the attachment or
    * cid scheme. For example:   - attachment: &lt;img
    * src=&quot;attachment:attachment_index&quot;&gt; where attachment_index is
    * the 0-based index of this array.  - cid: &lt;img
    * src=&quot;cid:attachment_id&quot;&gt; where attachment_id is the ID of
    * the attachment.
    */
  var attachments: js.UndefOr[js.Array[Schema$Attachment]] = js.native
  /**
    * The bundle ID for this item. Services can specify a bundleId to group
    * many items together. They appear under a single top-level item on the
    * device.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * A canonical URL pointing to the canonical/high quality version of the
    * data represented by the timeline item.
    */
  var canonicalUrl: js.UndefOr[String] = js.native
  /**
    * The time at which this item was created, formatted according to RFC 3339.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The user or group that created this item.
    */
  var creator: js.UndefOr[Schema$Contact] = js.native
  /**
    * The time that should be displayed when this item is viewed in the
    * timeline, formatted according to RFC 3339. This user&#39;s timeline is
    * sorted chronologically on display time, so this will also determine where
    * the item is displayed in the timeline. If not set by the service, the
    * display time defaults to the updated time.
    */
  var displayTime: js.UndefOr[String] = js.native
  /**
    * ETag for this item.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * HTML content for this item. If both text and html are provided for an
    * item, the html will be rendered in the timeline. Allowed HTML elements -
    * You can use these elements in your timeline cards.   - Headers: h1, h2,
    * h3, h4, h5, h6  - Images: img  - Lists: li, ol, ul  - HTML5 semantics:
    * article, aside, details, figure, figcaption, footer, header, nav,
    * section, summary, time  - Structural: blockquote, br, div, hr, p, span  -
    * Style: b, big, center, em, i, u, s, small, strike, strong, style, sub,
    * sup  - Tables: table, tbody, td, tfoot, th, thead, tr   Blocked HTML
    * elements: These elements and their contents are removed from HTML
    * payloads.   - Document headers: head, title  - Embeds: audio, embed,
    * object, source, video  - Frames: frame, frameset  - Scripting: applet,
    * script   Other elements: Any elements that aren&#39;t listed are removed,
    * but their contents are preserved.
    */
  var html: js.UndefOr[String] = js.native
  /**
    * The ID of the timeline item. This is unique within a user&#39;s timeline.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * If this item was generated as a reply to another item, this field will be
    * set to the ID of the item being replied to. This can be used to attach a
    * reply to the appropriate conversation or post.
    */
  var inReplyTo: js.UndefOr[String] = js.native
  /**
    * Whether this item is a bundle cover.  If an item is marked as a bundle
    * cover, it will be the entry point to the bundle of items that have the
    * same bundleId as that item. It will be shown only on the main timeline —
    * not within the opened bundle.  On the main timeline, items that are shown
    * are:   - Items that have isBundleCover set to true   - Items that do not
    * have a bundleId  In a bundle sub-timeline, items that are shown are:   -
    * Items that have the bundleId in question AND isBundleCover set to false
    */
  var isBundleCover: js.UndefOr[Boolean] = js.native
  /**
    * When true, indicates this item is deleted, and only the ID property is
    * set.
    */
  var isDeleted: js.UndefOr[Boolean] = js.native
  /**
    * When true, indicates this item is pinned, which means it&#39;s grouped
    * alongside &quot;active&quot; items like navigation and hangouts, on the
    * opposite side of the home screen from historical (non-pinned) timeline
    * items. You can allow the user to toggle the value of this property with
    * the TOGGLE_PINNED built-in menu item.
    */
  var isPinned: js.UndefOr[Boolean] = js.native
  /**
    * The type of resource. This is always mirror#timelineItem.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The geographic location associated with this item.
    */
  var location: js.UndefOr[Schema$Location] = js.native
  /**
    * A list of menu items that will be presented to the user when this item is
    * selected in the timeline.
    */
  var menuItems: js.UndefOr[js.Array[Schema$MenuItem]] = js.native
  /**
    * Controls how notifications for this item are presented on the device. If
    * this is missing, no notification will be generated.
    */
  var notification: js.UndefOr[Schema$NotificationConfig] = js.native
  /**
    * For pinned items, this determines the order in which the item is
    * displayed in the timeline, with a higher score appearing closer to the
    * clock. Note: setting this field is currently not supported.
    */
  var pinScore: js.UndefOr[Double] = js.native
  /**
    * A list of users or groups that this item has been shared with.
    */
  var recipients: js.UndefOr[js.Array[Schema$Contact]] = js.native
  /**
    * A URL that can be used to retrieve this item.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Opaque string you can use to map a timeline item to data in your own
    * service.
    */
  var sourceItemId: js.UndefOr[String] = js.native
  /**
    * The speakable version of the content of this item. Along with the
    * READ_ALOUD menu item, use this field to provide text that would be
    * clearer when read aloud, or to provide extended information to what is
    * displayed visually on Glass.  Glassware should also specify the
    * speakableType field, which will be spoken before this text in cases where
    * the additional context is useful, for example when the user requests that
    * the item be read aloud following a notification.
    */
  var speakableText: js.UndefOr[String] = js.native
  /**
    * A speakable description of the type of this item. This will be announced
    * to the user prior to reading the content of the item in cases where the
    * additional context is useful, for example when the user requests that the
    * item be read aloud following a notification.  This should be a short,
    * simple noun phrase such as &quot;Email&quot;, &quot;Text message&quot;,
    * or &quot;Daily Planet News Update&quot;.  Glassware are encouraged to
    * populate this field for every timeline item, even if the item does not
    * contain speakableText or text so that the user can learn the type of the
    * item without looking at the screen.
    */
  var speakableType: js.UndefOr[String] = js.native
  /**
    * Text content of this item.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * The title of this item.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The time at which this item was last modified, formatted according to RFC
    * 3339.
    */
  var updated: js.UndefOr[String] = js.native
}

object Schema$TimelineItem {
  @scala.inline
  def apply(
    attachments: js.Array[Schema$Attachment] = null,
    bundleId: String = null,
    canonicalUrl: String = null,
    created: String = null,
    creator: Schema$Contact = null,
    displayTime: String = null,
    etag: String = null,
    html: String = null,
    id: String = null,
    inReplyTo: String = null,
    isBundleCover: js.UndefOr[Boolean] = js.undefined,
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isPinned: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    location: Schema$Location = null,
    menuItems: js.Array[Schema$MenuItem] = null,
    notification: Schema$NotificationConfig = null,
    pinScore: Int | Double = null,
    recipients: js.Array[Schema$Contact] = null,
    selfLink: String = null,
    sourceItemId: String = null,
    speakableText: String = null,
    speakableType: String = null,
    text: String = null,
    title: String = null,
    updated: String = null
  ): Schema$TimelineItem = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundleCover)) __obj.updateDynamic("isBundleCover")(isBundleCover.asInstanceOf[js.Any])
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(isPinned)) __obj.updateDynamic("isPinned")(isPinned.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (pinScore != null) __obj.updateDynamic("pinScore")(pinScore.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (sourceItemId != null) __obj.updateDynamic("sourceItemId")(sourceItemId.asInstanceOf[js.Any])
    if (speakableText != null) __obj.updateDynamic("speakableText")(speakableText.asInstanceOf[js.Any])
    if (speakableType != null) __obj.updateDynamic("speakableType")(speakableType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimelineItem]
  }
}

