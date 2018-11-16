package typings
package diagnosticDashChannelLib.diagnosticDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChannel extends js.Object {
  def addContextPreservation[T /* <: js.Function */](preserver: js.Function1[/* cb */ T, T]): scala.Unit = js.native
  def bindToContext[T /* <: js.Function */](cb: T): T = js.native
  def publish[T](name: java.lang.String, event: T): scala.Unit = js.native
  def registerMonkeyPatch(
    packageName: java.lang.String,
    patcher: diagnosticDashChannelLib.distSrcPatchRequireMod.IModulePatcher
  ): scala.Unit = js.native
  def shouldPublish(name: java.lang.String): scala.Boolean = js.native
  def subscribe[T](name: java.lang.String, listener: ISubscriber[T]): scala.Unit = js.native
  def subscribe[T](name: java.lang.String, listener: ISubscriber[T], filter: IFilter): scala.Unit = js.native
  def unsubscribe[T](name: java.lang.String, listener: ISubscriber[T]): scala.Unit = js.native
  def unsubscribe[T](name: java.lang.String, listener: ISubscriber[T], filter: IFilter): scala.Unit = js.native
}

