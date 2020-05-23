package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapHyperLink extends Control {
  def getBadgeIconCssClass(): String = js.native
  def getBadgeText(): String = js.native
  def getCaption(): String = js.native
  def getEnabled(): Boolean = js.native
  def getNavigateUrl(): String = js.native
  def getText(): String = js.native
  def getValue(): js.Any = js.native
  @JSName("off")
  def off_click(eventName: click): this.type = js.native
  @JSName("off")
  def off_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  def setBadgeText(text: String): Unit = js.native
  def setCaption(caption: String): Unit = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def setNavigateUrl(url: String): Unit = js.native
  def setText(text: String): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
}

