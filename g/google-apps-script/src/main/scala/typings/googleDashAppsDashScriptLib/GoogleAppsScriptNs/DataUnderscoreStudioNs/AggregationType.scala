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
  
  val AVG: AVG with java.lang.String = js.native
  val COUNT: COUNT with java.lang.String = js.native
  val COUNT_DISTINCT: COUNT_DISTINCT with java.lang.String = js.native
  val MAX: MAX with java.lang.String = js.native
  val MIN: MIN with java.lang.String = js.native
  val NO_AGGREGATION: NO_AGGREGATION with java.lang.String = js.native
  val SUM: SUM with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType with java.lang.String
  ] = js.native
}

