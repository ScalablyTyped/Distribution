package typings.ember.emberMod.default

import typings.atEmberObject.dashPrivateTypesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "addObserver")
@js.native
object addObserver extends js.Object {
  def apply[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): Unit = js.native
  def apply[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): Unit = js.native
}

