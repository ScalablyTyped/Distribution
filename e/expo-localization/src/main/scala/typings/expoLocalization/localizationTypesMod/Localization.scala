package typings.expoLocalization.localizationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Localization extends js.Object {
  var isRTL: Boolean = js.native
  var isoCurrencyCodes: js.UndefOr[js.Array[String]] = js.native
  var locale: String = js.native
  var locales: js.Array[String] = js.native
  var region: js.UndefOr[String] = js.native
  var timezone: String = js.native
}

object Localization {
  @scala.inline
  def apply(isRTL: Boolean, locale: String, locales: js.Array[String], timezone: String): Localization = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localization]
  }
  @scala.inline
  implicit class LocalizationOps[Self <: Localization] (val x: Self) extends AnyVal {
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
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoCurrencyCodesVarargs(value: String*): Self = this.set("isoCurrencyCodes", js.Array(value :_*))
    @scala.inline
    def setIsoCurrencyCodes(value: js.Array[String]): Self = this.set("isoCurrencyCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoCurrencyCodes: Self = this.set("isoCurrencyCodes", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

