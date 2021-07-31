package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isBeforeMinDateMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/isBeforeMinDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isBeforeMinDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBeforeMinDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
