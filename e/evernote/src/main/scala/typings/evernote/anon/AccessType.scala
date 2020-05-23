package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.RelatedContentAccess
import typings.evernote.mod.Types.RelatedContentImage
import typings.evernote.mod.Types.RelatedContentType
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessType extends js.Object {
  var accessType: js.UndefOr[RelatedContentAccess] = js.undefined
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  var clipUrl: js.UndefOr[String] = js.undefined
  var contact: js.UndefOr[Contact] = js.undefined
  var contentId: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[RelatedContentType] = js.undefined
  var date: js.UndefOr[Timestamp] = js.undefined
  var sourceFaviconUrl: js.UndefOr[String] = js.undefined
  var sourceId: js.UndefOr[String] = js.undefined
  var sourceName: js.UndefOr[String] = js.undefined
  var sourceUrl: js.UndefOr[String] = js.undefined
  var teaser: js.UndefOr[String] = js.undefined
  var thumbnails: js.UndefOr[js.Array[RelatedContentImage]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var visibleUrl: js.UndefOr[String] = js.undefined
}

object AccessType {
  @scala.inline
  def apply(
    accessType: RelatedContentAccess = null,
    authors: js.Array[String] = null,
    clipUrl: String = null,
    contact: Contact = null,
    contentId: String = null,
    contentType: RelatedContentType = null,
    date: js.UndefOr[Timestamp] = js.undefined,
    sourceFaviconUrl: String = null,
    sourceId: String = null,
    sourceName: String = null,
    sourceUrl: String = null,
    teaser: String = null,
    thumbnails: js.Array[RelatedContentImage] = null,
    title: String = null,
    url: String = null,
    visibleUrl: String = null
  ): AccessType = {
    val __obj = js.Dynamic.literal()
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (authors != null) __obj.updateDynamic("authors")(authors.asInstanceOf[js.Any])
    if (clipUrl != null) __obj.updateDynamic("clipUrl")(clipUrl.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.get.asInstanceOf[js.Any])
    if (sourceFaviconUrl != null) __obj.updateDynamic("sourceFaviconUrl")(sourceFaviconUrl.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl.asInstanceOf[js.Any])
    if (teaser != null) __obj.updateDynamic("teaser")(teaser.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (visibleUrl != null) __obj.updateDynamic("visibleUrl")(visibleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessType]
  }
}

