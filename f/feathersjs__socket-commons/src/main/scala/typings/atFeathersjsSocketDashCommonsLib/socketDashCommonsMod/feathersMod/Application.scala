package typings
package atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  def channel(names: java.lang.String*): atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.feathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel | js.Array[atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel] | scala.Unit
    ]
  ): Application[ServiceTypes] = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    event: java.lang.String,
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.feathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel | js.Array[atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel] | scala.Unit
    ]
  ): Application[ServiceTypes] = js.native
}

