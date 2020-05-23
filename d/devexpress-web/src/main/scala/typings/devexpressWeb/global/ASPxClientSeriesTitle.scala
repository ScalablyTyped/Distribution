package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the SeriesTitle class.
  */
@JSGlobal("ASPxClientSeriesTitle")
@js.native
class ASPxClientSeriesTitle ()
  extends typings.devexpressWeb.ASPxClientSeriesTitle {
  /**
    * Gets the alignment of the title.
    */
  /* CompleteClass */
  override var alignment: String = js.native
  /**
    * Gets the chart that owns the current chart element.
    */
  /* CompleteClass */
  override var chart: typings.devexpressWeb.ASPxClientWebChart = js.native
  /**
    * Gets a value that specifies to which edges of a parent element the title should be docked.
    */
  /* CompleteClass */
  override var dock: String = js.native
  /**
    * Gets the lines of text within a title.
    */
  /* CompleteClass */
  override var lines: js.Array[String] = js.native
  /**
    * Gets the series that owns the current title object.
    */
  /* CompleteClass */
  override var series: typings.devexpressWeb.ASPxClientSeries = js.native
}

