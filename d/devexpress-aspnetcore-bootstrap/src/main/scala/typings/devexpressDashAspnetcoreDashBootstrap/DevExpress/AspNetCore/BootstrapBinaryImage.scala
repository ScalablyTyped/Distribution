package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.beginCallback
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.callbackError
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.click
import typings.devexpressDashAspnetcoreDashBootstrap.devexpressDashAspnetcoreDashBootstrapStrings.endCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapBinaryImage")
@js.native
class BootstrapBinaryImage () extends BootstrapClientEdit {
  def clear(): Unit = js.native
  def getUploadedFileName(): String = js.native
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
  def off_click(eventName: click): this.type = js.native
  @JSName("off")
  def off_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_endCallback(eventName: endCallback): this.type = js.native
  @JSName("off")
  def off_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
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
  def on_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
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
  def once_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditClickEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_endCallback(
    eventName: endCallback,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EndCallbackEventArgs], Unit]
  ): this.type = js.native
  def performCallback(data: js.Any): js.Promise[Unit] = js.native
  def performCallback(data: js.Any, onSuccess: js.Function0[Unit]): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

