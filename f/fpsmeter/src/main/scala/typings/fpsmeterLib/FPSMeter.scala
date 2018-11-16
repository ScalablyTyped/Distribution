package typings
package fpsmeterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FPSMeter")
@js.native
class FPSMeter () extends js.Object {
  def this(anchor: stdLib.HTMLElement) = this()
  def this(anchor: stdLib.HTMLElement, options: FPSMeterOptions) = this()
  var options: FPSMeterOptions = js.native
  def destroy(): scala.Unit = js.native
  def hide(): FPSMeter = js.native
  def pause(): FPSMeter = js.native
  def resume(): FPSMeter = js.native
  def set(name: java.lang.String, value: js.Any): FPSMeter = js.native
  def show(): FPSMeter = js.native
  def showDuration(): FPSMeter = js.native
  def showFps(): FPSMeter = js.native
  def tick(): scala.Unit = js.native
  def tickStart(): scala.Unit = js.native
  def toggle(): FPSMeter = js.native
}

