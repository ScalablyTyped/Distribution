package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalePolicy extends StObject {
  
  var addressFormat: js.UndefOr[String] = js.undefined
  
  var addressFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowRegion: js.UndefOr[String] = js.undefined
  
  var calendarType: js.UndefOr[String] = js.undefined
  
  var calendarTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var cultureName: js.UndefOr[String] = js.undefined
  
  var cultureNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `currencyCode` property is editable.
    */
  var currencyCodeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var currencyNegativeFormat: js.UndefOr[String] = js.undefined
  
  var currencyNegativeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var currencyPositiveFormat: js.UndefOr[String] = js.undefined
  
  var currencyPositiveFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var customDateFormat: js.UndefOr[String] = js.undefined
  
  var customSignDateFormat: js.UndefOr[String] = js.undefined
  
  var customSignTimeFormat: js.UndefOr[String] = js.undefined
  
  var customTimeFormat: js.UndefOr[String] = js.undefined
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var dateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var effectiveAddressFormat: js.UndefOr[String] = js.undefined
  
  var effectiveCalendarType: js.UndefOr[String] = js.undefined
  
  var effectiveCurrencyCode: js.UndefOr[String] = js.undefined
  
  var effectiveCurrencyNegativeFormat: js.UndefOr[String] = js.undefined
  
  var effectiveCurrencyPositiveFormat: js.UndefOr[String] = js.undefined
  
  var effectiveCustomDateFormat: js.UndefOr[String] = js.undefined
  
  var effectiveCustomTimeFormat: js.UndefOr[String] = js.undefined
  
  var effectiveDateFormat: js.UndefOr[String] = js.undefined
  
  var effectiveInitialFormat: js.UndefOr[String] = js.undefined
  
  var effectiveNameFormat: js.UndefOr[String] = js.undefined
  
  var effectiveTimeFormat: js.UndefOr[String] = js.undefined
  
  var effectiveTimeZone: js.UndefOr[String] = js.undefined
  
  var initialFormat: js.UndefOr[String] = js.undefined
  
  var initialFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var nameFormat: js.UndefOr[String] = js.undefined
  
  var nameFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var signDateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signDateFormat` property is editable.
    *
    */
  var signDateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var signTimeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signTimeFormat` property is editable.
    *
    */
  var signTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var timeFormat: js.UndefOr[String] = js.undefined
  
  var timeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var timeZoneMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
}
object LocalePolicy {
  
