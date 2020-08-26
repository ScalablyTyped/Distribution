package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the measure metadata.
  */
@js.native
trait ASPxClientDashboardItemDataMeasure extends js.Object {
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

object ASPxClientDashboardItemDataMeasure {
  @scala.inline
  def apply(DataMember: String, Format: js.Any => String, Id: String, Name: String, SummaryType: String): ASPxClientDashboardItemDataMeasure = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SummaryType = SummaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasure]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemDataMeasureOps[Self <: ASPxClientDashboardItemDataMeasure] (val x: Self) extends AnyVal {
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
    def setFormat(value: js.Any => String): Self = this.set("Format", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummaryType(value: String): Self = this.set("SummaryType", value.asInstanceOf[js.Any])
  }
  
}

