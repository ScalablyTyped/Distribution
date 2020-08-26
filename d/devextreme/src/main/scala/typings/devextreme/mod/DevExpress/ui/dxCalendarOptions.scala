package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Date
import typings.devextreme.anon.View
import typings.devextreme.devextremeNumbers.`0`
import typings.devextreme.devextremeNumbers.`1`
import typings.devextreme.devextremeNumbers.`2`
import typings.devextreme.devextremeNumbers.`3`
import typings.devextreme.devextremeNumbers.`4`
import typings.devextreme.devextremeNumbers.`5`
import typings.devextreme.devextremeNumbers.`6`
import typings.devextreme.devextremeStrings.century
import typings.devextreme.devextremeStrings.decade
import typings.devextreme.devextremeStrings.month
import typings.devextreme.devextremeStrings.year
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxCalendarOptions extends EditorOptions[dxCalendar] {
  /** @name dxCalendar.Options.cellTemplate */
  var cellTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ Date, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxCalendar.Options.dateSerializationFormat */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  /** @name dxCalendar.Options.disabledDates */
  var disabledDates: js.UndefOr[js.Array[typings.std.Date] | (js.Function1[/* data */ View, Boolean])] = js.native
  /** @name dxCalendar.Options.firstDayOfWeek */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  /** @name dxCalendar.Options.max */
  var max: js.UndefOr[typings.std.Date | Double | String] = js.native
  /** @name dxCalendar.Options.maxZoomLevel */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.native
  /** @name dxCalendar.Options.min */
  var min: js.UndefOr[typings.std.Date | Double | String] = js.native
  /** @name dxCalendar.Options.minZoomLevel */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.native
  /** @name dxCalendar.Options.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxCalendar.Options.showTodayButton */
  var showTodayButton: js.UndefOr[Boolean] = js.native
  /** @name dxCalendar.Options.value */
  @JSName("value")
  var value_dxCalendarOptions: js.UndefOr[typings.std.Date | Double | String] = js.native
  /** @name dxCalendar.Options.zoomLevel */
  var zoomLevel: js.UndefOr[century | decade | month | year] = js.native
}

object dxCalendarOptions {
  @scala.inline
  def apply(): dxCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCalendarOptions]
  }
  @scala.inline
  implicit class dxCalendarOptionsOps[Self <: dxCalendarOptions] (val x: Self) extends AnyVal {
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
    def setCellTemplateFunction3(
      value: (/* itemData */ Date, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("cellTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setCellTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ Date, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("cellTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellTemplate: Self = this.set("cellTemplate", js.undefined)
    @scala.inline
    def setDateSerializationFormat(value: String): Self = this.set("dateSerializationFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateSerializationFormat: Self = this.set("dateSerializationFormat", js.undefined)
    @scala.inline
    def setDisabledDatesVarargs(value: typings.std.Date*): Self = this.set("disabledDates", js.Array(value :_*))
    @scala.inline
    def setDisabledDatesFunction1(value: /* data */ View => Boolean): Self = this.set("disabledDates", js.Any.fromFunction1(value))
    @scala.inline
    def setDisabledDates(value: js.Array[typings.std.Date] | (js.Function1[/* data */ View, Boolean])): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setMax(value: typings.std.Date | Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxZoomLevel(value: century | decade | month | year): Self = this.set("maxZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoomLevel: Self = this.set("maxZoomLevel", js.undefined)
    @scala.inline
    def setMin(value: typings.std.Date | Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinZoomLevel(value: century | decade | month | year): Self = this.set("minZoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomLevel: Self = this.set("minZoomLevel", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    @scala.inline
    def setValue(value: typings.std.Date | Double | String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setZoomLevel(value: century | decade | month | year): Self = this.set("zoomLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomLevel: Self = this.set("zoomLevel", js.undefined)
  }
  
}

