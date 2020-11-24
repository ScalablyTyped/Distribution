package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Position extends js.Object {
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.emphasis
    */
  var emphasis: js.UndefOr[Formatter] = js.native
  
  /**
    * Data label formatter, which supports string template
    * and callback function.
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
    * for example,`{@product}`refers the value of`'product'\`
    * dimension。
    * + `{@[n]}: the value of a dimension at the index
    * of`n`, for example,`{@\[3\]}\` refers the value
    * at dimensions\[3\].
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
    * where `params` is the single dataset needed by
    * formatter, which is formed as:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.label)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.formatter
    */
  var formatter: js.UndefOr[js.Function | String] = js.native
  
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
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.position
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Whether show label or not.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.label.show
    */
  var show: js.UndefOr[Boolean] = js.native
}
object Position {
  
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
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
    def setEmphasis(value: Formatter): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    
    @scala.inline
    def setFormatter(value: js.Function | String): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
