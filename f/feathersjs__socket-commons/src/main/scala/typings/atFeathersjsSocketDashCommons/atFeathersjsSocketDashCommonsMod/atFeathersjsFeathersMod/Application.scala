package typings.atFeathersjsSocketDashCommons.atFeathersjsSocketDashCommonsMod.atFeathersjsFeathersMod

import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.HookContext
import typings.atFeathersjsSocketDashCommons.atFeathersjsSocketDashCommonsMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var channels: js.Array[String] = js.native
  def channel(name: js.Array[String]): Channel = js.native
  def channel(names: String*): Channel = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
  ): Application[ServiceTypes] = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    event: String,
    callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
  ): Application[ServiceTypes] = js.native
}

