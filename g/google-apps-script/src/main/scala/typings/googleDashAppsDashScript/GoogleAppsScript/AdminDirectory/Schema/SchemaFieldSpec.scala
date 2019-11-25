package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

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
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fieldId != null) __obj.updateDynamic("fieldId")(fieldId.asInstanceOf[js.Any])
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName.asInstanceOf[js.Any])
    if (fieldType != null) __obj.updateDynamic("fieldType")(fieldType.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(multiValued)) __obj.updateDynamic("multiValued")(multiValued.asInstanceOf[js.Any])
    if (numericIndexingSpec != null) __obj.updateDynamic("numericIndexingSpec")(numericIndexingSpec.asInstanceOf[js.Any])
    if (readAccessType != null) __obj.updateDynamic("readAccessType")(readAccessType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldSpec]
  }
}

