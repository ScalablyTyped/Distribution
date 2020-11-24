package typings.emberObject

import typings.emberObject.typesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/object/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  
  def addListener[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): Unit = js.native
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context],
    once: Boolean
  ): Unit = js.native
  
  def removeListener[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): js.Any = js.native
  def removeListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): js.Any = js.native
  
  def sendEvent(obj: js.Any, eventName: String): Boolean = js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.UndefOr[scala.Nothing], actions: js.Array[_]): Boolean = js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.Array[_]): Boolean = js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.Array[_], actions: js.Array[_]): Boolean = js.native
}
