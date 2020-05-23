package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the RegressionLine class.
  */
@JSGlobal("ASPxClientRegressionLine")
@js.native
class ASPxClientRegressionLine ()
  extends typings.devexpressWeb.ASPxClientSingleLevelIndicator {
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets the name of the chart element.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Gets the indicator's associated series.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
  /**
    * Gets a value specifying the value level to which the single-level indicator corresponds.
    */
  /* CompleteClass */
  override var valueLevel: String = js.native
}

