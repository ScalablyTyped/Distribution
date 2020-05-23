package typings.gaugejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseGauge extends ValueUpdater {
  /**
    * Sets the minimum gauge value (prefer over gauge.minValue)
    * @param minValue
    */
  def setMinValue(minValue: Double): js.UndefOr[js.Array[Double]] = js.native
  /**
    * Configure the gauge renderer with the given options.
    * @param options The configuration options for the gauge.
    */
  def setOptions(): this.type = js.native
  def setOptions(options: GaugeOptions): this.type = js.native
  /**
    * ?
    * @param textField
    */
  def setTextField(textField: TextRenderer): TextRenderer = js.native
  def setTextField(textField: TextRendererElement): TextRenderer = js.native
}

