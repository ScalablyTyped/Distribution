package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CaseSensitiveField extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var field: js.UndefOr[String] = js.native
  var fieldIndex: js.UndefOr[Double] = js.native
  var replaceString: js.UndefOr[String] = js.native
  var searchString: js.UndefOr[String] = js.native
}

object Anon_CaseSensitiveField {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    fieldIndex: Int | Double = null,
    replaceString: String = null,
    searchString: String = null
  ): Anon_CaseSensitiveField = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString.asInstanceOf[js.Any])
    if (searchString != null) __obj.updateDynamic("searchString")(searchString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseSensitiveField]
  }
}

