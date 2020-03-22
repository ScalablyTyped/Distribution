package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonCloseIcon
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait globalConfig extends js.Object {
  /** @deprecated  */
  /** A decimal separator. No longer applies. */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /** The default currency. Accepts a 3-letter ISO 4217 code. */
  var defaultCurrency: js.UndefOr[String] = js.undefined
  /** Specifies how editors' text fields are styled in your application. */
  var editorStylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  /** Configures a Floating Action Button (FAB) that emits a stack of related actions (speed dial). */
  var floatingActionButtonConfig: js.UndefOr[AnonCloseIcon] = js.undefined
  /** Specifies whether dates are parsed and serialized according to the ISO 8601 standard in all browsers. */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to convert string values to lowercase in filter and search requests to OData services. Applies to the following operations: "startswith", "endswith", "contains", and "notcontains". */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether the widgets support a right-to-left representation. Available for individual widgets as well. */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  /** The decimal separator that is used when submitting a value to the server. */
  var serverDecimalSeparator: js.UndefOr[String] = js.undefined
  /** @deprecated  */
  /** A group separator. No longer applies. */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.undefined
  var useLegacyVisibleIndex: js.UndefOr[Boolean] = js.undefined
}

object globalConfig {
  @scala.inline
  def apply(
    decimalSeparator: String = null,
    defaultCurrency: String = null,
    editorStylingMode: outlined | underlined | filled = null,
    floatingActionButtonConfig: AnonCloseIcon = null,
    forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined,
    oDataFilterToLower: js.UndefOr[Boolean] = js.undefined,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    serverDecimalSeparator: String = null,
    thousandsSeparator: String = null,
    useLegacyStoreResult: js.UndefOr[Boolean] = js.undefined,
    useLegacyVisibleIndex: js.UndefOr[Boolean] = js.undefined
  ): globalConfig = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (defaultCurrency != null) __obj.updateDynamic("defaultCurrency")(defaultCurrency.asInstanceOf[js.Any])
    if (editorStylingMode != null) __obj.updateDynamic("editorStylingMode")(editorStylingMode.asInstanceOf[js.Any])
    if (floatingActionButtonConfig != null) __obj.updateDynamic("floatingActionButtonConfig")(floatingActionButtonConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsoDateParsing)) __obj.updateDynamic("forceIsoDateParsing")(forceIsoDateParsing.asInstanceOf[js.Any])
    if (!js.isUndefined(oDataFilterToLower)) __obj.updateDynamic("oDataFilterToLower")(oDataFilterToLower.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (serverDecimalSeparator != null) __obj.updateDynamic("serverDecimalSeparator")(serverDecimalSeparator.asInstanceOf[js.Any])
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacyStoreResult)) __obj.updateDynamic("useLegacyStoreResult")(useLegacyStoreResult.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacyVisibleIndex)) __obj.updateDynamic("useLegacyVisibleIndex")(useLegacyVisibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[globalConfig]
  }
}

