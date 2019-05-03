package typings
package atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application[ServiceTypes] extends js.Object {
  var channels: js.Array[java.lang.String] = js.native
  def channel(name: js.Array[java.lang.String]): atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel = js.native
  def channel(names: java.lang.String*): atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.atFeathersjsFeathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel | js.Array[atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel] | scala.Unit
    ]
  ): Application[ServiceTypes] = js.native
  // tslint:disable-next-line void-return
  def publish[T](
    event: java.lang.String,
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.atFeathersjsFeathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel | js.Array[atFeathersjsSocketDashCommonsLib.atFeathersjsSocketDashCommonsMod.Channel] | scala.Unit
    ]
  ): Application[ServiceTypes] = js.native
}

