package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationType extends js.Object

@JSGlobal("GoogleAppsScript.Data_Studio.AggregationType")
@js.native
object AggregationType extends js.Object {
  @js.native
  sealed trait AUTO
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait AVG
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait COUNT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait COUNT_DISTINCT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait MAX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait MIN
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait NO_AGGREGATION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  @js.native
  sealed trait SUM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType
  
  /* 6 */ val AUTO: AUTO with scala.Double = js.native
  /* 0 */ val AVG: AVG with scala.Double = js.native
  /* 1 */ val COUNT: COUNT with scala.Double = js.native
  /* 2 */ val COUNT_DISTINCT: COUNT_DISTINCT with scala.Double = js.native
  /* 3 */ val MAX: MAX with scala.Double = js.native
  /* 4 */ val MIN: MIN with scala.Double = js.native
  /* 7 */ val NO_AGGREGATION: NO_AGGREGATION with scala.Double = js.native
  /* 5 */ val SUM: SUM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType with scala.Double
  ] = js.native
}

