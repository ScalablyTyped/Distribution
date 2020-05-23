package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.activeTabChanged
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.activeTabChanging
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.beginCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.callbackError
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.endCallback
import typings.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.tabClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapTabControl extends Control {
  def adjustSize(): Unit = js.native
  def getActiveTab(): BootstrapTab | Null = js.native
  def getActiveTabIndex(): Double = js.native
  def getTab(index: Double): BootstrapTab | Null = js.native
  def getTabByName(name: String): BootstrapTab | Null = js.native
  def getTabCount(): Double = js.native
  @JSName("off")
  def off_activeTabChanged(eventName: activeTabChanged): this.type = js.native
  @JSName("off")
  def off_activeTabChanged(
    eventName: activeTabChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_activeTabChanging(eventName: activeTabChanging): this.type = js.native
  @JSName("off")
  def off_activeTabChanging(
    eventName: activeTabChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_beginCallback(eventName: beginCallback): this.type = js.native
  @JSName("off")
  def off_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_callbackError(eventName: callbackError): this.type = js.native
  @JSName("off")
  def off_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_tabClick(eventName: tabClick): this.type = js.native
  @JSName("off")
  def off_tabClick(
    eventName: tabClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeTabChanged(
    eventName: activeTabChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_activeTabChanging(
    eventName: activeTabChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tabClick(
    eventName: tabClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeTabChanged(
    eventName: activeTabChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_activeTabChanging(
    eventName: activeTabChanging,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabCancelEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_beginCallback(
    eventName: beginCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[BeginCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_callbackError(
    eventName: callbackError,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[CallbackErrorEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_tabClick(
    eventName: tabClick,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[TabControlTabClickEventArgs], Unit]
  ): this.type = js.native
  def setActiveTab(tab: BootstrapTab): Unit = js.native
  def setActiveTabIndex(index: Double): Unit = js.native
}

