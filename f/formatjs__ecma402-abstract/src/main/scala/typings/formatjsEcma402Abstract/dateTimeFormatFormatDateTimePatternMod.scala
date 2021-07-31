package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeFormatToLocalTimeMod.ToLocalTimeImplDetails
import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatLocaleInternalData
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatInternal
import typings.formatjsEcma402Abstract.typesDateTimeMod.IntlDateTimeFormatPart
import typings.std.Intl.DateTimeFormat
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatFormatDateTimePatternMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/FormatDateTimePattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def FormatDateTimePattern(
    dtf: DateTimeFormat,
    patternParts: js.Array[IntlDateTimeFormatPart],
    x: Double,
    hasGetInternalSlotsLocaleDataGetDefaultTimeZoneTzData: FormatDateTimePatternImplDetails & ToLocalTimeImplDetails
  ): js.Array[IntlDateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatDateTimePattern")(dtf.asInstanceOf[js.Any], patternParts.asInstanceOf[js.Any], x.asInstanceOf[js.Any], hasGetInternalSlotsLocaleDataGetDefaultTimeZoneTzData.asInstanceOf[js.Any])).asInstanceOf[js.Array[IntlDateTimeFormatPart]]
  
  trait FormatDateTimePatternImplDetails extends StObject {
    
    def getDefaultTimeZone(): String
    
    def getInternalSlots(dtf: DateTimeFormat): IntlDateTimeFormatInternal
    
    var localeData: Record[String, DateTimeFormatLocaleInternalData]
  }
  object FormatDateTimePatternImplDetails {
    
    @scala.inline
    def apply(
      getDefaultTimeZone: () => String,
      getInternalSlots: DateTimeFormat => IntlDateTimeFormatInternal,
      localeData: Record[String, DateTimeFormatLocaleInternalData]
    ): FormatDateTimePatternImplDetails = {
      val __obj = js.Dynamic.literal(getDefaultTimeZone = js.Any.fromFunction0(getDefaultTimeZone), getInternalSlots = js.Any.fromFunction1(getInternalSlots), localeData = localeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatDateTimePatternImplDetails]
    }
    
    @scala.inline
    implicit class FormatDateTimePatternImplDetailsMutableBuilder[Self <: FormatDateTimePatternImplDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDefaultTimeZone(value: () => String): Self = StObject.set(x, "getDefaultTimeZone", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInternalSlots(value: DateTimeFormat => IntlDateTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLocaleData(value: Record[String, DateTimeFormatLocaleInternalData]): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
    }
  }
}
