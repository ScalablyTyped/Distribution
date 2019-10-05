package typings.echarts.echarts.EChartOption.Legend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageIcons extends js.Object {
  /**
    * The icons of page buttons when legend.orient is 'horizontal'.
    * It should be an array, [previous page button, next page button], ['M0,0L12,-10L12,10z', 'M0,0L-12,-10L-12,10z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.horizontal
    */
  var horizontal: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The icons of page buttons when legend.orient is 'vertical'.
    * It should be an array, [previous page button, next page button], ['M0,0L20,0L10,-20z', 'M0,0L20,0L10,20z'] by default.
    *
    * @see https://echarts.apache.org/en/option.html#legend.pageIcons.vertical
    */
  var vertical: js.UndefOr[js.Array[String]] = js.undefined
}

object PageIcons {
  @scala.inline
  def apply(horizontal: js.Array[String] = null, vertical: js.Array[String] = null): PageIcons = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PageIcons]
  }
}

