package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the measure metadata.
  */
trait ASPxClientDashboardItemDataMeasure extends js.Object {
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    */
  var DataMember: String
  /**
    * Gets the measure identifier.
    */
  var Id: String
  /**
    * Gets the name of the measure.
    */
  var Name: String
  /**
    * Gets the type of summary function calculated against the current measure.
    */
  var SummaryType: String
  /**
    * Formats the specified value using format settings of the current measure. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String
}

object ASPxClientDashboardItemDataMeasure {
  @scala.inline
  def apply(DataMember: String, Format: js.Any => String, Id: String, Name: String, SummaryType: String): ASPxClientDashboardItemDataMeasure = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SummaryType = SummaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasure]
  }
}

