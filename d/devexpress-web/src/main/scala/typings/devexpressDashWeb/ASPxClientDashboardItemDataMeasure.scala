package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the measure metadata.
  */
trait ASPxClientDashboardItemDataMeasure extends js.Object {
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    * Value: A string value that identifies the data source list used to provide data for the current measure.
    */
  var DataMember: String
  /**
    * Gets the measure identifier.
    * Value: A string value that is the measure identifier.
    */
  var Id: String
  /**
    * Gets the name of the measure.
    * Value: A string value that is the name of the measure.
    */
  var Name: String
  /**
    * Gets the type of summary function calculated against the current measure.
    * Value: A string value that identifies the type of summary function calculated against the current measure.
    */
  var SummaryType: String
  /**
    * Formats the specified value using format settings of the current measure.
    * @param value A value to be formatted.
    */
  def Format(value: js.Object): String
}

object ASPxClientDashboardItemDataMeasure {
  @scala.inline
  def apply(DataMember: String, Format: js.Object => String, Id: String, Name: String, SummaryType: String): ASPxClientDashboardItemDataMeasure = {
    val __obj = js.Dynamic.literal(DataMember = DataMember, Format = js.Any.fromFunction1(Format), Id = Id, Name = Name, SummaryType = SummaryType)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasure]
  }
}

