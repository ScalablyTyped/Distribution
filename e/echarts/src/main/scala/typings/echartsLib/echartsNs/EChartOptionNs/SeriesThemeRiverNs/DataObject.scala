package typings
package echartsLib.echartsNs.EChartOptionNs.SeriesThemeRiverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObject extends js.Object {
  /**
    * the time attribute of time and theme.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.data.date
    */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the name of an event or theme.
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.themeRiver.data)
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.data.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the value of an event or theme at a time point.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-themeRiver.data.value
    */
  var value: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object DataObject {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    name: java.lang.String = null,
    value: scala.Double | js.Array[scala.Double] = null
  ): DataObject = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObject]
  }
}

