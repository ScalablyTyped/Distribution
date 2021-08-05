package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IAvailableDateOptions
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findAvailableDateMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/findAvailableDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAvailableDate(options: IAvailableDateOptions): js.UndefOr[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAvailableDate")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date]]
}
