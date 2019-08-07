package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the measure metadata.
  */
@JSGlobal("ASPxClientDashboardItemDataMeasure")
@js.native
class ASPxClientDashboardItemDataMeasure () extends js.Object {
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    */
  var DataMember: String = js.native
  /**
    * Gets the measure identifier.
    */
  var Id: String = js.native
  /**
    * Gets the name of the measure.
    */
  var Name: String = js.native
  /**
    * Gets the type of summary function calculated against the current measure.
    */
  var SummaryType: String = js.native
  /**
    * Formats the specified value using format settings of the current measure. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
}

