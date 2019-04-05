package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
  var canonicalUrl: js.UndefOr[java.lang.String] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var creator: js.UndefOr[Contact] = js.undefined
  var displayTime: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inReplyTo: js.UndefOr[java.lang.String] = js.undefined
  var isBundleCover: js.UndefOr[scala.Boolean] = js.undefined
  var isDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var isPinned: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var menuItems: js.UndefOr[js.Array[MenuItem]] = js.undefined
  var notification: js.UndefOr[NotificationConfig] = js.undefined
  var pinScore: js.UndefOr[scala.Double] = js.undefined
  var recipients: js.UndefOr[js.Array[Contact]] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var sourceItemId: js.UndefOr[java.lang.String] = js.undefined
  var speakableText: js.UndefOr[java.lang.String] = js.undefined
  var speakableType: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object TimelineItem {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    bundleId: java.lang.String = null,
    canonicalUrl: java.lang.String = null,
    created: java.lang.String = null,
    creator: Contact = null,
    displayTime: java.lang.String = null,
    etag: java.lang.String = null,
    html: java.lang.String = null,
    id: java.lang.String = null,
    inReplyTo: java.lang.String = null,
    isBundleCover: js.UndefOr[scala.Boolean] = js.undefined,
    isDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    isPinned: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    location: Location = null,
    menuItems: js.Array[MenuItem] = null,
    notification: NotificationConfig = null,
    pinScore: scala.Int | scala.Double = null,
    recipients: js.Array[Contact] = null,
    selfLink: java.lang.String = null,
    sourceItemId: java.lang.String = null,
    speakableText: java.lang.String = null,
    speakableType: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null
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

