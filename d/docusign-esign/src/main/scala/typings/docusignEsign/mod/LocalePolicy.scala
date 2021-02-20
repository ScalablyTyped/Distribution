package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalePolicy extends StObject {
  
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
  implicit class LocalePolicyMutableBuilder[Self <: LocalePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFormat(value: String): Self = StObject.set(x, "addressFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "addressFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressFormatMetadataUndefined: Self = StObject.set(x, "addressFormatMetadata", js.undefined)
    
    @scala.inline
    def setAddressFormatUndefined: Self = StObject.set(x, "addressFormat", js.undefined)
    
    @scala.inline
    def setAllowRegion(value: String): Self = StObject.set(x, "allowRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRegionUndefined: Self = StObject.set(x, "allowRegion", js.undefined)
    
    @scala.inline
    def setCalendarType(value: String): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "calendarTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarTypeMetadataUndefined: Self = StObject.set(x, "calendarTypeMetadata", js.undefined)
    
    @scala.inline
    def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
    
    @scala.inline
    def setCultureName(value: String): Self = StObject.set(x, "cultureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "cultureNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureNameMetadataUndefined: Self = StObject.set(x, "cultureNameMetadata", js.undefined)
    
    @scala.inline
    def setCultureNameUndefined: Self = StObject.set(x, "cultureName", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeMetadataUndefined: Self = StObject.set(x, "currencyCodeMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setCurrencyNegativeFormat(value: String): Self = StObject.set(x, "currencyNegativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyNegativeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyNegativeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyNegativeFormatMetadataUndefined: Self = StObject.set(x, "currencyNegativeFormatMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyNegativeFormatUndefined: Self = StObject.set(x, "currencyNegativeFormat", js.undefined)
    
    @scala.inline
    def setCurrencyPositiveFormat(value: String): Self = StObject.set(x, "currencyPositiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyPositiveFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyPositiveFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyPositiveFormatMetadataUndefined: Self = StObject.set(x, "currencyPositiveFormatMetadata", js.undefined)
    
    @scala.inline
    def setCurrencyPositiveFormatUndefined: Self = StObject.set(x, "currencyPositiveFormat", js.undefined)
    
    @scala.inline
    def setCustomDateFormat(value: String): Self = StObject.set(x, "customDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDateFormatUndefined: Self = StObject.set(x, "customDateFormat", js.undefined)
    
    @scala.inline
    def setCustomSignDateFormat(value: String): Self = StObject.set(x, "customSignDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSignDateFormatUndefined: Self = StObject.set(x, "customSignDateFormat", js.undefined)
    
    @scala.inline
    def setCustomSignTimeFormat(value: String): Self = StObject.set(x, "customSignTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSignTimeFormatUndefined: Self = StObject.set(x, "customSignTimeFormat", js.undefined)
    
    @scala.inline
    def setCustomTimeFormat(value: String): Self = StObject.set(x, "customTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTimeFormatUndefined: Self = StObject.set(x, "customTimeFormat", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dateFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatMetadataUndefined: Self = StObject.set(x, "dateFormatMetadata", js.undefined)
    
    @scala.inline
    def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    @scala.inline
    def setEffectiveAddressFormat(value: String): Self = StObject.set(x, "effectiveAddressFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveAddressFormatUndefined: Self = StObject.set(x, "effectiveAddressFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCalendarType(value: String): Self = StObject.set(x, "effectiveCalendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCalendarTypeUndefined: Self = StObject.set(x, "effectiveCalendarType", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyCode(value: String): Self = StObject.set(x, "effectiveCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCurrencyCodeUndefined: Self = StObject.set(x, "effectiveCurrencyCode", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyNegativeFormat(value: String): Self = StObject.set(x, "effectiveCurrencyNegativeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCurrencyNegativeFormatUndefined: Self = StObject.set(x, "effectiveCurrencyNegativeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCurrencyPositiveFormat(value: String): Self = StObject.set(x, "effectiveCurrencyPositiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCurrencyPositiveFormatUndefined: Self = StObject.set(x, "effectiveCurrencyPositiveFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCustomDateFormat(value: String): Self = StObject.set(x, "effectiveCustomDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCustomDateFormatUndefined: Self = StObject.set(x, "effectiveCustomDateFormat", js.undefined)
    
    @scala.inline
    def setEffectiveCustomTimeFormat(value: String): Self = StObject.set(x, "effectiveCustomTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveCustomTimeFormatUndefined: Self = StObject.set(x, "effectiveCustomTimeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveDateFormat(value: String): Self = StObject.set(x, "effectiveDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateFormatUndefined: Self = StObject.set(x, "effectiveDateFormat", js.undefined)
    
    @scala.inline
    def setEffectiveInitialFormat(value: String): Self = StObject.set(x, "effectiveInitialFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveInitialFormatUndefined: Self = StObject.set(x, "effectiveInitialFormat", js.undefined)
    
    @scala.inline
    def setEffectiveNameFormat(value: String): Self = StObject.set(x, "effectiveNameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveNameFormatUndefined: Self = StObject.set(x, "effectiveNameFormat", js.undefined)
    
    @scala.inline
    def setEffectiveTimeFormat(value: String): Self = StObject.set(x, "effectiveTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimeFormatUndefined: Self = StObject.set(x, "effectiveTimeFormat", js.undefined)
    
    @scala.inline
    def setEffectiveTimeZone(value: String): Self = StObject.set(x, "effectiveTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveTimeZoneUndefined: Self = StObject.set(x, "effectiveTimeZone", js.undefined)
    
    @scala.inline
    def setInitialFormat(value: String): Self = StObject.set(x, "initialFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "initialFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialFormatMetadataUndefined: Self = StObject.set(x, "initialFormatMetadata", js.undefined)
    
    @scala.inline
    def setInitialFormatUndefined: Self = StObject.set(x, "initialFormat", js.undefined)
    
    @scala.inline
    def setNameFormat(value: String): Self = StObject.set(x, "nameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "nameFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFormatMetadataUndefined: Self = StObject.set(x, "nameFormatMetadata", js.undefined)
    
    @scala.inline
    def setNameFormatUndefined: Self = StObject.set(x, "nameFormat", js.undefined)
    
    @scala.inline
    def setSignDateFormat(value: String): Self = StObject.set(x, "signDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signDateFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDateFormatMetadataUndefined: Self = StObject.set(x, "signDateFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignDateFormatUndefined: Self = StObject.set(x, "signDateFormat", js.undefined)
    
    @scala.inline
    def setSignTimeFormat(value: String): Self = StObject.set(x, "signTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignTimeFormatMetadataUndefined: Self = StObject.set(x, "signTimeFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignTimeFormatUndefined: Self = StObject.set(x, "signTimeFormat", js.undefined)
    
    @scala.inline
    def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeFormatMetadataUndefined: Self = StObject.set(x, "timeFormatMetadata", js.undefined)
    
    @scala.inline
    def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timeZoneMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneMetadataUndefined: Self = StObject.set(x, "timeZoneMetadata", js.undefined)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
