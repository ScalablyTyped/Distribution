package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationType extends js.Object

@JSGlobal("GoogleAppsScript.Data_Studio.AggregationType")
@js.native
object AggregationType extends js.Object {
  @js.native
  sealed trait AUTO extends AggregationType
  
  @js.native
  sealed trait AVG extends AggregationType
  
  @js.native
  sealed trait COUNT extends AggregationType
  
  @js.native
  sealed trait COUNT_DISTINCT extends AggregationType
  
  @js.native
  sealed trait MAX extends AggregationType
  
  @js.native
  sealed trait MIN extends AggregationType
  
  @js.native
  sealed trait NO_AGGREGATION extends AggregationType
  
  @js.native
  sealed trait SUM extends AggregationType
  
  /* 6 */ val AUTO: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.AUTO with Double = js.native
  /* 0 */ val AVG: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.AVG with Double = js.native
  /* 1 */ val COUNT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.COUNT with Double = js.native
  /* 2 */ val COUNT_DISTINCT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.COUNT_DISTINCT with Double = js.native
  /* 3 */ val MAX: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.MAX with Double = js.native
  /* 4 */ val MIN: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.MIN with Double = js.native
  /* 7 */ val NO_AGGREGATION: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.NO_AGGREGATION with Double = js.native
  /* 5 */ val SUM: typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs.AggregationType.SUM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
}

