package typings.diagnosticDashChannel.diagnosticDashChannelMod

import typings.diagnosticDashChannel.distSrcPatchRequireMod.IModulePatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChannel extends js.Object {
  def addContextPreservation[T /* <: js.Function */](preserver: js.Function1[/* cb */ T, T]): Unit = js.native
  def bindToContext[T /* <: js.Function */](cb: T): T = js.native
  def publish[T](name: String, event: T): Unit = js.native
  def registerMonkeyPatch(packageName: String, patcher: IModulePatcher): Unit = js.native
  def shouldPublish(name: String): Boolean = js.native
  def subscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
  def subscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
  def unsubscribe[T](name: String, listener: ISubscriber[T]): Unit = js.native
  def unsubscribe[T](name: String, listener: ISubscriber[T], filter: IFilter): Unit = js.native
}