  inline def apply(): LocalePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalePolicy]
  }
  
  extension [Self <: LocalePolicy](x: Self) {
    
    inline def setAddressFormat(value: String): Self = StObject.set(x, "addressFormat", value.asInstanceOf[js.Any])
    
    inline def setAddressFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "addressFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setAddressFormatMetadataUndefined: Self = StObject.set(x, "addressFormatMetadata", js.undefined)
    
    inline def setAddressFormatUndefined: Self = StObject.set(x, "addressFormat", js.undefined)
    
    inline def setAllowRegion(value: String): Self = StObject.set(x, "allowRegion", value.asInstanceOf[js.Any])
    
    inline def setAllowRegionUndefined: Self = StObject.set(x, "allowRegion", js.undefined)
    
    inline def setCalendarType(value: String): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setCalendarTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "calendarTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setCalendarTypeMetadataUndefined: Self = StObject.set(x, "calendarTypeMetadata", js.undefined)
    
    inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
    
    inline def setCultureName(value: String): Self = StObject.set(x, "cultureName", value.asInstanceOf[js.Any])
    
    inline def setCultureNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "cultureNameMetadata", value.asInstanceOf[js.Any])
    
    inline def setCultureNameMetadataUndefined: Self = StObject.set(x, "cultureNameMetadata", js.undefined)
    
    inline def setCultureNameUndefined: Self = StObject.set(x, "cultureName", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyCodeMetadata", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeMetadataUndefined: Self = StObject.set(x, "currencyCodeMetadata", js.undefined)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCurrencyNegativeFormat(value: String): Self = StObject.set(x, "currencyNegativeFormat", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNegativeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyNegativeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNegativeFormatMetadataUndefined: Self = StObject.set(x, "currencyNegativeFormatMetadata", js.undefined)
    
    inline def setCurrencyNegativeFormatUndefined: Self = StObject.set(x, "currencyNegativeFormat", js.undefined)
    
    inline def setCurrencyPositiveFormat(value: String): Self = StObject.set(x, "currencyPositiveFormat", value.asInstanceOf[js.Any])
    
    inline def setCurrencyPositiveFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "currencyPositiveFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setCurrencyPositiveFormatMetadataUndefined: Self = StObject.set(x, "currencyPositiveFormatMetadata", js.undefined)
    
    inline def setCurrencyPositiveFormatUndefined: Self = StObject.set(x, "currencyPositiveFormat", js.undefined)
    
    inline def setCustomDateFormat(value: String): Self = StObject.set(x, "customDateFormat", value.asInstanceOf[js.Any])
    
    inline def setCustomDateFormatUndefined: Self = StObject.set(x, "customDateFormat", js.undefined)
    
    inline def setCustomSignDateFormat(value: String): Self = StObject.set(x, "customSignDateFormat", value.asInstanceOf[js.Any])
    
    inline def setCustomSignDateFormatUndefined: Self = StObject.set(x, "customSignDateFormat", js.undefined)
    
    inline def setCustomSignTimeFormat(value: String): Self = StObject.set(x, "customSignTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setCustomSignTimeFormatUndefined: Self = StObject.set(x, "customSignTimeFormat", js.undefined)
    
    inline def setCustomTimeFormat(value: String): Self = StObject.set(x, "customTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setCustomTimeFormatUndefined: Self = StObject.set(x, "customTimeFormat", js.undefined)
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dateFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setDateFormatMetadataUndefined: Self = StObject.set(x, "dateFormatMetadata", js.undefined)
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setEffectiveAddressFormat(value: String): Self = StObject.set(x, "effectiveAddressFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveAddressFormatUndefined: Self = StObject.set(x, "effectiveAddressFormat", js.undefined)
    
    inline def setEffectiveCalendarType(value: String): Self = StObject.set(x, "effectiveCalendarType", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCalendarTypeUndefined: Self = StObject.set(x, "effectiveCalendarType", js.undefined)
    
    inline def setEffectiveCurrencyCode(value: String): Self = StObject.set(x, "effectiveCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCurrencyCodeUndefined: Self = StObject.set(x, "effectiveCurrencyCode", js.undefined)
    
    inline def setEffectiveCurrencyNegativeFormat(value: String): Self = StObject.set(x, "effectiveCurrencyNegativeFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCurrencyNegativeFormatUndefined: Self = StObject.set(x, "effectiveCurrencyNegativeFormat", js.undefined)
    
    inline def setEffectiveCurrencyPositiveFormat(value: String): Self = StObject.set(x, "effectiveCurrencyPositiveFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCurrencyPositiveFormatUndefined: Self = StObject.set(x, "effectiveCurrencyPositiveFormat", js.undefined)
    
    inline def setEffectiveCustomDateFormat(value: String): Self = StObject.set(x, "effectiveCustomDateFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCustomDateFormatUndefined: Self = StObject.set(x, "effectiveCustomDateFormat", js.undefined)
    
    inline def setEffectiveCustomTimeFormat(value: String): Self = StObject.set(x, "effectiveCustomTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveCustomTimeFormatUndefined: Self = StObject.set(x, "effectiveCustomTimeFormat", js.undefined)
    
    inline def setEffectiveDateFormat(value: String): Self = StObject.set(x, "effectiveDateFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateFormatUndefined: Self = StObject.set(x, "effectiveDateFormat", js.undefined)
    
    inline def setEffectiveInitialFormat(value: String): Self = StObject.set(x, "effectiveInitialFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveInitialFormatUndefined: Self = StObject.set(x, "effectiveInitialFormat", js.undefined)
    
    inline def setEffectiveNameFormat(value: String): Self = StObject.set(x, "effectiveNameFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveNameFormatUndefined: Self = StObject.set(x, "effectiveNameFormat", js.undefined)
    
    inline def setEffectiveTimeFormat(value: String): Self = StObject.set(x, "effectiveTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeFormatUndefined: Self = StObject.set(x, "effectiveTimeFormat", js.undefined)
    
    inline def setEffectiveTimeZone(value: String): Self = StObject.set(x, "effectiveTimeZone", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeZoneUndefined: Self = StObject.set(x, "effectiveTimeZone", js.undefined)
    
    inline def setInitialFormat(value: String): Self = StObject.set(x, "initialFormat", value.asInstanceOf[js.Any])
    
    inline def setInitialFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "initialFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setInitialFormatMetadataUndefined: Self = StObject.set(x, "initialFormatMetadata", js.undefined)
    
    inline def setInitialFormatUndefined: Self = StObject.set(x, "initialFormat", js.undefined)
    
    inline def setNameFormat(value: String): Self = StObject.set(x, "nameFormat", value.asInstanceOf[js.Any])
    
    inline def setNameFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "nameFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setNameFormatMetadataUndefined: Self = StObject.set(x, "nameFormatMetadata", js.undefined)
    
    inline def setNameFormatUndefined: Self = StObject.set(x, "nameFormat", js.undefined)
    
    inline def setSignDateFormat(value: String): Self = StObject.set(x, "signDateFormat", value.asInstanceOf[js.Any])
    
    inline def setSignDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signDateFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignDateFormatMetadataUndefined: Self = StObject.set(x, "signDateFormatMetadata", js.undefined)
    
    inline def setSignDateFormatUndefined: Self = StObject.set(x, "signDateFormat", js.undefined)
    
    inline def setSignTimeFormat(value: String): Self = StObject.set(x, "signTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setSignTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignTimeFormatMetadataUndefined: Self = StObject.set(x, "signTimeFormatMetadata", js.undefined)
    
    inline def setSignTimeFormatUndefined: Self = StObject.set(x, "signTimeFormat", js.undefined)
    
    inline def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatMetadataUndefined: Self = StObject.set(x, "timeFormatMetadata", js.undefined)
    
    inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timeZoneMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneMetadataUndefined: Self = StObject.set(x, "timeZoneMetadata", js.undefined)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
