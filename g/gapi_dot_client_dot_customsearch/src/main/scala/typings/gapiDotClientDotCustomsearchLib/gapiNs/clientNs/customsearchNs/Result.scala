package typings
package gapiDotClientDotCustomsearchLib.gapiNs.clientNs.customsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var cacheId: js.UndefOr[java.lang.String] = js.undefined
  var displayLink: js.UndefOr[java.lang.String] = js.undefined
  var fileFormat: js.UndefOr[java.lang.String] = js.undefined
  var formattedUrl: js.UndefOr[java.lang.String] = js.undefined
  var htmlFormattedUrl: js.UndefOr[java.lang.String] = js.undefined
  var htmlSnippet: js.UndefOr[java.lang.String] = js.undefined
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[gapiDotClientDotCustomsearchLib.Anon_ByteSize] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Array[gapiDotClientDotCustomsearchLib.Anon_DisplayName]] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var pagemap: js.UndefOr[stdLib.Record[java.lang.String, js.Array[stdLib.Record[java.lang.String, _]]]] = js.undefined
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    cacheId: java.lang.String = null,
    displayLink: java.lang.String = null,
    fileFormat: java.lang.String = null,
    formattedUrl: java.lang.String = null,
    htmlFormattedUrl: java.lang.String = null,
    htmlSnippet: java.lang.String = null,
    htmlTitle: java.lang.String = null,
    image: gapiDotClientDotCustomsearchLib.Anon_ByteSize = null,
    kind: java.lang.String = null,
    labels: js.Array[gapiDotClientDotCustomsearchLib.Anon_DisplayName] = null,
    link: java.lang.String = null,
    mime: java.lang.String = null,
    pagemap: stdLib.Record[java.lang.String, js.Array[stdLib.Record[java.lang.String, _]]] = null,
    snippet: java.lang.String = null,
    title: java.lang.String = null
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

