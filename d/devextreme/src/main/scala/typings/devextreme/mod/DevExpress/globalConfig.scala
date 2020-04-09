package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonCloseIcon
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait globalConfig extends js.Object {
  /** @deprecated */
  /** @name globalConfig.decimalSeparator */
  var decimalSeparator: js.UndefOr[String] = js.undefined
  /** @name globalConfig.defaultCurrency */
  var defaultCurrency: js.UndefOr[String] = js.undefined
  /** @name globalConfig.editorStylingMode */
  var editorStylingMode: js.UndefOr[outlined | underlined | filled] = js.undefined
  /** @name globalConfig.floatingActionButtonConfig */
  var floatingActionButtonConfig: js.UndefOr[AnonCloseIcon] = js.undefined
  /** @name globalConfig.forceIsoDateParsing */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.undefined
  /** @name globalConfig.oDataFilterToLower */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.undefined
  /** @name globalConfig.rtlEnabled */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name globalConfig.serverDecimalSeparator */
  var serverDecimalSeparator: js.UndefOr[String] = js.undefined
  /** @deprecated */
  /** @name globalConfig.thousandsSeparator */
  var thousandsSeparator: js.UndefOr[String] = js.undefined
  /** @name globalConfig.useLegacyStoreResult */
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.undefined
  /** @name globalConfig.useLegacyVisibleIndex */
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

