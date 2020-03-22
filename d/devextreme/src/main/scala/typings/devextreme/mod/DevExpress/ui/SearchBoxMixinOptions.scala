package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.equals
import typings.devextreme.devextremeStrings.startswith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBoxMixinOptions[T] extends js.Object {
  /** Configures the search panel. */
  var searchEditorOptions: js.UndefOr[dxTextBoxOptions[dxTextBox]] = js.undefined
  /** Specifies whether the search panel is visible. */
  var searchEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies a data object's field name or an expression whose value is compared to the search string. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.undefined
  /** Specifies a comparison operation used to search widget items. */
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  /** Specifies a delay in milliseconds between when a user finishes typing, and the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  /** Specifies the current search string. */
  var searchValue: js.UndefOr[String] = js.undefined
}

object SearchBoxMixinOptions {
  @scala.inline
  def apply[T](
    searchEditorOptions: dxTextBoxOptions[dxTextBox] = null,
    searchEnabled: js.UndefOr[Boolean] = js.undefined,
    searchExpr: String | js.Function | (js.Array[String | js.Function]) = null,
    searchMode: contains | startswith | equals = null,
    searchTimeout: Int | Double = null,
    searchValue: String = null
  ): SearchBoxMixinOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (searchEditorOptions != null) __obj.updateDynamic("searchEditorOptions")(searchEditorOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(searchEnabled)) __obj.updateDynamic("searchEnabled")(searchEnabled.asInstanceOf[js.Any])
    if (searchExpr != null) __obj.updateDynamic("searchExpr")(searchExpr.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (searchTimeout != null) __obj.updateDynamic("searchTimeout")(searchTimeout.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBoxMixinOptions[T]]
  }
}

