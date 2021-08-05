package typings.fluentuiDateTimeUtilities

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDayMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateFormatting/formatDay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDay(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
