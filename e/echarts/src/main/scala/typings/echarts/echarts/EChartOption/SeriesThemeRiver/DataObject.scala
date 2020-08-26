package typings.echarts.echarts.EChartOption.SeriesThemeRiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataObject extends js.Object {
  /**
    * the time attribute of time and theme.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.data.date
    */
  var date: js.UndefOr[String] = js.native
  /**
    * the name of an event or theme.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-themeRiver.themeRiver.data)
    *
    * **data specification:**
    *
    * As what is shown above, the data format of theme river is
    * double dimensional array.
    * Each item of the inner array consists of the time attribute
    * , the value at a time point and the name of an event or theme.
    * It needs to be noticed that you should provide an event or
    * theme with a complete time quantum as main river.
    * Other events and themes are based on the main river.
    * The default value of time point should be set as 0.
    * That is to say other events or themes are included in the
    * main river.
    * Once they are beyond the main river, the layout would be
    * wrong.
    * That is because a baseline should be calculated to draw each
    * event as ribbon shape when the whole diagram layout is calculated.
    * As the example above, the event "SS" is a main river.
    * After dispose, we would complete these 3 default time points
    * with the format of \["2015/11/08",0,"DQ"\], \["2015/11/12",0,"DQ"\],
    * ［"2015/11/13",0,"DQ"］, making it align with the main river.
    * From what is mentioned, we could set default value on any
    * position of a complete time period.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.data.name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * the value of an event or theme at a time point.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-themeRiver.data.value
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
}

object DataObject {
  @scala.inline
  def apply(): DataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataObject]
  }
  @scala.inline
  implicit class DataObjectOps[Self <: DataObject] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

