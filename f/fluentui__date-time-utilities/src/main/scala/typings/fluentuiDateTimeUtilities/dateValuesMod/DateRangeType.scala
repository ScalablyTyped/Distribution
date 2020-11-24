package typings.fluentuiDateTimeUtilities.dateValuesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateRangeType extends js.Object
@JSImport("@fluentui/date-time-utilities/lib/dateValues/dateValues", "DateRangeType")
@js.native
object DateRangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DateRangeType with Double] = js.native
  
  @js.native
  sealed trait Day extends DateRangeType
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  @js.native
  sealed trait Month extends DateRangeType
  /* 2 */ @js.native
  object Month extends TopLevel[Month with Double]
  
  @js.native
  sealed trait Week extends DateRangeType
  /* 1 */ @js.native
  object Week extends TopLevel[Week with Double]
  
  @js.native
  sealed trait WorkWeek extends DateRangeType
  /* 3 */ @js.native
  object WorkWeek extends TopLevel[WorkWeek with Double]
}
