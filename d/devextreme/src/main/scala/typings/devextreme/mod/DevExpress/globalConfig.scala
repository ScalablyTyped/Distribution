package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.CloseIcon
import typings.devextreme.devextremeStrings.filled
import typings.devextreme.devextremeStrings.outlined
import typings.devextreme.devextremeStrings.underlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait globalConfig extends js.Object {
  /** @deprecated */
  /** @name globalConfig.decimalSeparator */
  var decimalSeparator: js.UndefOr[String] = js.native
  /** @name globalConfig.defaultCurrency */
  var defaultCurrency: js.UndefOr[String] = js.native
  /** @name globalConfig.editorStylingMode */
  var editorStylingMode: js.UndefOr[outlined | underlined | filled] = js.native
  /** @name globalConfig.floatingActionButtonConfig */
  var floatingActionButtonConfig: js.UndefOr[CloseIcon] = js.native
  /** @name globalConfig.forceIsoDateParsing */
  var forceIsoDateParsing: js.UndefOr[Boolean] = js.native
  /** @name globalConfig.oDataFilterToLower */
  var oDataFilterToLower: js.UndefOr[Boolean] = js.native
  /** @name globalConfig.rtlEnabled */
  var rtlEnabled: js.UndefOr[Boolean] = js.native
  /** @name globalConfig.serverDecimalSeparator */
  var serverDecimalSeparator: js.UndefOr[String] = js.native
  /** @deprecated */
  /** @name globalConfig.thousandsSeparator */
  var thousandsSeparator: js.UndefOr[String] = js.native
  /** @name globalConfig.useLegacyStoreResult */
  var useLegacyStoreResult: js.UndefOr[Boolean] = js.native
  /** @name globalConfig.useLegacyVisibleIndex */
  var useLegacyVisibleIndex: js.UndefOr[Boolean] = js.native
}

object globalConfig {
  @scala.inline
  def apply(): globalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[globalConfig]
  }
  @scala.inline
  implicit class globalConfigOps[Self <: globalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setDefaultCurrency(value: String): Self = this.set("defaultCurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCurrency: Self = this.set("defaultCurrency", js.undefined)
    @scala.inline
    def setEditorStylingMode(value: outlined | underlined | filled): Self = this.set("editorStylingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorStylingMode: Self = this.set("editorStylingMode", js.undefined)
    @scala.inline
    def setFloatingActionButtonConfig(value: CloseIcon): Self = this.set("floatingActionButtonConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingActionButtonConfig: Self = this.set("floatingActionButtonConfig", js.undefined)
    @scala.inline
    def setForceIsoDateParsing(value: Boolean): Self = this.set("forceIsoDateParsing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceIsoDateParsing: Self = this.set("forceIsoDateParsing", js.undefined)
    @scala.inline
    def setODataFilterToLower(value: Boolean): Self = this.set("oDataFilterToLower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteODataFilterToLower: Self = this.set("oDataFilterToLower", js.undefined)
    @scala.inline
    def setRtlEnabled(value: Boolean): Self = this.set("rtlEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtlEnabled: Self = this.set("rtlEnabled", js.undefined)
    @scala.inline
    def setServerDecimalSeparator(value: String): Self = this.set("serverDecimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerDecimalSeparator: Self = this.set("serverDecimalSeparator", js.undefined)
    @scala.inline
    def setThousandsSeparator(value: String): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSeparator: Self = this.set("thousandsSeparator", js.undefined)
    @scala.inline
    def setUseLegacyStoreResult(value: Boolean): Self = this.set("useLegacyStoreResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegacyStoreResult: Self = this.set("useLegacyStoreResult", js.undefined)
    @scala.inline
    def setUseLegacyVisibleIndex(value: Boolean): Self = this.set("useLegacyVisibleIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegacyVisibleIndex: Self = this.set("useLegacyVisibleIndex", js.undefined)
  }
  
}

