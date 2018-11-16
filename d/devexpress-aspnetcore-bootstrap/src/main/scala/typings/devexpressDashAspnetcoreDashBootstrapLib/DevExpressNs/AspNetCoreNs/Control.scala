package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.Control")
@js.native
class Control protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  val name: java.lang.String = js.native
  def adjustControl(): scala.Unit = js.native
  def getHeight(): scala.Double = js.native
  def getMainElement(): js.Any = js.native
  def getParentControl(): js.Any = js.native
  def getVisible(): scala.Boolean = js.native
  def getWidth(): scala.Double = js.native
  def inCallback(): scala.Boolean = js.native
  def off(): this.type = js.native
   // tslint:disable-line:no-unnecessary-generics
  @JSName("off")
  def off_init(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.init
  ): this.type = js.native
   // tslint:disable-line:unified-signatures no-unnecessary-generics
  @JSName("off")
  def off_init(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_init(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_init(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], scala.Unit]
  ): this.type = js.native
  def sendMessageToAssistiveTechnology(message: java.lang.String): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
}

