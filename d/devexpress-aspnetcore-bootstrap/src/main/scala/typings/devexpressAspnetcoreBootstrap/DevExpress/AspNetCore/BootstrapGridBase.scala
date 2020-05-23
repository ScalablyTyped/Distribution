package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.toolbarItemClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapGridBase extends Control {
  def getToolbar(index: Double): BootstrapMenu | Null = js.native
  def getToolbarByName(name: String): BootstrapMenu | Null = js.native
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

