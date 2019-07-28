package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldSpec extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var fieldId: js.UndefOr[String] = js.undefined
  var fieldName: js.UndefOr[String] = js.undefined
  var fieldType: js.UndefOr[String] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var multiValued: js.UndefOr[Boolean] = js.undefined
  var numericIndexingSpec: js.UndefOr[SchemaFieldSpecNumericIndexingSpec] = js.undefined
  var readAccessType: js.UndefOr[String] = js.undefined
}

object SchemaFieldSpec {
  @scala.inline
  def apply(
    displayName: String = null,
    etag: String = null,
    fieldId: String = null,
    fieldName: String = null,
    fieldType: String = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    multiValued: js.UndefOr[Boolean] = js.undefined,
    numericIndexingSpec: SchemaFieldSpecNumericIndexingSpec = null,
    readAccessType: String = null
  ): SchemaFieldSpec = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId)
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (fieldType != null) __obj.updateDynamic("fieldType")(fieldType)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(multiValued)) __obj.updateDynamic("multiValued")(multiValued)
    if (numericIndexingSpec != null) __obj.updateDynamic("numericIndexingSpec")(numericIndexingSpec)
    if (readAccessType != null) __obj.updateDynamic("readAccessType")(readAccessType)
    __obj.asInstanceOf[SchemaFieldSpec]
  }
}

