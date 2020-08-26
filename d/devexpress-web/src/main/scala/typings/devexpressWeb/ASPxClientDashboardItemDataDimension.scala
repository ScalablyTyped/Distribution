package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the dimension metadata.
  */
@js.native
trait ASPxClientDashboardItemDataDimension extends js.Object {
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String = js.native
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String = js.native
  /**
    * Gets the dimension identifier.
    */
  var Id: String = js.native
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String = js.native
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String = js.native
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
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
  @scala.inline
  implicit class ASPxClientDashboardItemDataDimensionOps[Self <: ASPxClientDashboardItemDataDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataMember(value: String): Self = this.set("DataMember", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTimeGroupInterval(value: String): Self = this.set("DateTimeGroupInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: js.Any => String): Self = this.set("Format", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextGroupInterval(value: String): Self = this.set("TextGroupInterval", value.asInstanceOf[js.Any])
  }
  
}

