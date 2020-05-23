package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClientCustomsearch.anon.ByteSize
import typings.gapiClientCustomsearch.anon.DisplayName
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var cacheId: js.UndefOr[String] = js.undefined
  var displayLink: js.UndefOr[String] = js.undefined
  var fileFormat: js.UndefOr[String] = js.undefined
  var formattedUrl: js.UndefOr[String] = js.undefined
  var htmlFormattedUrl: js.UndefOr[String] = js.undefined
  var htmlSnippet: js.UndefOr[String] = js.undefined
  var htmlTitle: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[ByteSize] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Array[DisplayName]] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var pagemap: js.UndefOr[Record[String, js.Array[Record[String, _]]]] = js.undefined
  var snippet: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    cacheId: String = null,
    displayLink: String = null,
    fileFormat: String = null,
    formattedUrl: String = null,
    htmlFormattedUrl: String = null,
    htmlSnippet: String = null,
    htmlTitle: String = null,
    image: ByteSize = null,
    kind: String = null,
    labels: js.Array[DisplayName] = null,
    link: String = null,
    mime: String = null,
    pagemap: Record[String, js.Array[Record[String, _]]] = null,
    snippet: String = null,
    title: String = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId.asInstanceOf[js.Any])
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink.asInstanceOf[js.Any])
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat.asInstanceOf[js.Any])
    if (formattedUrl != null) __obj.updateDynamic("formattedUrl")(formattedUrl.asInstanceOf[js.Any])
    if (htmlFormattedUrl != null) __obj.updateDynamic("htmlFormattedUrl")(htmlFormattedUrl.asInstanceOf[js.Any])
    if (htmlSnippet != null) __obj.updateDynamic("htmlSnippet")(htmlSnippet.asInstanceOf[js.Any])
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (pagemap != null) __obj.updateDynamic("pagemap")(pagemap.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

