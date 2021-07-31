package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.day
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.era
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.hour
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.minute
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.month
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.second
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.timeZoneName
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.weekday
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsEcma402AbstractDateTimeFormatUtilsMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "DATE_TIME_PROPS")
  @js.native
  val DATE_TIME_PROPS: js.Array[
    /* keyof @formatjs/ecma402-abstract.anon.PickIntlDateTimeFormatInt */ weekday | era | second | day | hour | minute | year | month | timeZoneName
  ] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "additionPenalty")
  @js.native
  val additionPenalty: /* 20 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "differentNumericTypePenalty")
  @js.native
  val differentNumericTypePenalty: /* 15 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "longLessPenalty")
  @js.native
  val longLessPenalty: /* 8 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "longMorePenalty")
  @js.native
  val longMorePenalty: /* 6 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "removalPenalty")
  @js.native
  val removalPenalty: /* 120 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "shortLessPenalty")
  @js.native
  val shortLessPenalty: /* 6 */ Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/utils", "shortMorePenalty")
  @js.native
  val shortMorePenalty: /* 3 */ Double = js.native
}
