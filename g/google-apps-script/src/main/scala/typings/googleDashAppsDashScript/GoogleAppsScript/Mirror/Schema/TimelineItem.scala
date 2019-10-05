package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  var bundleId: js.UndefOr[String] = js.undefined
  var canonicalUrl: js.UndefOr[String] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var creator: js.UndefOr[Contact] = js.undefined
  var displayTime: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inReplyTo: js.UndefOr[String] = js.undefined
  var isBundleCover: js.UndefOr[Boolean] = js.undefined
  var isDeleted: js.UndefOr[Boolean] = js.undefined
  var isPinned: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var menuItems: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var notification: js.UndefOr[NotificationConfig] = js.undefined
  var pinScore: js.UndefOr[Double] = js.undefined
  var recipients: js.UndefOr[js.Array[Contact]] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var sourceItemId: js.UndefOr[String] = js.undefined
  var speakableText: js.UndefOr[String] = js.undefined
  var speakableType: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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

