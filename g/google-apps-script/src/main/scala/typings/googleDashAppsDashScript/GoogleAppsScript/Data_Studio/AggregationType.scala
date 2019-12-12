package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.AUTO
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.AVG
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.COUNT
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.COUNT_DISTINCT
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.MAX
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.MIN
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.NO_AGGREGATION
import typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio.AggregationType.SUM
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
  /* 6 */ @js.native
  object AUTO extends TopLevel[AUTO with Double]
  
  /* 0 */ @js.native
  object AVG extends TopLevel[AVG with Double]
  
  /* 1 */ @js.native
  object COUNT extends TopLevel[COUNT with Double]
  
  /* 2 */ @js.native
  object COUNT_DISTINCT extends TopLevel[COUNT_DISTINCT with Double]
  
  /* 3 */ @js.native
  object MAX extends TopLevel[MAX with Double]
  
  /* 4 */ @js.native
  object MIN extends TopLevel[MIN with Double]
  
  /* 7 */ @js.native
  object NO_AGGREGATION extends TopLevel[NO_AGGREGATION with Double]
  
  /* 5 */ @js.native
  object SUM extends TopLevel[SUM with Double]
  
}

