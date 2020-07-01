package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldIndex extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var fieldIndex: js.UndefOr[Double] = js.native
  var replaceString: js.UndefOr[String] = js.native
  var searchString: js.UndefOr[String] = js.native
}

object FieldIndex {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    fieldIndex: js.UndefOr[Double] = js.undefined,
    replaceString: String = null,
    searchString: String = null
  ): FieldIndex = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldIndex)) __obj.updateDynamic("fieldIndex")(fieldIndex.get.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldIndex]
  }
}

