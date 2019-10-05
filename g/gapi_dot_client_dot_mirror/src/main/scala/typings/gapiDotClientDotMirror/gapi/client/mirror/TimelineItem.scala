package typings.gapiDotClientDotMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  /**
    * A list of media attachments associated with this item. As a convenience, you can refer to attachments in your HTML payloads with the attachment or cid
    * scheme. For example:
    * - attachment: <img src="attachment:attachment_index"> where attachment_index is the 0-based index of this array.
    * - cid: <img src="cid:attachment_id"> where attachment_id is the ID of the attachment.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** The bundle ID for this item. Services can specify a bundleId to group many items together. They appear under a single top-level item on the device. */
  var bundleId: js.UndefOr[String] = js.undefined
  /** A canonical URL pointing to the canonical/high quality version of the data represented by the timeline item. */
  var canonicalUrl: js.UndefOr[String] = js.undefined
  /** The time at which this item was created, formatted according to RFC 3339. */
  var created: js.UndefOr[String] = js.undefined
  /** The user or group that created this item. */
  var creator: js.UndefOr[Contact] = js.undefined
  /**
    * The time that should be displayed when this item is viewed in the timeline, formatted according to RFC 3339. This user's timeline is sorted
    * chronologically on display time, so this will also determine where the item is displayed in the timeline. If not set by the service, the display time
    * defaults to the updated time.
    */
  var displayTime: js.UndefOr[String] = js.undefined
  /** ETag for this item. */
  var etag: js.UndefOr[String] = js.undefined
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
  var html: js.UndefOr[String] = js.undefined
  /** The ID of the timeline item. This is unique within a user's timeline. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * If this item was generated as a reply to another item, this field will be set to the ID of the item being replied to. This can be used to attach a
    * reply to the appropriate conversation or post.
    */
  var inReplyTo: js.UndefOr[String] = js.undefined
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
  var isBundleCover: js.UndefOr[Boolean] = js.undefined
  /** When true, indicates this item is deleted, and only the ID property is set. */
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, indicates this item is pinned, which means it's grouped alongside "active" items like navigation and hangouts, on the opposite side of the
    * home screen from historical (non-pinned) timeline items. You can allow the user to toggle the value of this property with the TOGGLE_PINNED built-in
    * menu item.
    */
  var isPinned: js.UndefOr[Boolean] = js.undefined
  /** The type of resource. This is always mirror#timelineItem. */
  var kind: js.UndefOr[String] = js.undefined
  /** The geographic location associated with this item. */
  var location: js.UndefOr[Location] = js.undefined
  /** A list of menu items that will be presented to the user when this item is selected in the timeline. */
  var menuItems: js.UndefOr[js.Array[MenuItem]] = js.undefined
  /** Controls how notifications for this item are presented on the device. If this is missing, no notification will be generated. */
  var notification: js.UndefOr[NotificationConfig] = js.undefined
  /**
    * For pinned items, this determines the order in which the item is displayed in the timeline, with a higher score appearing closer to the clock. Note:
    * setting this field is currently not supported.
    */
  var pinScore: js.UndefOr[Double] = js.undefined
  /** A list of users or groups that this item has been shared with. */
  var recipients: js.UndefOr[js.Array[Contact]] = js.undefined
  /** A URL that can be used to retrieve this item. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Opaque string you can use to map a timeline item to data in your own service. */
  var sourceItemId: js.UndefOr[String] = js.undefined
  /**
    * The speakable version of the content of this item. Along with the READ_ALOUD menu item, use this field to provide text that would be clearer when read
    * aloud, or to provide extended information to what is displayed visually on Glass.
    *
    * Glassware should also specify the speakableType field, which will be spoken before this text in cases where the additional context is useful, for
    * example when the user requests that the item be read aloud following a notification.
    */
  var speakableText: js.UndefOr[String] = js.undefined
  /**
    * A speakable description of the type of this item. This will be announced to the user prior to reading the content of the item in cases where the
    * additional context is useful, for example when the user requests that the item be read aloud following a notification.
    *
    * This should be a short, simple noun phrase such as "Email", "Text message", or "Daily Planet News Update".
    *
    * Glassware are encouraged to populate this field for every timeline item, even if the item does not contain speakableText or text so that the user can
    * learn the type of the item without looking at the screen.
    */
  var speakableType: js.UndefOr[String] = js.undefined
  /** Text content of this item. */
  var text: js.UndefOr[String] = js.undefined
  /** The title of this item. */
  var title: js.UndefOr[String] = js.undefined
  /** The time at which this item was last modified, formatted according to RFC 3339. */
  var updated: js.UndefOr[String] = js.undefined
}

object TimelineItem {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    bundleId: String = null,
    canonicalUrl: String = null,
    created: String = null,
    creator: Contact = null,
    displayTime: String = null,
    etag: String = null,
    html: String = null,
    id: String = null,
    inReplyTo: String = null,
    isBundleCover: js.UndefOr[Boolean] = js.undefined,
    isDeleted: js.UndefOr[Boolean] = js.undefined,
    isPinned: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    location: Location = null,
    menuItems: js.Array[MenuItem] = null,
    notification: NotificationConfig = null,
    pinScore: Int | Double = null,
    recipients: js.Array[Contact] = null,
    selfLink: String = null,
    sourceItemId: String = null,
    speakableText: String = null,
    speakableType: String = null,
    text: String = null,
    title: String = null,
    updated: String = null
  ): TimelineItem = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (canonicalUrl != null) __obj.updateDynamic("canonicalUrl")(canonicalUrl)
    if (created != null) __obj.updateDynamic("created")(created)
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (displayTime != null) __obj.updateDynamic("displayTime")(displayTime)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (!js.isUndefined(isBundleCover)) __obj.updateDynamic("isBundleCover")(isBundleCover)
    if (!js.isUndefined(isDeleted)) __obj.updateDynamic("isDeleted")(isDeleted)
    if (!js.isUndefined(isPinned)) __obj.updateDynamic("isPinned")(isPinned)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (pinScore != null) __obj.updateDynamic("pinScore")(pinScore.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (sourceItemId != null) __obj.updateDynamic("sourceItemId")(sourceItemId)
    if (speakableText != null) __obj.updateDynamic("speakableText")(speakableText)
    if (speakableType != null) __obj.updateDynamic("speakableType")(speakableType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[TimelineItem]
  }
}

