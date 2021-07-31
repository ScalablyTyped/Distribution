package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IRestrictedDatesOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isRestrictedDateMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/isRestrictedDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isRestrictedDate(date: Date, options: IRestrictedDatesOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRestrictedDate")(date.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
