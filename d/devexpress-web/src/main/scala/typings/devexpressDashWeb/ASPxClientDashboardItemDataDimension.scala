package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the dimension metadata.
  */
trait ASPxClientDashboardItemDataDimension extends js.Object {
  /**
    * Gets the data member identifier for the current dimension.
    * Value: A string value that identifies a data member.
    */
  var DataMember: String
  /**
    * Gets the group interval for date-time values for the current dimension.
    * Value: A string value that represents how date-time values are grouped.
    */
  var DateTimeGroupInterval: String
  /**
    * Gets the dimension identifier.
    * Value: A string value that is the dimension identifier.
    */
  var Id: String
  /**
    * Gets or sets the name of the dimension.
    * Value: A string value that is the name of the dimension.
    */
  var Name: String
  /**
    * Gets the group interval for string values.
    * Value: A string value that specifies the group interval for string values.
    */
  var TextGroupInterval: String
  /**
    * Formats the specified value using format settings of the current dimension.
    * @param value A value to be formatted.
    */
  def Format(value: js.Object): String
}

object ASPxClientDashboardItemDataDimension {
  @scala.inline
  def apply(
    DataMember: String,
    DateTimeGroupInterval: String,
    Format: js.Object => String,
    Id: String,
    Name: String,
    TextGroupInterval: String
  ): ASPxClientDashboardItemDataDimension = {
    val __obj = js.Dynamic.literal(DataMember = DataMember, DateTimeGroupInterval = DateTimeGroupInterval, Format = js.Any.fromFunction1(Format), Id = Id, Name = Name, TextGroupInterval = TextGroupInterval)
  
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimension]
  }
}

