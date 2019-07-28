package typings.gapiDotClientDotCustomsearch.gapiNs.clientNs.customsearchNs

import typings.gapiDotClientDotCustomsearch.Anon_ByteSize
import typings.gapiDotClientDotCustomsearch.Anon_DisplayName
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
  var image: js.UndefOr[Anon_ByteSize] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var labels: js.UndefOr[js.Array[Anon_DisplayName]] = js.undefined
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
    image: Anon_ByteSize = null,
    kind: String = null,
    labels: js.Array[Anon_DisplayName] = null,
    link: String = null,
    mime: String = null,
    pagemap: Record[String, js.Array[Record[String, _]]] = null,
    snippet: String = null,
    title: String = null
  ): Result = {
    val __obj = js.Dynamic.literal()
    if (cacheId != null) __obj.updateDynamic("cacheId")(cacheId)
    if (displayLink != null) __obj.updateDynamic("displayLink")(displayLink)
    if (fileFormat != null) __obj.updateDynamic("fileFormat")(fileFormat)
    if (formattedUrl != null) __obj.updateDynamic("formattedUrl")(formattedUrl)
    if (htmlFormattedUrl != null) __obj.updateDynamic("htmlFormattedUrl")(htmlFormattedUrl)
    if (htmlSnippet != null) __obj.updateDynamic("htmlSnippet")(htmlSnippet)
    if (htmlTitle != null) __obj.updateDynamic("htmlTitle")(htmlTitle)
    if (image != null) __obj.updateDynamic("image")(image)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (link != null) __obj.updateDynamic("link")(link)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (pagemap != null) __obj.updateDynamic("pagemap")(pagemap)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Result]
  }
}

