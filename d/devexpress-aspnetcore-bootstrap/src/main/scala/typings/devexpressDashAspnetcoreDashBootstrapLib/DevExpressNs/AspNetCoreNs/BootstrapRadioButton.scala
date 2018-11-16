package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapRadioButton")
@js.native
class BootstrapRadioButton () extends BootstrapClientEdit {
  def getCheckState(): java.lang.String = js.native
  def getChecked(): scala.Boolean = js.native
  def getText(): java.lang.String = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged
  ): this.type = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_checkedChanged(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], scala.Unit]
  ): this.type = js.native
  def setCheckState(checkState: java.lang.String): scala.Unit = js.native
  def setChecked(isChecked: scala.Boolean): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
}

