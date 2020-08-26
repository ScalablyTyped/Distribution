package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyRequest extends js.Object {
  /**
    * Maximal number of calendars for which FreeBusy information is to be
    * provided. Optional. Maximum value is 50.
    */
  var calendarExpansionMax: js.UndefOr[Double] = js.native
  /**
    * Maximal number of calendar identifiers to be provided for a single group.
    * Optional. An error is returned for a group with more members than this
    * value. Maximum value is 100.
    */
  var groupExpansionMax: js.UndefOr[Double] = js.native
  /**
    * List of calendars and/or groups to query.
    */
  var items: js.UndefOr[js.Array[SchemaFreeBusyRequestItem]] = js.native
  /**
    * The end of the interval for the query formatted as per RFC3339.
    */
  var timeMax: js.UndefOr[String] = js.native
  /**
    * The start of the interval for the query formatted as per RFC3339.
    */
  var timeMin: js.UndefOr[String] = js.native
  /**
    * Time zone used in the response. Optional. The default is UTC.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object SchemaFreeBusyRequest {
  @scala.inline
  def apply(): SchemaFreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeBusyRequest]
  }
  @scala.inline
  implicit class SchemaFreeBusyRequestOps[Self <: SchemaFreeBusyRequest] (val x: Self) extends AnyVal {
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
    def setCalendarExpansionMax(value: Double): Self = this.set("calendarExpansionMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarExpansionMax: Self = this.set("calendarExpansionMax", js.undefined)
    @scala.inline
    def setGroupExpansionMax(value: Double): Self = this.set("groupExpansionMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupExpansionMax: Self = this.set("groupExpansionMax", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaFreeBusyRequestItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaFreeBusyRequestItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

