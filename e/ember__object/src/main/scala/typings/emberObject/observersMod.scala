package typings.emberObject

import typings.emberObject.typesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/observers", JSImport.Namespace)
@js.native
object observersMod extends js.Object {
  def addObserver[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): Unit = js.native
  def addObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  def removeObserver[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def removeObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): js.Any = js.native
}

