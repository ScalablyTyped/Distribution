package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isAfterMaxDateMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/isAfterMaxDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAfterMaxDate(date: js.Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAfterMaxDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
