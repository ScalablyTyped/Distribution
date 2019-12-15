package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Formatter extends js.Object {
  /**
    * Data label formatter, which supports string
    * template and callback function.
    * In either form, `\n` is supported to represent
    * a new line.
    *
    * **String template**
    *
    * Model variation includes:
    *
    * + `{a}`: series name.
    * + `{b}`: the name of a data item.
    * + `{c}`: the value of a data item.
    * + `{d}`: the percent.
    * + `{@xxx}: the value of a dimension named`'xxx'`,
    * for example,`{@product}`refers the value
    * of`'product'\` dimension。
    * + `{@[n]}: the value of a dimension at the
    * index of`n`, for example,`{@\[3\]}\` refers
    * the value at dimensions\[3\].
    *
    * **example:**
    *
    * ```
    * formatter: '{b}: {d}'
    *
    * ```
    *
    * **Callback function**
    *
    * Callback function is in form of:
    *
    * ```
    * (params: Object|Array) => string
    *
    * ```
    *
    * where `params` is the single dataset needed
    * by formatter, which is formed as:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.label.emphasis)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.emphasis.formatter
    */
  var formatter: js.UndefOr[js.Function | String] = js.undefined
  /**
    * Positions of labels can be:
    *
    * + `'start'` starting point of the line.
    * + `'middle'` middle point of the line.
    * + `'end'` ending point of the line.
    *
    *
    * @default
    * "end"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.emphasis.position
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Whether show label or not.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.emphasis.show
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_Formatter {
  @scala.inline
  def apply(
    formatter: js.Function | String = null,
    position: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): Anon_Formatter = {
    val __obj = js.Dynamic.literal()
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Formatter]
  }
}

