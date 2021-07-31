package typings.fluentuiDateTimeUtilities

import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDay
import typings.fluentuiDateTimeUtilities.dateGridTypesMod.IDayGridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDayGridMod {
  
  @JSImport("@fluentui/date-time-utilities/lib/dateGrid/getDayGrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDayGrid(options: IDayGridOptions): js.Array[js.Array[IDay]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDayGrid")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[IDay]]]
}
