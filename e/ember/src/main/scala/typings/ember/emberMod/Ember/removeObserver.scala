package typings.ember.emberMod.Ember

import typings.atEmberObject.dashPrivateTypesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.removeObserver")
@js.native
object removeObserver extends js.Object {
  def apply[Context](obj: Context, key: java.lang.String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def apply[Context, Target](obj: Context, key: java.lang.String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
}

