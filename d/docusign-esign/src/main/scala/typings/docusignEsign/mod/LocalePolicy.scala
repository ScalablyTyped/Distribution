package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalePolicy extends js.Object {
  
  var addressFormat: js.UndefOr[String] = js.native
  
  var addressFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowRegion: js.UndefOr[String] = js.native
  
  var calendarType: js.UndefOr[String] = js.native
  
  var calendarTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var cultureName: js.UndefOr[String] = js.native
  
  var cultureNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `currencyCode` property is editable.
    */
  var currencyCodeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var currencyNegativeFormat: js.UndefOr[String] = js.native
  
  var currencyNegativeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var currencyPositiveFormat: js.UndefOr[String] = js.native
  
  var currencyPositiveFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var customDateFormat: js.UndefOr[String] = js.native
  
  var customSignDateFormat: js.UndefOr[String] = js.native
  
  var customSignTimeFormat: js.UndefOr[String] = js.native
  
  var customTimeFormat: js.UndefOr[String] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var dateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var effectiveAddressFormat: js.UndefOr[String] = js.native
  
  var effectiveCalendarType: js.UndefOr[String] = js.native
  
  var effectiveCurrencyCode: js.UndefOr[String] = js.native
  
  var effectiveCurrencyNegativeFormat: js.UndefOr[String] = js.native
  
  var effectiveCurrencyPositiveFormat: js.UndefOr[String] = js.native
  
  var effectiveCustomDateFormat: js.UndefOr[String] = js.native
  
  var effectiveCustomTimeFormat: js.UndefOr[String] = js.native
  
  var effectiveDateFormat: js.UndefOr[String] = js.native
  
  var effectiveInitialFormat: js.UndefOr[String] = js.native
  
  var effectiveNameFormat: js.UndefOr[String] = js.native
  
  var effectiveTimeFormat: js.UndefOr[String] = js.native
  
  var effectiveTimeZone: js.UndefOr[String] = js.native
  
  var initialFormat: js.UndefOr[String] = js.native
  
  var initialFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var nameFormat: js.UndefOr[String] = js.native
  
  var nameFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The format for the signature date. Valid values are:
    *
    * - `d/M/yyyy`
    * - `dd-MM-yy`
    * - `dd-MMM-yy`
    * - `dd-MM-yyyy`
    * - `dd.MM.yyyy`
    * - `dd-MMM-yyyy`
    * - `dd MMMM yyyy`
    * - `M/d/yyyy`
    * - `MM-dd-yyyy`
    * - `MM/dd/yyyy`
    * - `MM/dd/yy`
    * - `MMM-dd-yyyy`
    * - `MMM d, yyyy`
    * - `MMMM d, yyyy`
    * - `yyyy-MM-dd`
    * - `yyyy-MMM-dd`
    * - `yyyy/MM/dd`
    * - `yyyy MMMM d`
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signDateFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signDateFormat` property is editable.
    *
    */
  var signDateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The format for the signature time. Valid values are:
    *
    * - `none`
    * - `HH:mm`
    * - `h:mm`
    * - `HH:mm:ss`
    * - `h:mm:ss`
    *
    */
  var signTimeFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signTimeFormat` property is editable.
    *
    */
  var signTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var timeFormat: js.UndefOr[String] = js.native
  
  var timeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var timeZoneMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object LocalePolicy {
  
  @scala.inline
  def apply(): LocalePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalePolicy]
  }
  
  @scala.inline
  implicit class LocalePolicyOps[Self <: LocalePolicy] (val x: Self) extends AnyVal {
    
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
    def setAddressFormat(value: String): Self = this.set("addressFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressFormat: Self = this.set("addressFormat", js.undefined)
    
    @scala.inline
    def setAddressFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("addressFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressFormatMetadata: Self = this.set("addressFormatMetadata", js.undefined)
    
    @scala.inline
    def setAllowRegion(value: String): Self = this.set("allowRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRegion: Self = this.set("allowRegion", js.undefined)
    
    @scala.inline
    def setCalendarType(value: String): Self = this.set("calendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarType: Self = this.set("calendarType", js.undefined)
    
    @scala.inline
    def setCalendarTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("calendarTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarTypeMetadata: Self = this.set("calendarTypeMetadata", js.undefined)
    
    @scala.inline
    def setCultureName(value: String): Self = this.set("cultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCultureName: Self = this.set("cultureName", js.undefined)
    
    @scala.inline
    def setCultureNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("cultureNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCultureNameMetadata: Self = this.set("cultureNameMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencyCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("currencyCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCodeMetadata: Self = this.set("currencyCodeMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyNegativeFormat(value: String): Self = this.set("currencyNegativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyNegativeFormat: Self = this.set("currencyNegativeFormat", js.undefined)
    
    @scala.inline
    def setCurrencyNegativeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("currencyNegativeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyNegativeFormatMetadata: Self = this.set("currencyNegativeFormatMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyPositiveFormat(value: String): Self = this.set("currencyPositiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyPositiveFormat: Self = this.set("currencyPositiveFormat", js.undefined)
    
    @scala.inline
    def setCurrencyPositiveFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("currencyPositiveFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyPositiveFormatMetadata: Self = this.set("currencyPositiveFormatMetadata", js.undefined)
    
    @scala.inline
    def setCustomDateFormat(value: String): Self = this.set("customDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDateFormat: Self = this.set("customDateFormat", js.undefined)
    
    @scala.inline
    def setCustomSignDateFormat(value: String): Self = this.set("customSignDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSignDateFormat: Self = this.set("customSignDateFormat", js.undefined)
    
    @scala.inline
    def setCustomSignTimeFormat(value: String): Self = this.set("customSignTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSignTimeFormat: Self = this.set("customSignTimeFormat", js.undefined)
    
    @scala.inline
    def setCustomTimeFormat(value: String): Self = this.set("customTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTimeFormat: Self = this.set("customTimeFormat", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("dateFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormatMetadata: Self = this.set("dateFormatMetadata", js.undefined)
    
    @scala.inline
    def setEffectiveAddressFormat(value: String): Self = this.set("effectiveAddressFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveAddressFormat: Self = this.set("effectiveAddressFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCalendarType(value: String): Self = this.set("effectiveCalendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCalendarType: Self = this.set("effectiveCalendarType", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyCode(value: String): Self = this.set("effectiveCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCurrencyCode: Self = this.set("effectiveCurrencyCode", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyNegativeFormat(value: String): Self = this.set("effectiveCurrencyNegativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCurrencyNegativeFormat: Self = this.set("effectiveCurrencyNegativeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyPositiveFormat(value: String): Self = this.set("effectiveCurrencyPositiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCurrencyPositiveFormat: Self = this.set("effectiveCurrencyPositiveFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCustomDateFormat(value: String): Self = this.set("effectiveCustomDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCustomDateFormat: Self = this.set("effectiveCustomDateFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCustomTimeFormat(value: String): Self = this.set("effectiveCustomTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveCustomTimeFormat: Self = this.set("effectiveCustomTimeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveDateFormat(value: String): Self = this.set("effectiveDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDateFormat: Self = this.set("effectiveDateFormat", js.undefined)
    
    @scala.inline
    def setEffectiveInitialFormat(value: String): Self = this.set("effectiveInitialFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveInitialFormat: Self = this.set("effectiveInitialFormat", js.undefined)
    
    @scala.inline
    def setEffectiveNameFormat(value: String): Self = this.set("effectiveNameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveNameFormat: Self = this.set("effectiveNameFormat", js.undefined)
    
    @scala.inline
    def setEffectiveTimeFormat(value: String): Self = this.set("effectiveTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveTimeFormat: Self = this.set("effectiveTimeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveTimeZone(value: String): Self = this.set("effectiveTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveTimeZone: Self = this.set("effectiveTimeZone", js.undefined)
    
    @scala.inline
    def setInitialFormat(value: String): Self = this.set("initialFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFormat: Self = this.set("initialFormat", js.undefined)
    
    @scala.inline
    def setInitialFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("initialFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFormatMetadata: Self = this.set("initialFormatMetadata", js.undefined)
    
    @scala.inline
    def setNameFormat(value: String): Self = this.set("nameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFormat: Self = this.set("nameFormat", js.undefined)
    
    @scala.inline
    def setNameFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("nameFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFormatMetadata: Self = this.set("nameFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignDateFormat(value: String): Self = this.set("signDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignDateFormat: Self = this.set("signDateFormat", js.undefined)
    
    @scala.inline
    def setSignDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signDateFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignDateFormatMetadata: Self = this.set("signDateFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignTimeFormat(value: String): Self = this.set("signTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeFormat: Self = this.set("signTimeFormat", js.undefined)
    
    @scala.inline
    def setSignTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeFormatMetadata: Self = this.set("signTimeFormatMetadata", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    
    @scala.inline
    def setTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeFormatMetadata: Self = this.set("timeFormatMetadata", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setTimeZoneMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timeZoneMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneMetadata: Self = this.set("timeZoneMetadata", js.undefined)
  }
}
