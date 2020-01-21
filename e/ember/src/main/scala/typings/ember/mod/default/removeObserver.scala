package typings.ember.mod.default

import typings.emberObject.typesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "removeObserver")
@js.native
object removeObserver extends js.Object {
  def apply[Context](obj: Context, key: java.lang.String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def apply[Context, Target](obj: Context, key: java.lang.String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
}

