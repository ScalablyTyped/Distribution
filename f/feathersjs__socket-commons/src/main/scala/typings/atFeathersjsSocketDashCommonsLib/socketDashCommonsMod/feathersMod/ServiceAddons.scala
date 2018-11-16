package typings
package atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAddons[T] extends js.Object {
  def publish(
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.feathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel
    ]
  ): this.type = js.native
  def publish(
    event: java.lang.String,
    callback: js.Function2[
      /* data */ T, 
      /* hook */ atFeathersjsFeathersLib.feathersMod.HookContext[T], 
      atFeathersjsSocketDashCommonsLib.socketDashCommonsMod.Channel
    ]
  ): this.type = js.native
}

