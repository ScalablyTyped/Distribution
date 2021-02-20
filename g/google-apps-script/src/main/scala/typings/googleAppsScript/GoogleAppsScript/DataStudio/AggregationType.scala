package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregationType extends StObject
/**
  * An enum that defines the aggregation types that can be set for a Field.
  */
@JSGlobal("GoogleAppsScript.Data_Studio.AggregationType")
@js.native
object AggregationType extends StObject {
  
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
}
