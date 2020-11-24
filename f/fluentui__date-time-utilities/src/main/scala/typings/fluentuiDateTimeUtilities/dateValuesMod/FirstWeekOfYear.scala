package typings.fluentuiDateTimeUtilities.dateValuesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FirstWeekOfYear extends js.Object
@JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "FirstWeekOfYear")
@js.native
object FirstWeekOfYear extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FirstWeekOfYear with Double] = js.native
  
  @js.native
  sealed trait FirstDay extends FirstWeekOfYear
  /* 0 */ @js.native
  object FirstDay extends TopLevel[FirstDay with Double]
  
  @js.native
  sealed trait FirstFourDayWeek extends FirstWeekOfYear
  /* 2 */ @js.native
  object FirstFourDayWeek extends TopLevel[FirstFourDayWeek with Double]
  
  @js.native
  sealed trait FirstFullWeek extends FirstWeekOfYear
  /* 1 */ @js.native
  object FirstFullWeek extends TopLevel[FirstFullWeek with Double]
}
