package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapGridBase")
@js.native
class BootstrapGridBase () extends Control {
  def getToolbar(index: scala.Double): BootstrapMenu | scala.Null = js.native
  def getToolbarByName(name: java.lang.String): BootstrapMenu | scala.Null = js.native
  @JSName("off")
  def off_toolbarItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.toolbarItemClick
  ): this.type = js.native
  @JSName("off")
  def off_toolbarItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.toolbarItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridToolbarItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_toolbarItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.toolbarItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridToolbarItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_toolbarItemClick(
    eventName: devexpressDashAspnetcoreDashBootstrapLib.devexpressDashAspnetcoreDashBootstrapLibStrings.toolbarItemClick,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[GridToolbarItemClickEventArgs], 
      scala.Unit
    ]
  ): this.type = js.native
}

