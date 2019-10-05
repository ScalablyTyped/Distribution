package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var body: js.UndefOr[Body] = js.undefined
  var documentId: js.UndefOr[String] = js.undefined
  var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
  var footers: js.UndefOr[js.Object] = js.undefined
  var footnotes: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var inlineObjects: js.UndefOr[js.Object] = js.undefined
  var lists: js.UndefOr[js.Object] = js.undefined
  var namedRanges: js.UndefOr[js.Object] = js.undefined
  var namedStyles: js.UndefOr[NamedStyles] = js.undefined
  var positionedObjects: js.UndefOr[js.Object] = js.undefined
  var revisionId: js.UndefOr[String] = js.undefined
  var suggestedDocumentStyleChanges: js.UndefOr[js.Object] = js.undefined
  var suggestedNamedStylesChanges: js.UndefOr[js.Object] = js.undefined
  var suggestionsViewMode: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Document {
  @scala.inline
  def apply(
    body: Body = null,
    documentId: String = null,
    documentStyle: DocumentStyle = null,
    footers: js.Object = null,
    footnotes: js.Object = null,
    headers: js.Object = null,
    inlineObjects: js.Object = null,
    lists: js.Object = null,
    namedRanges: js.Object = null,
    namedStyles: NamedStyles = null,
    positionedObjects: js.Object = null,
    revisionId: String = null,
    suggestedDocumentStyleChanges: js.Object = null,
    suggestedNamedStylesChanges: js.Object = null,
    suggestionsViewMode: String = null,
    title: String = null
  ): Document = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (documentId != null) __obj.updateDynamic("documentId")(documentId)
    if (documentStyle != null) __obj.updateDynamic("documentStyle")(documentStyle)
    if (footers != null) __obj.updateDynamic("footers")(footers)
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (inlineObjects != null) __obj.updateDynamic("inlineObjects")(inlineObjects)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges)
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles)
    if (positionedObjects != null) __obj.updateDynamic("positionedObjects")(positionedObjects)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (suggestedDocumentStyleChanges != null) __obj.updateDynamic("suggestedDocumentStyleChanges")(suggestedDocumentStyleChanges)
    if (suggestedNamedStylesChanges != null) __obj.updateDynamic("suggestedNamedStylesChanges")(suggestedNamedStylesChanges)
    if (suggestionsViewMode != null) __obj.updateDynamic("suggestionsViewMode")(suggestionsViewMode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Document]
  }
}

