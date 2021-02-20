package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatchMod {
  
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(origin: String, event: String): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(
    origin: String,
    event: String,
    data: js.UndefOr[scala.Nothing],
    reply: js.UndefOr[scala.Nothing],
    e: MessageEvent[_]
  ): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(origin: String, event: String, data: js.UndefOr[scala.Nothing], reply: FramebusSubscribeHandler): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(
    origin: String,
    event: String,
    data: js.UndefOr[scala.Nothing],
    reply: FramebusSubscribeHandler,
    e: MessageEvent[_]
  ): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: js.UndefOr[scala.Nothing],
    e: MessageEvent[_]
  ): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): Unit = js.native
  @JSImport("framebus/dist/lib/dispatch", "dispatch")
  @js.native
  def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: FramebusSubscribeHandler,
    e: MessageEvent[_]
  ): Unit = js.native
}
