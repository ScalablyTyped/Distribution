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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/utils", JSImport.Namespace)
@js.native
object dateTimeFormatUtilsMod extends js.Object {
  
  val DATE_TIME_PROPS: js.Array[
    /* keyof @formatjs/ecma402-abstract.anon.PickIntlDateTimeFormatInt */ weekday | era | second | day | hour | minute | year | month | timeZoneName
  ] = js.native
  
  val additionPenalty: /* 20 */ Double = js.native
  
  val differentNumericTypePenalty: /* 15 */ Double = js.native
  
  val longLessPenalty: /* 8 */ Double = js.native
  
  val longMorePenalty: /* 6 */ Double = js.native
  
  val removalPenalty: /* 120 */ Double = js.native
  
  val shortLessPenalty: /* 6 */ Double = js.native
  
  val shortMorePenalty: /* 3 */ Double = js.native
}
