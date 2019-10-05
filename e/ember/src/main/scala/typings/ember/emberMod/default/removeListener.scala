package typings.ember.emberMod.default

import typings.atEmberObject.dashPrivateTypesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "removeListener")
@js.native
object removeListener extends js.Object {
  def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
}

