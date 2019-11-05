package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationType extends js.Object

/**
  * An enum that defines the aggregation types that can be set for a Field.
  */
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
  
  /* 6 */ val AUTO: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.AUTO with Double = js.native
  /* 0 */ val AVG: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.AVG with Double = js.native
  /* 1 */ val COUNT: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.COUNT with Double = js.native
  /* 2 */ val COUNT_DISTINCT: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.COUNT_DISTINCT with Double = js.native
  /* 3 */ val MAX: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.MAX with Double = js.native
  /* 4 */ val MIN: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.MIN with Double = js.native
  /* 7 */ val NO_AGGREGATION: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.NO_AGGREGATION with Double = js.native
  /* 5 */ val SUM: typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.SUM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
}

