package typings.fluentuiDateTimeUtilities

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatYearMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting/formatYear", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatYear(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatYear")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
