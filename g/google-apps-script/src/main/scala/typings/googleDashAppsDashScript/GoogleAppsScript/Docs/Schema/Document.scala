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
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    if (documentStyle != null) __obj.updateDynamic("documentStyle")(documentStyle.asInstanceOf[js.Any])
    if (footers != null) __obj.updateDynamic("footers")(footers.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (inlineObjects != null) __obj.updateDynamic("inlineObjects")(inlineObjects.asInstanceOf[js.Any])
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (namedRanges != null) __obj.updateDynamic("namedRanges")(namedRanges.asInstanceOf[js.Any])
    if (namedStyles != null) __obj.updateDynamic("namedStyles")(namedStyles.asInstanceOf[js.Any])
    if (positionedObjects != null) __obj.updateDynamic("positionedObjects")(positionedObjects.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    if (suggestedDocumentStyleChanges != null) __obj.updateDynamic("suggestedDocumentStyleChanges")(suggestedDocumentStyleChanges.asInstanceOf[js.Any])
    if (suggestedNamedStylesChanges != null) __obj.updateDynamic("suggestedNamedStylesChanges")(suggestedNamedStylesChanges.asInstanceOf[js.Any])
    if (suggestionsViewMode != null) __obj.updateDynamic("suggestionsViewMode")(suggestionsViewMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

