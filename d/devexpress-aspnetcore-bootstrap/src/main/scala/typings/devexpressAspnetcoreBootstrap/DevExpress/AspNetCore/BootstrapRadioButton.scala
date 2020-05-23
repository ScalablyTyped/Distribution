package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.checkedChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapRadioButton extends BootstrapClientEdit {
  def getCheckState(): String = js.native
  def getChecked(): Boolean = js.native
  def getText(): String = js.native
  @JSName("off")
  def off_checkedChanged(eventName: checkedChanged): this.type = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  def setCheckState(checkState: String): Unit = js.native
  def setChecked(isChecked: Boolean): Unit = js.native
  def setText(text: String): Unit = js.native
}

