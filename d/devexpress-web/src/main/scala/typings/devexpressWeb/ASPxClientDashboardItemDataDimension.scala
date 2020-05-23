package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the dimension metadata.
  */
trait ASPxClientDashboardItemDataDimension extends js.Object {
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String
  /**
    * Gets the dimension identifier.
    */
  var Id: String
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String
}

object ASPxClientDashboardItemDataDimension {
  @scala.inline
  def apply(
    DataMember: String,
    DateTimeGroupInterval: String,
    Format: js.Any => String,
    Id: String,
    Name: String,
    TextGroupInterval: String
  ): ASPxClientDashboardItemDataDimension = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], DateTimeGroupInterval = DateTimeGroupInterval.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TextGroupInterval = TextGroupInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimension]
  }
}

