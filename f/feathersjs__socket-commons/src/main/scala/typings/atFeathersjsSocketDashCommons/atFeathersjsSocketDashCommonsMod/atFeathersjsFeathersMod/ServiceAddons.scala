package typings.atFeathersjsSocketDashCommons.atFeathersjsSocketDashCommonsMod.atFeathersjsFeathersMod

import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.HookContext
import typings.atFeathersjsSocketDashCommons.atFeathersjsSocketDashCommonsMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAddons[T] extends js.Object {
  def publish(
    callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
  ): this.type = js.native
  def publish(
    event: String,
    callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
  ): this.type = js.native
}

