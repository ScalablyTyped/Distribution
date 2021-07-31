package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.toolbarItemClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapGridBase
  extends StObject
     with Control {
  
  def getToolbar(index: Double): BootstrapMenu | Null = js.native
  
  def getToolbarByName(name: String): BootstrapMenu | Null = js.native
  
  def off(
    eventName: Unit,
    callback: js.ThisFunction1[/* this */ this.type, js.UndefOr[EventArgs | GridToolbarItemClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_toolbarItemClick(eventName: toolbarItemClick): this.type = js.native
  @JSName("off")
  def off_toolbarItemClick(
    eventName: toolbarItemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridToolbarItemClickEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_toolbarItemClick(
    eventName: toolbarItemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridToolbarItemClickEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_toolbarItemClick(
    eventName: toolbarItemClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[GridToolbarItemClickEventArgs], Unit]
  ): this.type = js.native
}
