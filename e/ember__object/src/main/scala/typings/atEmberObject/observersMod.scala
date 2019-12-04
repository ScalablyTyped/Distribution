package typings.atEmberObject

import typings.atEmberObject.dashPrivateTypesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/observers", JSImport.Namespace)
@js.native
object observersMod extends js.Object {
  def addObserver[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): Unit = js.native
  def addObserver[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): Unit = js.native
  def removeObserver[Context](obj: Context, key: String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def removeObserver[Context, Target](obj: Context, key: String, target: Target, method: ObserverMethod[Target, Context]): js.Any = js.native
}

