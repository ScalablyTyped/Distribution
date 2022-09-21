package typings.fluentuiDateTimeUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeFormattingMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/timeFormatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTimeString(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Boolean, useHour12: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any], useHour12.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTimeString(date: js.Date, showSeconds: Unit, useHour12: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTimeString")(date.asInstanceOf[js.Any], showSeconds.asInstanceOf[js.Any], useHour12.asInstanceOf[js.Any])).asInstanceOf[String]
}
